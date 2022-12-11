/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_Progra1;

import java.util.Scanner;

/**
 *
 * @author leste
 */
public class XO {

    public static void main(String[] args) {

        char[][] tablero = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }

        Scanner leer = new Scanner(System.in);
        System.out.println("**** X-O ****");
        System.out.print("Player 1, ingrese su usuario: ");
        String p1 = leer.nextLine();
        System.out.print("Player 2, ingrese su usuario: ");
        String p2 = leer.nextLine();

        boolean player1 = true;

        boolean juegofinalizado = false;
        while (!juegofinalizado) {

            dibujartablero(tablero);

            if (player1) {
                System.out.println("Turno de " + p1 + "(x): ");
            } else {
                System.out.println("Turno de " + p2 + "(o): ");
            }

            char c = '-';
            if (player1) {
                c = 'x';
            } else {
                c = 'o';
            }

            int fila = 0;
            int columna = 0;

            while (true) {

                System.out.print("Ingrese Fila (0, 1, or 2): ");
                fila = leer.nextInt();
                System.out.print("Ingrese Columna (0, 1, or 2): ");
                columna = leer.nextInt();

                if (fila < 0 || columna < 0 || fila > 2 || columna > 2) {
                    System.out.println("No esta dentro de la posicion, Prueba de nuevo!");

                } else if (tablero[fila][columna] != '-') {
                    System.out.println("Alguien coloco en la posicion, Prueba de nuevo!");

                } else {
                    break;
                }

            }

            tablero[fila][columna] = c;

            if (playergano(tablero) == 'x') {
                System.out.println(p1 + " Ganaste!!");
                juegofinalizado = true;
            } else if (playergano(tablero) == 'o') {
                System.out.println(p2 + " Ganaste!!");
                juegofinalizado = true;
            } else {
                if (tablerolleno(tablero)) {
                    System.out.println("Empate!");
                    juegofinalizado = true;
                } else {
                    player1 = !player1;
                }
            }
        }
        dibujartablero(tablero);

    }

    public static void dibujartablero(char[][] tablero) {
        System.out.println("Tablero: ");
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
    }

    public static char playergano(char[][] tablero) {

        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2] && tablero[i][0] != '-') {
                return tablero[i][0];
            }
        }

        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] == tablero[1][j] && tablero[1][j] == tablero[2][j] && tablero[0][j] != '-') {
                return tablero[0][j];
            }
        }

        if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] != '-') {
            return tablero[0][0];
        }
        if (tablero[2][0] == tablero[1][1] && tablero[1][1] == tablero[0][2] && tablero[2][0] != '-') {
            return tablero[2][0];
        }

        return ' ';

    }

    public static boolean tablerolleno(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
