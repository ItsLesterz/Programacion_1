/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion1;

import java.util.Scanner;

/**
 *
 * @author RetselHerdez
 */
public class Hernandez_Lester_Prueba2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String consola="";
        int juegos=(0),tipo=(0),ps5=(0),xbox=(0),wii=(0), counter=1;
        
        System.out.print("Cantidad de Juegos: ");
        juegos = leer.nextInt();
                
        System.out.print("Ingresar si es XBOX, PS5 o WII\n");
        
        while(counter<=juegos){
        System.out.print("Juegos "+counter+": ");
        consola = leer.next().toUpperCase();
            switch(consola){
                case "XBOX":
                    xbox++;
                    counter++;
                    break;
                case "PS5":
                    ps5++;
                    counter++;
                    break;
                case "WII":
                    wii++;
                    counter++;
                    break;
                default:
                    System.out.print("Consola no valida! Ingrese los tipos de Consola validos\n");
            }
        
        }
        System.out.println("\n*** Juegos ***");
        System.out.println("PS5: "+ps5);
        System.out.println("XBOX: "+xbox);
        System.out.println("WII: "+wii);
    }
}
