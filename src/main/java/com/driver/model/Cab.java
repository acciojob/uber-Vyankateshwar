package com.driver.model;


import javax.persistence.*;

@Entity
public class Cab{

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;

    private int perKmRate;

    private boolean available;


    @OneToOne
    @JoinColumn
    Driver driver;


    public Cab() {
    }

    public Cab(int perKmRate, boolean available) {
        this.perKmRate = perKmRate;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public boolean isAvailable() {
        return available;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}