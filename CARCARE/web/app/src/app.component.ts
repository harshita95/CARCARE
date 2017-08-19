import {Component} from "@angular/core";

@Component({
	selector:'carcare-app',
    template:`<div>
        <h1>{{title}}</h1>
  
        <a routerLink="customer">Sign-Up</a>
        <a routerLink="aboutus">About Us</a>
        <!--<a routerLink="cricket">Cricket Page</a>-->
        <a routerLink="contactus">Contact Us</a>
        <a routerLink="appointment">book</a>
        <!--<a routerLink="movie/100">Movies 1</a>-->
        <!--<a routerLink="movie/101">Movies 2</a>-->
       	<router-outlet></router-outlet>      
    </div>`
})
export class AppComponent{

	title:string ="CAR-CARE";

}
