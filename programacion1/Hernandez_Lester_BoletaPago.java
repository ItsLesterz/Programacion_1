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
public class Hernandez_Lester_BoletaPago {
    public static void main(String[] args) 
    {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("---------------Informacion---------------");
        System.out.print("Nombre Completo: ");
        String nombre=leer.nextLine();
        System.out.print("Codigo: ");
        int codigo=leer.nextInt();
        System.out.print("Horas Trabajas: ");
        int horastrabajadas=leer.nextInt();
         
        int horasextra=(0);
        float pagosdobles=(0);
        float pagostriples=(0);
        float salariobase;
        int hora;
        
        if(horastrabajadas>40 && horastrabajadas<=48){
                horasextra= horastrabajadas-40;
                pagosdobles=horasextra*51.53f*2;                
                salariobase=40*51.53f;
                
        }else if(horastrabajadas > 48){
                salariobase=40*51.53f;
                horasextra= horastrabajadas-40;
                hora=horastrabajadas-48;
                pagostriples=hora*51.53f*3;
                pagosdobles=824.48f;
                
        }else{
            salariobase=horastrabajadas*51.53f;
        }        
                               
        float salarioneto=(salariobase+pagosdobles+pagostriples);
        
        System.out.println("\n\n********* Boleta de Pago *********");
        
        System.out.println("Codigo de Empleado: "+codigo);
        System.out.println("Nombre Completo del Empleado: "+nombre);
        System.out.println("Sueldo Base: "+salariobase+" Lps");
        System.out.println("Tiempo Trabajado: "+horastrabajadas+" Horas");
        System.out.println("Horas Extras: "+horasextra+" Horas");
        System.out.println("Pago de Horas Doble: "+pagosdobles+" Lps");
        System.out.println("Pago de Horas Triple: "+pagostriples+" Lps");
        System.out.println("Sueldo Neto: "+salarioneto+" Lps");        
    }
}
    



