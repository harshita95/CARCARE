import {Component} from "@angular/core";
import {ActivatedRoute} from '@angular/router';


@Component({
    selector:'movie',
    template:`<div>
        <h1>{{title}}</h1>
        <h2>{{name}}</h2>
    </div>`
})
export class MovieComponent{

    title:string ="Movie Details";
    movies:any[];
    name:string;

    constructor(private activatedRoute:ActivatedRoute){
        this.movies = [
            {id:100,name:'Bahubali'},
            {id:101,name:'DDLJ'}
        ];
        //this.name = this.movies[0].name;

        this.activatedRoute.params.subscribe((prms)=>{
                var movieId = parseInt(prms['mid']);
                this.findMovie(movieId);
        });
    }

    findMovie(movieId:number){
        for(let movie of this.movies){
            if(movie.id === movieId){
                this.name = movie.name;
                break;
            }
        }
    }


}
