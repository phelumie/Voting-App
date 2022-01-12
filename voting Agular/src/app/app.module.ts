import { RouterModule, Routes } from '@angular/router';
import { NoWhiteSpaceValidator } from './validator/no-white-space-validator';
import { MatIconModule } from '@angular/material/icon';
import { NgModule, Component } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './common/login/login.component';
import { VotingPageComponent } from './common/voting-page/voting-page.component';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { DashboardComponent } from './admin/dashboard/dashboard.component';


const route:Routes=[

  {path:'', component:LoginComponent},
  {path:'vote' , component:VotingPageComponent}
]
@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    VotingPageComponent,
    DashboardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatIconModule,
  ReactiveFormsModule,
  RouterModule,
  HttpClientModule
  ],
  providers: [NoWhiteSpaceValidator],
  bootstrap: [AppComponent]
})
export class AppModule { }
