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
public class Abecedario {
    public static void main(String[] args) {
        System.out.println("******** ABECEDARIO ********");
        Scanner leer = new Scanner(System.in);
 
        char mayusculas[] = new char[26];
        for (int i = 65, j = 0; i <= 90; i++, j++) {
            mayusculas[j] = (char) i;
        }
 
        String cadena = "";
        int eleccion = -1;//si es -1 se cierra el programa
 
        do {
            System.out.print("Elija un indice entre 0 y " + (mayusculas.length - 1)+": ");//elegir una opcion en numeros del abecedario
            eleccion = leer.nextInt();
 
            if (!(eleccion >= 0 && eleccion <= mayusculas.length - 1)) {
                System.out.println("Error, inserte otro numero");//al ingresar un numero mayor a 25, dara error
            } else {
                if (eleccion != -1) {
                    cadena += mayusculas[eleccion];
                }
            }
 
        } while (eleccion != -1);
 
        System.out.println(cadena);
    }
}
