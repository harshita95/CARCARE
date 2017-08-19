export class BookAppointmentInfo {

    currentDate: Date;
    make: string;
    firstSlot: boolean;
    secondSlot: boolean;
    thirdSlot: boolean;
    battery: string;
    ac: string;
    accidental: string;
    regular: string;
    washing: string;
    filter: boolean = false;
    customerId:number;

    constructor(customerId: number, make: string, currentDate: Date, firstSlot: boolean, secondSlot: boolean, thirdSlot: boolean, battery: string, ac: string, accidental: string, regular: string, washing: string) {
        this.customerId = customerId;
        this.currentDate = currentDate;
        this.make = make;
        this.firstSlot = firstSlot;
        this.secondSlot = secondSlot;
        this.thirdSlot = thirdSlot;
        this.battery = battery;
        this.ac = ac;
        this.accidental = accidental;
        this.regular = regular;
        this.washing = washing;
    }

    toString() {
        return "BookAppointmentInfo{" +
            "customerId=" + this.customerId +
            ", make='" + this.make + '\'' +
            ", currentDate='" + this.currentDate + '\'' +
            ", firstSlot=" + this.firstSlot +
            ", secondSlot=" + this.secondSlot +
            ", thirdSlot=" + this.thirdSlot +
            ", battery='" + this.battery + '\'' +
            ", ac='" + this.ac + '\'' +
            ", accidental='" + this.accidental + '\'' +
            ", regular='" + this.regular + '\'' +
            ", washing='" + this.washing + '\'' +
            '}';
    }
    filterData() {
        this.filter = !this.filter;
    }

}