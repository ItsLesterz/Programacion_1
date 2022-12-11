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
public class Mayor_menor {
    public static void main(String[]args) {
        System.out.println("******* Mayor y Menor *******");
        Scanner leer =  new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo");
        int tam = leer.nextInt();
        int[]nums = new int[tam];
        System.out.println("Ingrese los " + tam +" numeros");
        for(int i = 0; i < nums.length; i++) {
            nums[i] = leer.nextInt();
        }
        int mayor = nums[0]; //mayor momentaneo por defecto
        int menor = nums[0]; //menor momentaneo por defecto
        int num = 0;
        for(int i = 0; i < nums.length; i++) {
            num = nums[i];
            if(num > mayor)  // ¿actual numero es mayor al "mayor" que tengo almacenado?
                mayor = num; // si es mayor reemplazar, ahora tengo un nuevo mayor
            if(num < menor)  // ¿actual numero es menor al "menor" que tengo almacenado?
                menor = menor;//si es menor reemplazar, ahora tengo un nuevo menor
        }
        int cantMayor = 0;
        int cantMenor = 0;
        for(int j = 0; j < nums.length; j++) {
            num = nums[j];
            if(num == mayor)
                cantMayor++;
            if(num == menor)
                cantMenor++;
        }
        System.out.println();
        System.out.println("El mayor numero es: " + mayor + " y se repite  "+ cantMayor + " veces");
        System.out.println("El menor numero es: " + menor + " y se repite  "+ cantMenor + " veces");
    }
  }


