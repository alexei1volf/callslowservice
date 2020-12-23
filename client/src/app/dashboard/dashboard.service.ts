import {Injectable} from '@angular/core';
import {DashboardDto} from './dashboard-dto';
import {Subject} from 'rxjs';
import {IdentitySerializer, JsonSerializer, RSocketClient} from 'rsocket-core';
import RSocketWebSocketClient from 'rsocket-websocket-client';

@Injectable({
  providedIn: 'root'
})
export class DashboardService {

  dashboardDto = new Subject<DashboardDto>();

  constructor() {

    // Create an instance of a client
    const rSocketClient = new RSocketClient({
      serializers: {
        data: JsonSerializer,
        metadata: IdentitySerializer
      },
      setup: {
        // ms btw sending keepalive to server
        keepAlive: 60000,
        // ms timeout if no keepalive response
        lifetime: 180000,
        // format of `data`
        dataMimeType: 'application/json',
        // format of `metadata`
        metadataMimeType: 'message/x.rsocket.routing.v0',
      },
      transport: new RSocketWebSocketClient({
        url: 'ws://localhost:8080/rsocket'
      }),
    });


    // Open the connection
    rSocketClient.connect().subscribe({
      onComplete: socket => {
        // socket provides the rsocket interactions fire/forget, request/response,
        // request/stream, etc as well as methods to close the socket.
        socket
          .requestStream({
            data: null, // null is a must if it does not include a message payload, else the Spring server side will not be matched.
            metadata: String.fromCharCode('corona-dashboard'.length) + 'corona-dashboard'
          })
          .subscribe({
            onComplete: () => console.log('complete'),
            onError: error => {
              console.log('Connection has been closed due to:: ' + error);
            },
            onNext: payload => {
              console.log(payload);
              this.dashboardDto.next(payload.data);
            },
            onSubscribe: subscription => {
              subscription.request(1000000);
            },
          });

      }

    });
  }
}
