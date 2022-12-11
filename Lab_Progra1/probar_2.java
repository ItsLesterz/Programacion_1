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
public class probar_2 {
    public static void main(String[] args) {
        
   
    Scanner leer = new Scanner(System.in);
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
                    
    }
}
