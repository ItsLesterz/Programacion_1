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
public class Hernandez_Lester_PruebaLab {
    public static void main(String args[])
    {
       
        //Ejercicio Numero 1
        System.out.println("*** Tabla de Multiplicacion***\n");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese No. de Tabla: ");
        int tabla = leer.nextInt();
        
        int control = 1;
        int resultado;
        
        while(control <= 12)
        {
            resultado = tabla * control;
            System.out.printf("%d x %d = %d\n", tabla, control, resultado);
            control++;
            
        }
        
        //Ejercicio 2
        System.out.println("*** Palabra Palindroma & Vocal ***\n");
        
        String palabra, reverse = "";  
        System.out.print("Ingrese su Palabra para Identificar si es Palindroma: ");  
        palabra = leer.nextLine().toLowerCase();
      
        int length = palabra.length();   
        for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + palabra.charAt(i);  
        if (palabra.equals(reverse))  
         System.out.println("Si es Palindroma");  
        else  
         System.out.println("No es Palindroma");
      
                    int TotalVocalesA=0, TotalVocalesE=0, TotalVocalesI=0, TotalVocalesO=0, TotalVocalesU=0;                    
                    int counter = 0;                    
                    char A,E,I,O,U;
                    
                    while (counter < length){
                        
                        A = palabra.charAt(counter);
                        if (A == 'a'){
                            TotalVocalesA++;
                        }
                        
                        E = palabra.charAt(counter);
                        if (E == 'e'){
                            TotalVocalesE++;
                        }
                        
                        I = palabra.charAt(counter);
                        if (I == 'i'){
                            TotalVocalesI++;
                        }
                        
                        O = palabra.charAt(counter);
                        if (O == 'o'){
                            TotalVocalesO++;
                        }
                        
                        U = palabra.charAt(counter);
                        if (U == 'u'){
                            TotalVocalesU++;
                        }
                        
                        counter++;
                    }                    
                    System.out.print("\n*** Vocales ***" + 
                        "\nA = "+TotalVocalesA+
                        "\nE = "+TotalVocalesE+
                        "\nI = "+TotalVocalesI+ 
                        "\nO = "+TotalVocalesO+ 
                        "\nU = "+TotalVocalesU);
          
        //Ejercicio 3
        
        
        
        //Ejercicio 4
        System.out.println("***Numero al Reves***");
        int numero;
        int invertido = 0; 
        int total;
 
        System.out.println( "Introduzca un Numero: " );
 
        numero = leer.nextInt();
 
        while( numero > 0 ) {
        total = numero % 10;
        invertido = invertido * 10 + total;
        numero /= 10;
        }
 
        System.out.println( "Numero Invertido: " + invertido );
        
    }
}
