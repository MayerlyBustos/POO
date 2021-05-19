
package com.mycompany.poo;

/**
 *
 * @author Mayitho Bustos R
 */
public class main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!!!" + "\n");
        
        UberX uberX = new UberX("ERT456", new Account("Sofia Gomez", "1124156897"), "Mazda", "2021");
        uberX.setPassenger(4);
        uberX.imprimirData();
        
        UberVan uberVan = new UberVan("GHF123", new Account("Freddy Mesa", "1124156897"));
        uberVan.setPassenger(6);
        uberVan.imprimirData();
    }
    
}
