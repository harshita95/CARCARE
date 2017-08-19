package com.cdk.carcare.model;

public class BookAppointmentInfo {

    private int customerId;

    private String make;

    String currentDate;

    Boolean firstSlot;

    Boolean secondSlot;

    Boolean thirdSlot;

    String battery;

    String ac;

    String accidental;

    String regular;

    String washing;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public Boolean getFirstSlot() {
        return firstSlot;
    }

    public void setFirstSlot(Boolean firstSlot) {
        this.firstSlot = firstSlot;
    }

    public Boolean getSecondSlot() {
        return secondSlot;
    }

    public void setSecondSlot(Boolean secondSlot) {
        this.secondSlot = secondSlot;
    }

    public Boolean getThirdSlot() {
        return thirdSlot;
    }

    public void setThirdSlot(Boolean thirdSlot) {
        this.thirdSlot = thirdSlot;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public String getAccidental() {
        return accidental;
    }

    public void setAccidental(String accidental) {
        this.accidental = accidental;
    }

    public String getRegular() {
        return regular;
    }

    public void setRegular(String regular) {
        this.regular = regular;
    }

    public String getWashing() {
        return washing;
    }

    public void setWashing(String washing) {
        this.washing = washing;
    }

    public BookAppointmentInfo() {
    }

    public BookAppointmentInfo(int customerId, String make, String currentDate, Boolean firstSlot, Boolean secondSlot, Boolean thirdSlot, String battery, String ac, String accidental, String regular, String washing) {
        this.customerId = customerId;
        this.make = make;
        this.currentDate = currentDate;
        this.firstSlot = firstSlot;
        this.secondSlot = secondSlot;
        this.thirdSlot = thirdSlot;
        this.battery = battery;
        this.ac = ac;
        this.accidental = accidental;
        this.regular = regular;
        this.washing = washing;
    }

    @Override
    public String toString() {
        return "BookAppointmentInfo{" +
                "customerId=" + customerId +
                ", make='" + make + '\'' +
                ", currentDate='" + currentDate + '\'' +
                ", firstSlot=" + firstSlot +
                ", secondSlot=" + secondSlot +
                ", thirdSlot=" + thirdSlot +
                ", battery='" + battery + '\'' +
                ", ac='" + ac + '\'' +
                ", accidental='" + accidental + '\'' +
                ", regular='" + regular + '\'' +
                ", washing='" + washing + '\'' +
                '}';
    }

}
