/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_Progra1;

import java.util.Scanner;

/**
 *
 * @author BAC
 */
public class EjercicioSuma {
    public static void main (String args[]){
        
        Scanner leer=new Scanner(System.in);
      
        System.out.println("-------------EJERCICIO SUMA ------------");
        
        int suma = 0 ;
        int numero;
        int extNumero;
        
        System.out.print("Ingrese un numero entero: ");
           String digito = leer.next();
           numero = Integer.parseInt(digito);
 
           while (numero > 0) {  
           extNumero = numero %10;
           numero /=10;
           suma += extNumero;
           
           }

          System.out.println("La suma de los numeros es: "+ suma ); 
           
    } 
}
