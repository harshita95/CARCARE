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
const router_1 = require('@angular/router');
let MovieComponent = class MovieComponent {
    constructor(activatedRoute) {
        this.activatedRoute = activatedRoute;
        this.title = "Movie Details";
        this.movies = [
            { id: 100, name: 'Bahubali' },
            { id: 101, name: 'DDLJ' }
        ];
        //this.name = this.movies[0].name;
        this.activatedRoute.params.subscribe((prms) => {
            var movieId = parseInt(prms['mid']);
            this.findMovie(movieId);
        });
    }
    findMovie(movieId) {
        for (let movie of this.movies) {
            if (movie.id === movieId) {
                this.name = movie.name;
                break;
            }
        }
    }
};
MovieComponent = __decorate([
    core_1.Component({
        selector: 'movie',
        template: `<div>
        <h1>{{title}}</h1>
        <h2>{{name}}</h2>
    </div>`
    }), 
    __metadata('design:paramtypes', [router_1.ActivatedRoute])
], MovieComponent);
exports.MovieComponent = MovieComponent;
//# sourceMappingURL=movie.component.js.map