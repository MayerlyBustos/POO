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
public class UberPool extends Car {

    String brand;
    String model;

    public UberPool(String license, Account driver) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

}
