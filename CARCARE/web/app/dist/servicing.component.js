// import {Component} from "@angular/core";
// import {Http,Headers,RequestOptions} from "@angular/http";
//
// import {Customer} from "./customer";
// import {Service} from "./service";
//
// @Component({
// 	selector:'servicingForm',
//     templateUrl:'../partials/servicing.component.html',
//     //styleUrls:['../css/customer.component.css'],
// })
// export class ServicingComponent{
//
// 	title:string ="Add your Services";
// 	service:Service;
// 	successMessage:string;
//     errorMessage:string;
//     battery:string;
//     ac:string;
//     accidental:string;
//     regular:string;
//     washing:string;
//
//
//     constructor(private http:Http) {
//         this.service = new Service(this.battery,this.ac,this.accidental,this.regular,this.washing);
//     }
//
//     addServices() {
//         console.log("Inside addService()!!!!");
//         let addUrl = "/rest/add/services";
//
//         var requestHeaders = new Headers({'Content-Type': 'application/json'});
//         var options = new RequestOptions({headers: requestHeaders});
//
//         //this.car.logo = this.car.make + '-' + this.car.model + '.png';
//         //this.http.post(addUrl,this.car,options).subscribe(res => this.successMessage = res.toString());
//         this.http.post(addUrl, this.service, options).subscribe(
//             res => {
//                 this.successMessage = res.toString();
//                 console.log(res.text());
//                 this.errorMessage=""
//             },
//             error => {
//                 this.errorMessage = <any>error;
//                 this.successMessage = ""
//             });
//     }
// }
//# sourceMappingURL=servicing.component.js.map