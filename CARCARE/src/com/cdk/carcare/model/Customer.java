package com.cdk.carcare.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "customer_detail")
public class Customer {



    private int customerId;

    private String name;

    @Column(name = "mobile_no")
    private long mobileNo;

    private String email;

    @Column(name = "city")
    private String city;

    private String password;

    private Set<Car> cars = new HashSet<Car>(0);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id" ,nullable = false, length = 100)
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "CUSTOMER_CAR", joinColumns = { @JoinColumn(name = "customer_id") }, inverseJoinColumns = { @JoinColumn(name = "car_id") })
    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }

    public Customer() {
    }

    public Customer(String name, long mobileNo, String email, String city, String password) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.email = email;
        this.city = city;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", mobileNo=" + mobileNo +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", password='" + password + '\'' +
                ", cars=" + cars +
                '}';
    }
}
