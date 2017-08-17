package com.cdk.carcare.dao;

import com.cdk.carcare.model.Car;
import com.cdk.carcare.model.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class CarDAO {

    @PersistenceContext
    EntityManager entityManager;

//    public int update(Car car){
//        entityManager.merge(car);
//        return car.getCarId();
//    }

    public int save(Car car){
        entityManager.merge(car);
        return car.getCarId();
    }

    public Car read(Car car){
        System.out.println("I am in read");
        Query query =  entityManager.createQuery("from Car where fuelType=" + "'" + car.getFuelType() + "'"+ "and make=" + "'" + car.getMake() + "'");
        Car presentCar = (Car) query.getSingleResult();
        System.out.println(presentCar);
        return presentCar;
    }


//    public Car selectById(Integer id){
//        return entityManager.find(Car.class,id);
//    }
//
//
//    public List<Car> selectAll(){
//        return entityManager.createQuery("from Car").getResultList();
//
//    }
//
//
//    public void delete(int id) {
//        Car car = entityManager.find(Car.class,id);
//        entityManager.remove(car);
//    }

}
