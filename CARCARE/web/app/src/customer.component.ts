import {Component} from "@angular/core";
import {Http,Headers,RequestOptions} from "@angular/http";

import {Customer} from "./customer";
import {DataService} from "./dataService.service";

@Component({
	selector:'customer-form',
    templateUrl:'../partials/signup.component.html',
    styleUrls:['../css/customer.component.css'],
})
export class CustomerComponent{

	title:string ="Sign-Up Form";
	customer:Customer;
	successMessage:string;
    errorMessage:string;


    constructor(private http:Http, private dataService : DataService) {
        this.customer = new Customer("harshita",12345,"hmarwah60","pune","123");
        console.log(this.dataService.getValue());
    }

    addCustomer() {
        console.log("Inside addCustomer()!!!!");
        let addUrl = "/rest/add";

        var requestHeaders = new Headers({'Content-Type': 'application/json'});
        var options = new RequestOptions({headers: requestHeaders});

        //this.car.logo = this.car.make + '-' + this.car.model + '.png';
        //this.http.post(addUrl,this.car,options).subscribe(res => this.successMessage = res.toString());
        this.http.post(addUrl, this.customer, options).subscribe(
            res => {
                this.successMessage = res.toString();
                console.log(res.text());
                this.errorMessage=""
            },
            error => {
                this.errorMessage = <any>error;
                this.successMessage = ""
            });
    }
}
