package org.example.entities;

public class Car {
    private int id;
    private String name;
    private String model;
    private int unitPrice;

    public Car() {

    }


    public Car(int id, String name, String model, int unitPrice) {
        super();
        this.id = id;
        this.name = name;
        this.model = model;
        this.unitPrice = unitPrice;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public int getUnitPrice() {
        return unitPrice;
    }


    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
}
