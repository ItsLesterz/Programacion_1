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
public class PALABRA_VOCALISTA {
    public static void main(String[] args) {
        
        System.out.println("***** PALABRA VOCA-LISTA *****");
        
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingrese Texto: ");
        String frase = leer.next();

        int a=0,e=0,i=0,o=0,u=0;
        int longitud = frase.length();
        int vocales=0;
        int counter = 0;
        char letra;

    do {
       letra = frase.charAt(counter);

        switch(letra) {
            
        case 'a':
        case 'A':
         a++;
         vocales++;
        break;

        case 'e':
        case 'E':
         e++;
         vocales++;
        break;
 
        case 'i':
        case 'I':
         i++;
         vocales++;
        break;

        case 'o':
        case 'O':
         o++;
         vocales++;
        break;

        case 'u':
        case 'U':
         u++;
         vocales++;
        break;

        default:
        break;
        }
        counter++;
        
    }while(counter < longitud);

        if(vocales>=4){
        System.out.println("**PALABRA VOCA-LISTA**");
        } else if(vocales<4){
        System.out.println("No es palabra vocalista!");
        }
    }
}    