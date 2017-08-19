import {Component} from "@angular/core";

@Component({
	selector:'contactus',
    template:'<div><h1>{{title}}</h1><h2>{{summary}}</h2></div>'
})
export class ContactUsComponent{

	title:string ="Contact Details";
    summary:string ="Sorry, not in mood..";

}
