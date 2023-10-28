package org.example;

import org.example.business.CarManager;
import org.example.dataAccess.HibernateCarDao;
import org.example.entities.Car;

public class Main {
    public static void main(String[] args) {
        Car car1=new Car(1,"Hyundai","2005",100000);
        Car car2=new Car(2,"Volkswagen","2006",300000);
        Car car3=new Car(3,"Renault","2010",600000);
        Car car4=new Car(4,"Renault","2015",800000);
        Car car5=new Car(5,"Jeep","2017",1200000);
        Car car6=new Car(6,"Range Rover","2020",2000000);
        Car car7=new Car(7,"Porche","2023",10000000);


        CarManager carManager=new CarManager(new HibernateCarDao());
        carManager.add(car7);
        carManager.update(car7, "Ferrari");
        carManager.delete(car7);
    }
}