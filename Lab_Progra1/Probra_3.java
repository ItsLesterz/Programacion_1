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
public class Probra_3 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int numero,cantidad,counter=1;
        
        System.out.print("Cantidad de Numeros: ");
        numero = leer.nextInt();
                
        System.out.print("Ingresar Numero\n");           
        while(counter<=numero){
        System.out.print("Numero "+counter+": ");
        cantidad = leer.nextInt();
            switch(cantidad){
                case 0:
                    numero++;
                    counter++;
                    break;
                default:
                    break;
                    
            }  
        }   
    }
}
