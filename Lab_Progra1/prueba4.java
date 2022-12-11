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
public class prueba4 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int numero;
        int invertido = 0; 
        int total;
 
        Scanner s = new Scanner( System.in );
        System.out.println( "Introduzca un Numero: " );
 
        numero = s.nextInt();
 
        while( numero > 0 ) {
        total = numero % 10;
        invertido = invertido * 10 + total;
        numero /= 10;
        }
 
        System.out.println( "Numero Invertido: " + invertido );
        
    }
    
}
