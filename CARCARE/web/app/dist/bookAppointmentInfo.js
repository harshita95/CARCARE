"use strict";
class BookAppointmentInfo {
    constructor(customerId, make, currentDate, firstSlot, secondSlot, thirdSlot, battery, ac, accidental, regular, washing) {
        this.filter = false;
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
exports.BookAppointmentInfo = BookAppointmentInfo;
//# sourceMappingURL=bookAppointmentInfo.js.map