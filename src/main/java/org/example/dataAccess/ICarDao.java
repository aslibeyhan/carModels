package org.example.dataAccess;

import org.example.entities.Car;

public interface ICarDao {
    void add(Car car);
    void update(Car car,String name);
    void delete(Car car);
}
