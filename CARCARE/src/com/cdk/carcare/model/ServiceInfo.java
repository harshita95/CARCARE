package com.cdk.carcare.model;

import javax.persistence.*;

@Entity
@Table(name = "service_details")
public class ServiceInfo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name="battery")
    String battery;
    @Column(name="ac")
    String ac;
    @Column(name="accidental")
    String accidental;
    @Column(name="regular")
    String regular;
    @Column(name="washing")
    String washing;

    public ServiceInfo() {}

    public ServiceInfo(String battery, String ac, String accidental, String regular, String washing) {
        this.battery = battery;
        this.ac = ac;
        this.accidental = accidental;
        this.regular = regular;
        this.washing = washing;
    }

    public ServiceInfo(int id, String battery, String ac, String accidental, String regular, String washing) {
        this.id = id;
        this.battery = battery;
        this.ac = ac;
        this.accidental = accidental;
        this.regular = regular;
        this.washing = washing;
    }

    public int getVin() {
        return id;
    }

    public void setVin(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "ServiceOption{" +
                "id=" + id +
                ", batteryServicing='" + battery + '\'' +
                ", ac='" + ac + '\'' +
                ", accidental='" + accidental + '\'' +
                ", regular='" + regular + '\'' +
                ", washing='" + washing + '\'' +
                '}';
    }
}
