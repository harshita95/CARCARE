"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
const core_1 = require("@angular/core");
const http_1 = require("@angular/http");
const bookAppointmentInfo_1 = require("./bookAppointmentInfo");
const dataService_service_1 = require("./dataService.service");
let BookAppointmentInfoComponent = class BookAppointmentInfoComponent {
    constructor(http, dataService) {
        this.http = http;
        this.dataService = dataService;
        this.title = "Book your Appointment";
        this.customerId = this.dataService.getValue();
        this.bookAppointmentInfo = new bookAppointmentInfo_1.BookAppointmentInfo(this.customerId, this.make, this.currentDate, this.firstSlot, this.secondSlot, this.thirdSlot, this.battery, this.ac, this.accidental, this.regular, this.washing);
    }
    addServices() {
        console.log("Inside appointment()!!!!");
        console.log(this.bookAppointmentInfo.toString());
        let addUrl = "/rest/add/appointment";
        var requestHeaders = new http_1.Headers({ 'Content-Type': 'application/json' });
        var options = new http_1.RequestOptions({ headers: requestHeaders });
        //this.car.logo = this.car.make + '-' + this.car.model + '.png';
        //this.http.post(addUrl,this.car,options).subscribe(res => this.successMessage = res.toString());
        this.http.post(addUrl, this.bookAppointmentInfo, options).subscribe(res => {
            this.successMessage = res.toString();
            console.log(res.text());
            this.errorMessage = "";
        }, error => {
            this.errorMessage = error;
            this.successMessage = "";
        });
    }
};
BookAppointmentInfoComponent = __decorate([
    core_1.Component({
        selector: 'appointmentForm',
        templateUrl: '../partials/appointment.component.html',
        styleUrls: ['../css/appointment.component.css'],
    }), 
    __metadata('design:paramtypes', [http_1.Http, dataService_service_1.DataService])
], BookAppointmentInfoComponent);
exports.BookAppointmentInfoComponent = BookAppointmentInfoComponent;
//# sourceMappingURL=bookappointmentInfo.component.js.map