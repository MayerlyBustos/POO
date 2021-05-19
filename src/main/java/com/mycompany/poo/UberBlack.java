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
public class UberBlack extends Car{
    Map<String, ArrayList<String>> typeCarAcepted;
    ArrayList<String> seatsMaterial;
    
    public UberBlack(String license, Account driver, Map<String, ArrayList<String>> typeCarAcepted, ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.seatsMaterial = seatsMaterial;
        this.typeCarAcepted = typeCarAcepted;
    }
    
}
