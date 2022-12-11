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
public class Hernandez_Lester_S2 
{   
    public static void main(String[] args) 
    {
      Scanner leer=new Scanner(System.in).useDelimiter("\n");
      
      //Programa #1 - Promedio Alumno
      System.out.print("* * * * P R O M E D I O   D E   A L U M N O * * * *\n\n");
       //Se solicita la informacion personal
       System.out.print("* * * DATOS PERSONALES * * *\n");
               
       System.out.print("Ingrese su Nombre Completo: ");
      
       String nombreCompleto=leer.next();
             
       System.out.print("Ingrese su Numero de Cuenta: "); 
       int numCuenta=leer.nextInt();
       
       System.out.print("Ingrese su Carrera: "); 
       String carrera=leer.next();
       //Se solicitas las notas de los 3 parciales
       System.out.print("\n* * * NOTAS PARCIALES * * *\n");
       System.out.print("Ingrese Nota del 1er Parcial: ");
       double nota1=leer.nextInt();
       
       System.out.print("Ingrese Nota del 2do Parcial: ");
       double nota2=leer.nextInt();
       
       System.out.print("Ingrese Nota del 3er Parcial: ");
       double nota3=leer.nextInt();
       
       double promedio=(nota1+nota2+nota3)/3.0;
       
       System.out.println("Promedio: "+promedio+"%\n");
       
       
       
       //Programa 2 - Cuestionario Virtual
        System.out.print("\n\n* * * * C U E S T I O N A R I O   V I R T U A L * * * *\n");
        
        System.out.print("Ingrese su Nombre Completo: ");
        String nombrecompleto=leer.next();
        
        System.out.print("Numero de Respuestas Correctas: ");
        int rescorrecta=leer.nextInt();
        
        System.out.print("Numero de Respuestas Incorrectas: ");
        int resincorrecta=leer.nextInt();
        
        System.out.print("Numero de Respuestas en Blancos: ");
        int resblanco=leer.nextInt();
        
        int total=(rescorrecta*5-resincorrecta);
        
        System.out.print("Su Puntuación Final es: "+total+"\n");
    }
    
}
