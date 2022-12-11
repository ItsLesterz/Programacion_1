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
public class probando {
    public static void main(String args[])
    {
       
        //Ejercicio Numero 1
        System.out.println("*** Tablas de Multiplicacion***\n");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese No. de Tabla: ");
        int tabla = leer.nextInt();
        
        int control = 1;
        int resultado;
        
        while(control <= 12)
        {
            resultado = tabla * control;
            System.out.printf("%d x %d = %d\n", tabla, control, resultado);
            control++;
            
        }
    }
}

