import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {DashboardComponent} from './dashboard/dashboard.component';
import {VaccineComponent} from './dashboard/vaccine/vaccine.component';
import {HttpClientModule} from '@angular/common/http';
import {MatCardModule} from '@angular/material/card';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {DoctorComponent} from './dashboard/doctor/doctor.component';
import {HospitalComponent} from './dashboard/hospital/hospital.component';

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    VaccineComponent,
    DoctorComponent,
    HospitalComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    MatCardModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
