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
public class Hernandez_Lester_LabTareaN3 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
      System.out.print("***** Vocal *****");
                    
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
                    
                    System.out.println("\n*** Vocales ***");  
                    System.out.println("A: "+VocalA ); 
                    System.out.println("E: "+VocalE);
                    System.out.println("I: "+VocalI);        
                    System.out.println("O: "+VocalO);
                    System.out.println("U: "+VocalU);
    }
}
