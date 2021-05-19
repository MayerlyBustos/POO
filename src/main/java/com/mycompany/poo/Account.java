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
public class Account {

    int id;
    String name;
    String document;
    String email;
    String password;

    public Account(String name, String document) {
        this.name = name;
        this.document = document;
    }
}
