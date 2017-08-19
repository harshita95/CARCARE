import {Component} from "@angular/core";
import {Http,Headers,RequestOptions} from "@angular/http";

import {DataService} from "./dataService.service";
;
@Component({
    selector:'login-form',
    templateUrl:'../partials/home.component.html',
    styleUrls:['../css/home.component.css'],
})
export class HomeComponent{

    title:string ="Login Form"
    successMessage:string;
    errorMessage:string;
    email:String=null;
    password:String=null;


    constructor(private http:Http, private dataService : DataService) {
        console.log(this.dataService.getValue());

    }

    checkCustomer() {
        console.log("Inside checkCustomer()!!!!");
        let addUrl = "/rest/check/"+this.email+"/"+this.password;

        var requestHeaders = new Headers({'Content-Type': 'application/text'});
        var options = new RequestOptions({headers: requestHeaders});

        //this.car.logo = this.car.make + '-' + this.car.model + '.png';
        //this.http.post(addUrl,this.car,options).subscribe(res => this.successMessage = res.toString());
        this.http.post(addUrl, options).subscribe(
            res => {
                this.successMessage = res.toString();
                console.log("I am here"+res.text());
                this.errorMessage=""
                this.dataService.setValue(res.text());
            },
            error => {
                this.errorMessage = <any>error;
                this.successMessage = ""
            });
    }
}
