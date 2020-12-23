import {Component, OnInit} from '@angular/core';
import {DashboardService} from '../dashboard.service';
import {Observable} from 'rxjs';
import {DashboardDto} from '../dashboard-dto';

@Component({
  selector: 'app-vaccine',
  templateUrl: './vaccine.component.html',
  styleUrls: ['./vaccine.component.css']
})
export class VaccineComponent implements OnInit {

  vaccinesInStock = 70_000_000;
  dashboardDto: Observable<DashboardDto>;

  constructor(private dashboardService: DashboardService) { }

  ngOnInit(): void {
    this.dashboardDto = this.dashboardService.getDashboardDto();
  }

}
