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
public class Notas {
    public static void main(String[] args) {
        System.out.println("** N O T A  A L U M N O S **");
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduzca el número de alumnos: ");
        int numAlumnos = Integer.parseInt(leer.nextLine());

        //las variables que se van a usar
        String[] nombres = new String[numAlumnos];
        double[] notasN = new double[numAlumnos];
        String[] notasS = new String[numAlumnos];

        //for para que pida el nombre de cada alumno
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("\nIntroduzca el nombre del alumno: ");
            nombres[i] = leer.nextLine();
            do {//un do while para evaluar la nota y saber su estado 
                System.out.print("Introduzca la nota entre 0 y 10: ");
                notasN[i] = Double.parseDouble(leer.nextLine());
                //if else para el estado de la nota
                if (notasN[i] >= 0 && notasN[i] < 5) {
                    notasS[i] = "Suspenso";
                } else if (notasN[i] >= 5 && notasN[i] < 7) {
                    notasS[i] = "Bien";
                } else if (notasN[i] >= 7 && notasN[i] < 9) {
                    notasS[i] = "Notable";
                } else if (notasN[i] >= 9 && notasN[i] <= 10) {
                    notasS[i] = "Sobresaliente";
                } else {
                    notasS[i] = "nota incorrecta";
                }
            } while (notasN[i] < 0 || notasN[i] > 10);//mientras las notas sean mayor a 0 o menor a 10			
        }

        System.out.println(" ");
        //un for para imprimir el nombre y cuenta de los alumnos
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("La nota de " + nombres[i] + " es " + notasN[i] + ", Estado: " + notasS[i]);
        }
    }
}
