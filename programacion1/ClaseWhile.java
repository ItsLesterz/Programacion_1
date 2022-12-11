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
public class ClaseWhile {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int numero =0;
        char opcion;
        
        while(true){
            System.out.println("Ingrese Numero: ");
            numero +=leer.nextInt();
            System.out.println("Desea continuar: S/N");
            opcion=leer.next().toLowerCase().charAt(0);
            if(opcion=='n')
                break;
            
            
        }
        System.out.println("Resultado: "+numero);
    }
}
