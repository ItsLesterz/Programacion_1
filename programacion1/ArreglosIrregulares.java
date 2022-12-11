/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion1;

import java.util.Scanner;

/**
 *
 * @author leste
 */
public class ArreglosIrregulares {
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        System.out.print("Ingresar Fila: ");
       int fila=leer.nextInt();
       
       int numeros[][]=new int[fila][];
       for(int f=0;f<fila;f++){
           System.out.print("Ingrese Columna: ");
           numeros[f]=new int[leer.nextInt()];
       }
       for(int f=0;f<numeros[f].length;f++){
           for(int c=0;c<numeros[f].length;c++){
               System.out.print(numeros[f][c]+"\t");
           }
           System.out.println("");
       }
    }
}
