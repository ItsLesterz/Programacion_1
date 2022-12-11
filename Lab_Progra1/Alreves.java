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
public class Alreves {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("******* AL REVES ******");
        int counter=1,cantidad=0;
                    String palabra="";
                    String invertir="";
                    System.out.print("Cantidad de Palabras: ");
                    cantidad = leer.nextInt();
                    
                    do{
                   
                    String invertida="";
                    System.out.print("Palabra "+counter+": ");
                    palabra = leer.next();
                    counter++;

	            for (int indice = palabra.length() - 1; indice >= 0; indice--) {
	            invertir += palabra.charAt(indice);
                    invertir=invertir+""+invertida+"";
                    }
                    invertir=invertir+"\n";
                    }while(counter<=cantidad);
	            System.out.println("Cadena invertida: \n" +invertir+"\n");
                    
    }
}

	


    
    

