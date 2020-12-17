import {Injectable} from '@angular/core';
import {DashboardDto} from './dashboard-dto';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DashboardService {

  constructor(private httpClient: HttpClient) { }

  getDashboardData(): Observable<DashboardDto> {
    return this.httpClient.get<DashboardDto>('http://localhost:8080/corona-dashboard');
  }
}
