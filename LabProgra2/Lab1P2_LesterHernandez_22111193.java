/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabProgra2;

import java.util.Scanner;

public class Lab1P2_LesterHernandez_22111193 {
    public static void main(String[] args) {
        
        System.out.println("********* EJERCICIO PRACTICO *********");
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el número de filas de la matriz: ");
        int N = leer.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        int M = leer.nextInt();

        System.out.print("Ingrese el numero del epsilon: ");
        int epsilon = leer.nextInt();

        int[][] matriz = new int[N][M];
        matriz = generarMatriz(matriz, N, M);
        System.out.println("---------- Matriz generada ----------");
        imprimirMatriz(matriz, N, M);
        matriz = raizCuadrada(matriz, N, M);
        System.out.println("---------- Matriz de raíces ----------");
        buscarBinario(matriz, epsilon);
        imprimirRaiz(matriz, N, M);
    }

    public static int[][] generarMatriz(int[][] matriz, int N, int M) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = (int) (Math.random() * 100) + 1;
            }
        }
        return matriz;
    }

    public static int[][] raizCuadrada(int[][] matriz, int N, int M) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = (int) Math.sqrt(matriz[i][j]);
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz, int N, int M) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("[" + matriz[i][j] + "." + j + "] ");
            }
            System.out.println();
        }
    }

    public static int buscarBinario(int[][] numeros, int numero) {
        return buscar(numeros, numero, 0, numeros.length - 1);
    }

    private static int buscar(int[][] numeros, int numero, int inicio, int fin) {
        int centro = (inicio + fin) / 2;

        if (fin < inicio) {
            return -1;
        }

        if (numero < numeros[centro][0]) {
            return buscar(numeros, numero, inicio, centro - 1);
        }

        if (numero > numeros[centro][0]) {
            return buscar(numeros, numero, centro + 1, fin);
        }

        if (numero == numeros[centro][0]) {
            return centro;
        }

        return -1;
    }

    public static void imprimirRaiz(int[][] matriz, int N, int M) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("[" + matriz[i][j] + "." + i + j + "] ");
            }
            System.out.println();
        }
    }
}
