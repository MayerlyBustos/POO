/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo;

/**
 *
 * @author Mayitho Bustos R
 */
public class Car {

    private int id;
    private String license;
    private Account driver;
    int passenger;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;    }

    void imprimirData() {
        if (passenger == 4){
        System.out.println("Licencia: " + license + "\n" + "Conductor: " + driver.name + "\n" + "Nº Documento: " + driver.document + "\n" + "Pasajeros: " + passenger);
        }else{
            System.out.println("Deben haber 4 pasajeros");
        }
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        if (passenger == 4) {
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }
    

}
