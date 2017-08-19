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
const core_1 = require('@angular/core');
const platform_browser_1 = require('@angular/platform-browser');
const forms_1 = require('@angular/forms');
const http_1 = require('@angular/http');
const routes_config_1 = require('./routes.config');
const customer_component_1 = require('./customer.component');
const app_component_1 = require("./app.component");
// import {CricketComponent} from "./cricket.component";
const aboutus_component_1 = require("./aboutus.component");
const contactus_component_1 = require("./contactus.component");
const home_component_1 = require("./home.component");
// import {MovieComponent} from "./movie.component";
const dataService_service_1 = require("./dataService.service");
const bookappointmentInfo_component_1 = require("./bookappointmentInfo.component");
let AppModule = class AppModule {
};
AppModule = __decorate([
    core_1.NgModule({
        imports: [platform_browser_1.BrowserModule, forms_1.FormsModule, http_1.HttpModule, routes_config_1.configuredRoutes],
        declarations: [customer_component_1.CustomerComponent, app_component_1.AppComponent, home_component_1.HomeComponent, bookappointmentInfo_component_1.BookAppointmentInfoComponent, aboutus_component_1.AboutUsComponent, contactus_component_1.ContactUsComponent],
        providers: [dataService_service_1.DataService],
        bootstrap: [app_component_1.AppComponent]
    }), 
    __metadata('design:paramtypes', [])
], AppModule);
exports.AppModule = AppModule;
//# sourceMappingURL=app.module.js.map