package org.example.business;

import org.example.dataAccess.ICarDao;
import org.example.entities.Car;

public class CarManager {
    private ICarDao carDao;

    public CarManager(ICarDao carDao) {
        super();
        this.carDao = carDao;
    }

    public void add(Car car) {
        if (car.getUnitPrice() > 1500000) {
            System.out.println(car.getName() + " " + car.getModel() + " aracı pahalı bir arabadır");
        } else if (car.getUnitPrice() > 1000000) {
            System.out.println(car.getName() + " " + car.getModel() + " aracı normal bir arabadır");
        } else if (car.getUnitPrice() > 200000) {
            System.out.println(car.getName() + " " + car.getModel() + " aracı memura uygun bir arabadır");
        } else {
            System.out.println(car.getName() + " " + car.getModel() + " aracı arızalı bir arabadır bilginize");
        }

        carDao.add(car);

    }


    public void update(Car car,String name) {
        System.out.print(car.getName() + ", ");
        car.setName(name);
        carDao.update(car, name);

    }


    public void delete(Car car) {
        carDao.delete(car);

    }
}
