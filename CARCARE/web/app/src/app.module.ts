import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import { HttpModule } from '@angular/http';

import {configuredRoutes} from './routes.config';


import {CustomerComponent} from './customer.component';
import {AppComponent} from "./app.component";
// import {CricketComponent} from "./cricket.component";
import {AboutUsComponent} from "./aboutus.component";
import {ContactUsComponent} from "./contactus.component";
import {HomeComponent} from "./home.component";
// import {MovieComponent} from "./movie.component";
import {DataService} from "./dataService.service";
import {BookAppointmentInfoComponent} from "./bookappointmentInfo.component";



@NgModule({
	imports:[BrowserModule,FormsModule,HttpModule,configuredRoutes],
	declarations:[CustomerComponent,AppComponent,HomeComponent,BookAppointmentInfoComponent,AboutUsComponent,ContactUsComponent],
	providers : [DataService],
   	bootstrap:[AppComponent]
})
export class AppModule{
}

