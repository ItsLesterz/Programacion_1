/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programacion_2;

import java.util.Scanner;

/**
 *
 * @author leste
 */
public class testFunionesRecursivas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        System.out.println("-----------Ejercicios de Recursividad-----------");
        while (opcion != 9) {
            System.out.println("\n\n------ Menu ------\n"
                    + "\n1. PrintMismo"
                    + "\n2. SumaUp"
                    + "\n3. SumaDown"
                    + "\n4. PotenciaUp"
                    + "\n5. PotenciaDown"
                    + "\n6. EsPalindromo"
                    + "\n7. Piramide de Asteriscos"
                    + "\n8. Estrucutra Fibonacci"
                    + "\n9. Salir");
            System.out.print("Seleccione Opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    FuncionesRecursivas.print(5);
                    break;
                case 2:
                    FuncionesRecursivas.sumaUp(5);
                    break;
                case 3:
                    FuncionesRecursivas.sumaDown(5);
                    break;
                case 4:
                    System.out.println("Base: 5\tExponente: 4");
                    FuncionesRecursivas.potUp(5, 4);
                    break;
                case 5:
                    System.out.println("Base: 5\tExponente: 4");
                    FuncionesRecursivas.potDown(5, 4);
                    break;
                case 6:
                    System.out.println("Palabra: ana");
                    String palindromo = ((FuncionesRecursivas.esPalindromo("ana")) == true) ? "Si es palindromo" : "no es";
                    System.out.println(palindromo);
                    break;
                case 7:
                    System.out.print("Ingrese N. Filas: ");
                    int filas = leer.nextInt();
                    FuncionesRecursivas.PiramidedeAsteriscos(filas, "*");
                    break;
                case 8:
                    FuncionesRecursivas.EstrucutraFibonacci();
                    break;
                case 9:
                    System.out.println("Ha salido del programa!");

            }
        }
    }
}
