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
public class Programacion1 {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int codigo=12;
        String nombre="Daniel";
        String apellido="Amaya";
        int edad=18;
        double estatura= 1.73;
        double notaProgramacion1=60;
        double notaAlgebra=85;
        double notaEspañol=60;
        double promedio=(notaProgramacion1+notaAlgebra+notaEspañol)/3;

        System.out.println("Ingresar Nombre: ");
        nombre=leer.next().toUpperCase();
        leer.nextLine().toLowerCase();
        System.out.println("Ingresar Apellido: ");
        apellido=leer.nextLine();
        System.out.println("Ingresar Edad: ");
        edad=leer.nextInt();
        
        System.out.println("***** Datos Personales *****"
                                + "\nCodigo:\t"+codigo+
                                  "\nNombre Completo:\t"+nombre+" "+apellido+
                                  "\nEdad:\t"+edad+" años"+"\nEstatura:\t"+estatura);
        
        System.out.println("***** Notas del Periodo *****\nNota Programacion: "+notaProgramacion1+
                              "\nNota Algebra: "+notaAlgebra
                             + "\nNota Español: "+notaEspañol
                             + "\nPromedio: "+promedio);
    }
    
}
