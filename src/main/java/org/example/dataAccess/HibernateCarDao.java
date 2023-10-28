package org.example.dataAccess;

import org.example.entities.Car;

public class HibernateCarDao implements ICarDao{


    @Override
    public void add(Car car) {
        System.out.println(car.getName()+" Araba modeli Hibernate ile veritabanına eklendi");
    }

    @Override
    public void update(Car car, String name) {
        System.out.println(car.getName()+" Araba modeli olarak Hibernate ile veri tabanında güncellendi");

    }

    @Override
    public void delete(Car car) {
        System.out.println(car.getName()+" Araba modeli Hibernate ile veri tabanından silindi");
    }
}
