import {Component, OnInit} from '@angular/core';
import {Observable} from 'rxjs';
import {DashboardDto} from '../dashboard-dto';
import {DashboardService} from '../dashboard.service';

@Component({
  selector: 'app-doctor',
  templateUrl: './doctor.component.html',
  styleUrls: ['./doctor.component.css']
})
export class DoctorComponent implements OnInit {

  doctorsAvailable = 1_000_000;
  doctorCapacity = 10;
  dashboardDto: Observable<DashboardDto>;

  constructor(private dashboardService: DashboardService) { }

  ngOnInit(): void {
    this.dashboardDto = this.dashboardService.getDashboardDto();
  }

}
