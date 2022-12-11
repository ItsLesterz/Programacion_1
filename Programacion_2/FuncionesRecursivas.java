/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programacion_2;

import static ProyectoPrograP2.Ghost.Juego.leer;

/**
 *
 * @author leste
 */
public class FuncionesRecursivas {

    public static void print(int numero) {
        if (numero > 1) {
            print(numero - 1);
            System.out.println(numero);
        }
    }

    public static void printMismo(int numero, int repetir) {
        if (repetir > 0) {
            System.out.println(numero);
            printMismo(numero, repetir - 1);
        }
    }

    public static int sumaUp(int numero) {
        if (numero >= 1) {
            return sumaUp(numero - 1) + numero;
        }
        return 0;
    }

    public static int sumaDown(int numero) {
        return sumaDown(numero, 0);
    }

    private static int sumaDown(int numero, int suma) {
        if (numero >= 1) {
            return sumaDown(numero - 1, suma + numero);
        }
        return suma;
    }

    //Numero a la potencia
    public static int potUp(int base, int exponente) {
        if (exponente > 0) {
            return potUp(base, exponente - 1) * base;
        }
        return 1;
    }

    public static int potDown(int base, int exponente) {
        return potDown(base, exponente, 1);
    }

    private static int potDown(int base, int exponente, int producto) {
        if (exponente > 0) {
            return potDown(base, exponente - 1, producto * base);
        }
        return producto;
    }

    public static boolean esPalindromo(String palabra) {
        return esPalindromo(palabra, 0, palabra.length() - 1);
    }

    private static boolean esPalindromo(String palabra, int inicio, int fin) {
        if (inicio < fin) {
            if (palabra.charAt(inicio) == palabra.charAt(fin)) {
                return esPalindromo(palabra, inicio + 1, fin - 1);
            }
            return false;
        }
        return true;
    }

    //Creacion de la piramide
    public static void PiramidedeAsteriscos(int fila, String simbolo) {
        if (fila > 0) {
            System.out.println(simbolo);
            PiramidedeAsteriscos(fila - 1, simbolo + "*");
        }
    }

    //Estructura Fibonacci
    public static void EstrucutraFibonacci() {
        System.out.print("Ingrese la cantidad de terminos > 1: ");
        int n = leer.nextInt();
        for (int i = 0; i < n; i++) {
            int numeroFibonacci = EstrucutraFibonacci(i);
            System.out.print(numeroFibonacci + " ");
        }
    }

    private static int EstrucutraFibonacci(int n) {
        if (n > 1) {
            return EstrucutraFibonacci(n - 1) + EstrucutraFibonacci(n - 2);
        } else if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            System.out.println("Error, el número debe ser >= 1!!!!");
        }
        return 0;
    }
}


