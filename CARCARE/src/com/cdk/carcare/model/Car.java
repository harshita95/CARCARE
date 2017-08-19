package com.cdk.carcare.model;

import javax.persistence.*;

@Entity
@Table(name = "car_detail")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private int carId;

    @Column(name = "service_id")
    private int serviceId;

    private String make;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "service_id", updatable = false, insertable = false)
    private ServiceProvider serviceProvider;

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

    public Car(String make) {
        this.make = make;
    }

    public Car() {
    }

    public Car(int carId, String make, String fuelType) {
        this.carId = carId;
        this.make = make;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", serviceId=" + serviceId +
                ", make='" + make + '\'' +
                ", serviceProvider=" + serviceProvider +
                '}';
    }
}
