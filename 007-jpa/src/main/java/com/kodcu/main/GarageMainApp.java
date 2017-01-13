/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodcu.main;

import com.kodcu.entity.Car;
import com.kodcu.entity.Garage;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.persistence.*;
import java.util.*;

/**
 *
 * @author hakdogan
 */
public class GarageMainApp {
    
    public static void main(String args[]){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("garage");
        EntityManager em = emf.createEntityManager();

        saveCar(em);
        //getCar(em, 1);

        //getGarageCarList(em, 1);

        em.close();
        emf.close();
    }

    public static void saveCar(EntityManager em){

        JsonArrayBuilder aksesuar = Json.createArrayBuilder();
        aksesuar.add("Telefon tutucu")
                .add("İçecek tutucu");

        Garage garage = new Garage();
        garage.setName("A Garajı");

        Car car = new Car();
        car.setDescription("hakdogan'ın arabası");
        car.setLicencePlate("34 HKD 250");
        car.setAccessory(aksesuar.build());
        car.setGarageID(garage);
        garage.getCarList().add(car);

        try {

            em.getTransaction().begin();
            em.persist(car);


            car = new Car();

            car.setDescription("Altuğ hocanın arabası");
            car.setLicencePlate("34 ALTG 150");
            car.setGarageID(garage);
            garage.getCarList().add(car);

            em.persist(car);
            em.getTransaction().commit();

        } catch (Exception ex){
            System.out.println("Exception: " + ex.toString());
            em.getTransaction().rollback();
        }
    }

    public static void getCar(EntityManager em, Integer carID){

        Car car = em.find(Car.class, carID);

        System.out.println("\nAraç plakası: " + car.getLicencePlate());
        System.out.println("Araç açıklaması: " + car.getDescription());
        System.out.println("Araç aksesuarı: " + car.getGarageID().getName());
        System.out.println("Araç aksesuarı: " + car.getAccessory() + "\n");


    }

    public static void getGarageCarList(EntityManager em, Integer garageID){

        EntityGraph postGraph = em.getEntityGraph("graph.Garage");

        Map hits = new HashMap<>();
        hits.put("javax.persistence.fetchgraph", postGraph);

        Garage garaj = em.find(Garage.class, garageID, hits);
        System.out.println("\nGaraj adı: " + garaj.getName());
        List<Car> carList = garaj.getCarList();

        for(Car car :carList){
            System.out.println("\nAraç açıklaması: " + car.getDescription());
            System.out.println("Araç plakası: " + car.getLicencePlate());

        }
    }

}
