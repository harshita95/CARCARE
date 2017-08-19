import {Component} from "@angular/core";
import {Http,Headers,RequestOptions} from "@angular/http";

import {Customer} from "./customer";

import {BookAppointmentInfo} from "./bookAppointmentInfo";
import {DataService} from "./dataService.service";


@Component({
    selector:'appointmentForm',
    templateUrl:'../partials/appointment.component.html',
    styleUrls:['../css/appointment.component.css'],
})
export class BookAppointmentInfoComponent{

    title:string ="Book your Appointment";
    // service:Service;
    bookAppointmentInfo:BookAppointmentInfo;
    successMessage:string;
    errorMessage:string;
    appointmentId: number;
    customerId: number;
    carId: number;
    currentDate: Date
    firstSlot: boolean;
    secondSlot:boolean;
    thirdSlot: boolean;
    battery:string;
    ac:string;
    accidental:string;
    regular:string;
    washing:string;
    make:string;


    constructor(private http:Http,private dataService : DataService) {
        this.customerId=this.dataService.getValue();
        this.bookAppointmentInfo = new BookAppointmentInfo(this.customerId,this.make,this.currentDate,this.firstSlot,this.secondSlot,this.thirdSlot,this.battery,this.ac,this.accidental,this.regular,this.washing);
    }

    addServices() {
        console.log("Inside appointment()!!!!");
        console.log(this.bookAppointmentInfo.toString());

        let addUrl = "/rest/add/appointment";

        var requestHeaders = new Headers({'Content-Type': 'application/json'});
        var options = new RequestOptions({headers: requestHeaders});

        //this.car.logo = this.car.make + '-' + this.car.model + '.png';
        //this.http.post(addUrl,this.car,options).subscribe(res => this.successMessage = res.toString());
        this.http.post(addUrl, this.bookAppointmentInfo, options).subscribe(
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
