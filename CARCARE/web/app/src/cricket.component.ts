import {Component} from "@angular/core";
import { Router } from '@angular/router';

@Component({
	selector:'cricket',
    template:`<div>
        <h1>{{title}}</h1>
        <h2>{{summary}}</h2>
        <input type="button" value="Go Home" (click)="homePage();" />
    </div>`
})
export class CricketComponent{

	title:string ="Cricket Details";
    summary:string ="Cricket is good for health";

    constructor(private router:Router){}

    homePage(){
        //100 loc
        var homeLink = ['/home'];
        this.router.navigate(homeLink);
    }
}
