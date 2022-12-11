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
public class ArregloUnidimensional {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresar el tamaño: ");
        int tamaño=leer.nextInt();
        int[] arreglo=new int[tamaño];
        
        for(int i=0;i<arreglo.length;i++){
            System.out.println("Ingrese Valor Arreglo 1: ["+i+"]:");
            arreglo[i]=leer.nextInt();
        }
        
        int []arreglo2=new int[tamaño];
        for(int i=0;i<arreglo2.length;i++){
            System.out.println("Ingrese Valor Arreglo 2: ["+i+"]:");
            arreglo2[i]=leer.nextInt();
        }
        int[]suma=new int[tamaño];
        for(int i=0;i<suma.length;i++){
            suma[i]=(arreglo[i]+arreglo2[i]);
            System.out.println("Suma 1:"+suma[i]+"\n");
        }
        
    }
    
}
