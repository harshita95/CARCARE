export class Customer{


    customerId:number;
    name:string = "";
    mobileNo:number ;
    email:string = "";
    city:string="";
    password:string="";


    constructor(name: string, mobileNo: number, email: string, city: string, password: string) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.email = email;
        this.city = city;
        this.password = password;
    }
}