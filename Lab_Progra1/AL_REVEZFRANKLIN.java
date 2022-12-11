/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_Progra1;

import java.util.Scanner;

/**
 *
 * @author RetselHerdez
 */
public class AL_REVEZFRANKLIN {
    public static void main(String[] args) {
        System.out.println("******* AL REVES *******");
                Scanner scan = new Scanner(System.in).useDelimiter("\n");
                int numero=0;
                int contador=0;
                String palabra;
                String invertir="";
                int almacen;
                
                System.out.print("Ingrese la cantidad de palabras que desea invertir: ");
                 numero= scan.nextInt();
                 
                 do{
                     contador++;
                     String invertido=" ";
                       System.out.print("Ingrese la palabra: ");
                    palabra=scan.next();
               for (almacen = palabra.length() - 1; almacen >= 0; almacen--) {
                    invertir+=palabra.charAt(almacen);
  
                 }
              
                 }while(contador<numero);
                 System.out.print("\nLa palabra al reves es: \n"+invertir);
    
    }
}
