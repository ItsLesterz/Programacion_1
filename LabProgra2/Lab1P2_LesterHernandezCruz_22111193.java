/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabProgra2;

import java.util.Scanner;

/**
 *
 * @author leste
 */
public class Lab1P2_LesterHernandezCruz_22111193 {

        static double NumArray[][];

        public static double[][] matriz(int fila, int columna) {

            System.out.println("\n---------------Matriz Generada-----------");
            NumArray = new double[fila][columna];
            for (int i = 0; i < fila; i++) {

                for (int x = 0; x < columna; x++) {

                    NumArray[i][x] = Math.random() * 101;

                    System.out.print("[" + NumArray[i][x] + "]");

                }
                System.out.println();

            }

            return NumArray;

        }

        public static void PrintResultados(double array[][], int Teta) {
            System.out.println("\n--------Matriz de Raices-------");
            for (double casilla[] : array) {
                System.out.println();
                for (double numero : casilla) {
                    System.out.print("[" + BusquedaBinaria(numero, Teta) + "]");

                }
            }
            System.out.println("\nPrograma Existoso");

        }

        public int leer(int min, int max) {

            return min;

        }

        public static double BusquedaBinaria(double x, int Teta) {
            return BusquedaBinaria(x, 0, x, 0, Teta);
        }

        private static double BusquedaBinaria(double x, double Rmin, double Rmax, double Rmed, int Teta) {
            double dRmed = (Rmax + Rmin) / 2;
            if (Math.pow(dRmed, 2) <= x + (Math.pow(10, -Teta)) && Math.pow(dRmed, 2) >= x - (Math.pow(10, -Teta))) {
                return dRmed;

            } else {

                if (Math.pow(dRmed, 2) > x) {
                    return BusquedaBinaria(x, Rmin, dRmed, dRmed, -Teta);

                } else if (Math.pow(dRmed, 2) < x) {
                    return BusquedaBinaria(x, dRmed, Rmax, dRmed, -Teta);

                }

            }

            return Rmed;

        }

        public static void main(String args[]) {
            
            System.out.println("_____EJERCICIO PRACTICO_____");
            
            Scanner leer = new Scanner(System.in);

            System.out.println("--------- Matrices ---------");

            System.out.print("Ingrese Filas:");

            int y = leer.nextInt();
            System.out.print("Ingrese Columna:");
            int x = leer.nextInt();

            System.out.print("Ingrese el numero del epsilon:");
            int delta = leer.nextInt();

            PrintResultados(matriz(y, x), delta);

        }
}
