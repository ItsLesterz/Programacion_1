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
public class ArreglosBidimensionales {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        int matriz[][] = new int[3][5];

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 5; c++) {
                matriz[f][c] = lea.nextInt();
                System.out.println("Ingresar [" + f + "][" + c + "]: ");
            }
        }
        //Imprimir
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matriz[f][c] + "\t");
            }
            System.out.print("");
        }

        for (int f = 0; f < 3; f++) {
            int suma = 0;
            for (int c = 0; c < 5; c++) {
                System.out.print(matriz[f][c] + "\t");
                suma += matriz[f][c];
            }
            System.out.print(" = " + suma + "\n");
            
        }
    }
}
