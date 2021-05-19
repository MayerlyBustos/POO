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
public class UberX extends Car {

    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

    @Override
    void imprimirData() {
        super.imprimirData(); //To change body of generated methods, choose Tools | Templates.
         System.out.println("Modelo: " + model + "\n" + "Marca: " + brand);
    }

}
