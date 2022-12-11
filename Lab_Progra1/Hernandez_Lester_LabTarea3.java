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
public class Hernandez_Lester_LabTarea3 {
    public static void main(String[] args) {
         int opcion;
        Scanner leer = new Scanner(System.in);
  
        // MENU  EJERCICIO 1
        System.out.print("=== MENU ==="
                + "\n=== Seleccione una opcion ==="
                + "\n1 - Ejercicio ciclo"
                + "\n2 - Ejercicio Suma"
                + "\n3 - Ejercicio vocal"
                + "\n4 - Salir"
                + "\nOpcion: ");
        opcion = leer.nextInt();        
        
        // EJERCICIO 2
        if (opcion == 1) {
            System.out.println("-------------EJERCICIO CICLO ------------");
        
            double numero, promedio;
            double acumulador = 0;
            double contador = 0, contadorPares = 0;
        
            System.out.print("»»» Ingrese un numero «««"
                    + "\n: ");
            numero = leer.nextDouble();
        
            if (numero % 2 == 0) {
                contadorPares++;
            }    
        
            while (numero > 0) {
                acumulador += numero;
                System.out.print("»»» Ingrese otro numero «««"
                        + "\nNota: Ingresar un numero negativo para terminar"
                        + "\n: ");
                numero = leer.nextDouble();
                if (numero % 2 == 0) {
                    contadorPares++;
                }
                contador ++;
            }
        
            promedio = (acumulador / contador);
        
            System.out.println("La suma de los numeros ingresados es: " + acumulador );
            System.out.println("Los valores ingresados son: " + contador);
            System.out.println("El promedio de los numeros es: " + promedio);
            System.out.println("Cantidad de numeros pares fueron: " + contadorPares);
        }
        
        // EJERCICIO 3 
        else if (opcion == 2) {
            System.out.println("------------- EJERCICIO SUMA ------------");
        
            int suma = 0 ;
            int numero = 0;
            int extNumero = 0;
        
            System.out.println("Ingrese un numero entero ");
            String digito = leer.next();
            numero = Integer.parseInt(digito);
 
            while (numero > 0) {  
                extNumero = numero %10;
                numero /=10;
                suma += extNumero;
           }

          System.out.println("La suma de los numeros es: "+ suma );                  
        }
        
        // EJERCICIO 4
        else if (opcion == 3) {
            
            System.out.println("* Ejercicio Vocal *");
                    
            System.out.print("\nIngrese Texto: ");
            String texto = leer.nextLine().toLowerCase();
                    
            int VocalA = 0;
            int VocalE = 0;
            int VocalI = 0;
            int VocalO = 0;
            int VocalU = 0;
                    
            int Largo = texto.length();
            int counter = 0;
                    
            char A;
            char E;
            char I;
            char O;
            char U;
                    
            while (counter < Largo){
                A = texto.charAt(counter);
                if (A == 'a'){
                    VocalA++;
                }
                        
                E = texto.charAt(counter);
                if (E == 'e'){
                    VocalE++;
                }
                        
                I = texto.charAt(counter);
                if (I == 'i'){
                    VocalI++;
                }
                        
                O = texto.charAt(counter);
                if (O == 'o'){
                    VocalO++;
                }
                        
                U = texto.charAt(counter);
                if (U == 'u'){
                    VocalU++;
                }
                    counter++;
                }
                    
                System.out.println("\n** Vocales **");  
                System.out.println("A: " + VocalA ); 
                System.out.println("E: " + VocalE);
                System.out.println("I: " + VocalI);        
                System.out.println("O: " + VocalO);
                System.out.println("U: " + VocalU);
        }
        
        else if (opcion == 4) {
            System.out.println("Gracias por usar nuestro programa!");
        }
    }
}
    

