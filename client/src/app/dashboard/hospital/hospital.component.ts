import {Component, OnInit} from '@angular/core';
import {Observable} from 'rxjs';
import {DashboardDto} from '../dashboard-dto';
import {DashboardService} from '../dashboard.service';

@Component({
  selector: 'app-hospital',
  templateUrl: './hospital.component.html',
  styleUrls: ['./hospital.component.css']
})
export class HospitalComponent implements OnInit {

  hospitalsAvailable = 50_000;
  hospitalCapacity = 1_000;
  dashboardDto: Observable<DashboardDto>;

  constructor(private dashboardService: DashboardService) { }

  ngOnInit(): void {
    this.dashboardDto = this.dashboardService.getDashboardDto();
  }

}
