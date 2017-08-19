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
const http_1 = require('@angular/http');
let PoliticianComponent = class PoliticianComponent {
    constructor(http) {
        this.http = http;
        this.title = "Politician List";
    }
    fetchData() {
        let requestHeaders = new http_1.Headers({ 'Accept': 'application/json' });
        let requestOptions = new http_1.RequestOptions({ headers: requestHeaders });
        this.http.get("/rest/politicians", requestOptions)
            .subscribe((res) => { this.politicians = res.json(); });
    }
};
PoliticianComponent = __decorate([
    core_1.Component({
        selector: 'politician',
        template: `<div>
        <h1>{{title}}</h1>
        <input type="button" value="Load Data" (click)="fetchData();" />
        <table>
            <tbody>
                <tr *ngFor="let politician of politicians">
                    <td>{{politician.id}}</td>
                    <td>{{politician.name}}</td>
                    <td>{{politician.frauds}}</td>
                </tr>
            </tbody>
        </table>
    </div>`
    }), 
    __metadata('design:paramtypes', [http_1.Http])
], PoliticianComponent);
exports.PoliticianComponent = PoliticianComponent;
//# sourceMappingURL=politician.component.js.map