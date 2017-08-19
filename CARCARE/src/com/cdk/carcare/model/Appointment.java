package com.cdk.carcare.model;

import javax.persistence.*;


@Entity
@Table(name = "appointment_detail")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id")
    int id;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name="car_id")
    private int carId;

    @Column(name="service_id")
    private int serviceId;

    String newdate;

    @Column(name="first_slot")
    Boolean firstSlot;

    @Column(name="second_slot")
    Boolean secondSlot;

    @Column(name="third_slot")
    Boolean thirdSlot;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id", updatable = false, insertable = false)
    private Customer customer;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "car_id", updatable = false, insertable = false)
    private Car car;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "service_id", insertable = false, updatable = false)
    private ServiceInfo serviceInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public ServiceInfo getServiceInfo() {
        return serviceInfo;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getNewdate() {
        return newdate;
    }

    public void setNewdate(String newdate) {
        this.newdate = newdate;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Appointment(Boolean firstSlot, Boolean secondSlot, Boolean thirdSlot) {
        this.firstSlot = firstSlot;
        this.secondSlot = secondSlot;
        this.thirdSlot = thirdSlot;
    }

    public Appointment(int customerId, int carId, int serviceId, String newdate, Boolean firstSlot, Boolean secondSlot, Boolean thirdSlot, Customer customer, Car car, ServiceInfo serviceInfo) {
        this.customerId = customerId;
        this.carId = carId;
        this.serviceId = serviceId;
        this.newdate = newdate;
        this.firstSlot = firstSlot;
        this.secondSlot = secondSlot;
        this.thirdSlot = thirdSlot;
        this.customer = customer;
        this.car = car;
        this.serviceInfo = serviceInfo;
    }

    public Appointment(String newdate, Boolean firstSlot, Boolean secondSlot, Boolean thirdSlot) {
        this.newdate = newdate;
        this.firstSlot = firstSlot;
        this.secondSlot = secondSlot;
        this.thirdSlot = thirdSlot;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", carId=" + carId +
                ", newdate=" + newdate +
                ", firstSlot=" + firstSlot +
                ", secondSlot=" + secondSlot +
                ", thirdSlot=" + thirdSlot +
                ", customer=" + customer +
                ", car=" + car +
                '}';
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public void setServiceInfo(ServiceInfo serviceInfo) {
        this.serviceInfo = serviceInfo;
    }
}
