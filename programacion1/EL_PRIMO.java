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
public class EL_PRIMO {
    public static void main(String[] args) {
        System.out.println("*****  EL PRIMO *****");
        System.out.print("\nIngrese un número: ");
        Scanner leer = new Scanner(System.in);
        int numero = leer.nextInt();

        if (numero <= 0) {
            System.out.printf("El número debe ser mayor que cero%n");
        } else {
            int cant_divisores = 0;
            int i = 2;
            while (i < numero) {
                if (numero % i == 0) {
                    cant_divisores++;
                }
                i++;
            }
            if (cant_divisores == 0 && numero>1) {
                System.out.printf("El número es primo%n");
            } else {
                System.out.printf("El número no es primo%n");
            }
        }
    }
} 