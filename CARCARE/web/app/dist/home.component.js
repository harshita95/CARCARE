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
const dataService_service_1 = require("./dataService.service");
;
let HomeComponent = class HomeComponent {
    constructor(http, dataService) {
        this.http = http;
        this.dataService = dataService;
        this.title = "Login Form";
        this.email = null;
        this.password = null;
        console.log(this.dataService.getValue());
    }
    checkCustomer() {
        console.log("Inside checkCustomer()!!!!");
        let addUrl = "/rest/check/" + this.email + "/" + this.password;
        var requestHeaders = new http_1.Headers({ 'Content-Type': 'application/text' });
        var options = new http_1.RequestOptions({ headers: requestHeaders });
        //this.car.logo = this.car.make + '-' + this.car.model + '.png';
        //this.http.post(addUrl,this.car,options).subscribe(res => this.successMessage = res.toString());
        this.http.post(addUrl, options).subscribe(res => {
            this.successMessage = res.toString();
            console.log("I am here" + res.text());
            this.errorMessage = "";
            this.dataService.setValue(res.text());
        }, error => {
            this.errorMessage = error;
            this.successMessage = "";
        });
    }
};
HomeComponent = __decorate([
    core_1.Component({
        selector: 'login-form',
        templateUrl: '../partials/home.component.html',
        styleUrls: ['../css/home.component.css'],
    }), 
    __metadata('design:paramtypes', [http_1.Http, dataService_service_1.DataService])
], HomeComponent);
exports.HomeComponent = HomeComponent;
//# sourceMappingURL=home.component.js.map