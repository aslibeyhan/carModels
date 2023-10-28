package org.example.dataAccess;

import org.example.entities.Car;

public class JdbcCarDao implements ICarDao{

    @Override
    public void add(Car car) {
        System.out.println(car.getName()+" Araba modeli JDBC ile veri tabanına eklendi");
    }

    @Override
    public void update(Car car, String name) {
        System.out.println(car.getName() +" Araba modeli olarak JDBC ile veri tabanında güncellendi \n");
    }

    @Override
    public void delete(Car car) {
        System.out.println(car.getName() +"\n  Araba modeli JDBC ile veri tabanından silindi");
    }
}
