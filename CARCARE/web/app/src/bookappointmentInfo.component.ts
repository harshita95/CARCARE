import {Component} from "@angular/core";
import {Http, Headers, RequestOptions} from "@angular/http";

import {Customer} from "./customer";

import {BookAppointmentInfo} from "./bookAppointmentInfo";
import {DataService} from "./dataService.service";


@Component({
    selector: 'appointmentForm',
    templateUrl: '../partials/appointment.component.html',
    styleUrls: ['../css/appointment.component.css'],
})
export class BookAppointmentInfoComponent {

    title: string = "Book your Appointment";
    // service:Service;
    bookAppointmentInfo: BookAppointmentInfo;
    successMessage: string;
    errorMessage: string;
    appointmentId: number;
    customerId: number;
    carId: number;
    currentDate: Date
    firstSlot: boolean;
    secondSlot: boolean;
    thirdSlot: boolean;
    battery: boolean=false;
    ac: boolean=false;
    accidental: boolean=false;
    regular: boolean=false;
    washing: boolean=false;
    make: string;

    slot: string;


    constructor(private http: Http, private dataService: DataService) {
        this.customerId = this.dataService.getValue();
        this.bookAppointmentInfo = new BookAppointmentInfo(this.customerId, this.make, this.currentDate, this.firstSlot, this.secondSlot, this.thirdSlot, this.battery, this.ac, this.accidental, this.regular, this.washing);
        this.bookAppointmentInfo.customerId=this.dataService.getValue();
        console.log("in book appointment "+this.dataService.getValue());
    }

    addServices() {

        this.bookAppointmentInfo.customerId = this.dataService.getValue();
        console.log("Inside appointment()!!!!" + this.dataService.getValue());
        console.log(this.bookAppointmentInfo.toString());

        if (this.slot == "9:00 to 12:00") {

            this.bookAppointmentInfo.firstSlot = true;
            this.bookAppointmentInfo.secondSlot = false;
            this.bookAppointmentInfo.thirdSlot = false;
        }

        if (this.slot == "12:00 to 3:00") {

            this.bookAppointmentInfo.firstSlot = false;
            this.bookAppointmentInfo.secondSlot = true;
            this.bookAppointmentInfo.thirdSlot = false;
        }
        if (this.slot == "3:00 to 6:00") {

            this.bookAppointmentInfo.firstSlot = false;
            this.bookAppointmentInfo.secondSlot = false;
            this.bookAppointmentInfo.thirdSlot = true;
        }
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
                this.errorMessage = ""
            },
            error => {
                this.errorMessage = <any>error;
                this.successMessage = ""
            });
    }
}
