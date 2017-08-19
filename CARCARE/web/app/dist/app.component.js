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
let AppComponent = class AppComponent {
    constructor() {
        this.title = "CAR-CARE";
    }
};
AppComponent = __decorate([
    core_1.Component({
        selector: 'carcare-app',
        template: `<div>
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
    }), 
    __metadata('design:paramtypes', [])
], AppComponent);
exports.AppComponent = AppComponent;
//# sourceMappingURL=app.component.js.map