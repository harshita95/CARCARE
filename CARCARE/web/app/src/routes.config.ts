import { Routes,RouterModule } from '@angular/router';
import {AboutUsComponent} from "./aboutus.component";
import {ContactUsComponent} from "./contactus.component";
import {CricketComponent} from "./cricket.component";

import {MovieComponent} from "./movie.component";
import {CustomerComponent} from "./customer.component";
import {HomeComponent} from "./home.component";
import {BookAppointmentInfoComponent} from "./bookappointmentInfo.component";


let routes:Routes = [
    {path:'home',component:HomeComponent},

    {path:'customer',component:CustomerComponent},
    {path:'aboutus',component:AboutUsComponent},
    {path:'contactus',component:ContactUsComponent},
    {path:'appointment',component:BookAppointmentInfoComponent},
    // {path:'cricket',component:CricketComponent},
    // {path:'movie/:mid',component:MovieComponent},
    {path:'',redirectTo:'/home',pathMatch:'full' },
];

export const configuredRoutes = RouterModule.forRoot(routes);