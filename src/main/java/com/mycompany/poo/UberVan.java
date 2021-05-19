/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author Mayitho Bustos R
 */
public class UberVan extends Car {

    Map<String, Map<String, Integer>> typeCarAcepted;
    ArrayList<String> seatsMaterial;
    private int passenger;

    public UberVan(String license, Account driver) {
        super(license, driver);
    }

    public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarAcepted, ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAcepted = typeCarAcepted;
        this.seatsMaterial = seatsMaterial;
    }

    @Override
    public void setPassenger(int passenger) {
        if (passenger == 6) {
            this.passenger = passenger;
        } else {
            System.out.println("Necesitas asignar 6 pasajeros");
        }
    }


}
