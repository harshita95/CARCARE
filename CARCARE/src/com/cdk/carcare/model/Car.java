package com.cdk.carcare.model;

import javax.persistence.*;

@Entity
@Table(name = "car_detail")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private int carId;

    private String make;

    @Column(name = "fuel_type")
    private String fuelType;

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Car(String make, String fuelType) {
        this.make = make;
        this.fuelType = fuelType;
    }

    public Car() {
    }

    public Car(int carId, String make, String fuelType) {
        this.carId = carId;
        this.make = make;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", make='" + make + '\'' +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
