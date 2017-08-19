import {Component} from "@angular/core";

@Component({
	selector:'aboutus',
    template:'<div><h1>{{title}}</h1><h2>{{summary}}</h2></div>'
})
export class AboutUsComponent{

	title:string ="About Us";
    summary:string ="In progress....";

}
