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
public class String_Mayor {
    public static void main(String[] args) {
        System.out.println("***** STRING MAYOR *****");
                    Scanner leer=new Scanner(System.in);
                    int counter=1,cantidad=0,texto1,texto2;
                    String palabra1,palabra2="";
                    System.out.print("Cantidad de Palabras: ");
                    cantidad = leer.nextInt();

                    do{
                        System.out.print("Palabra "+counter+": ");
                        palabra1 = leer.next().toLowerCase();
                        counter++;
                        texto1=palabra1.length();
                        texto2=palabra2.length();
                        if(texto2<texto1){
                            palabra2=palabra1;
                        }
                                
                        } while(counter<=cantidad);
                         System.out.println("La palabra mas larga es: "+palabra2);
                    }
}

