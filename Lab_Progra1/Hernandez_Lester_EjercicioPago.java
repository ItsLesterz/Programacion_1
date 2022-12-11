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
public class Hernandez_Lester_EjercicioPago 
{
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
        System.out.print("Categoria: ");
        int categoria=leer.nextInt();
        
        int horasextra=(0);
        float pagosextras=(0);
        float salariobase=35.99f;
        float pagotrabajado=(0);
        
        switch(categoria){
            case 1:
                horasextra= horastrabajadas-40;
                pagosextras=horasextra*40;
                horastrabajadas=horastrabajadas-horasextra;
                pagotrabajado=horastrabajadas*salariobase;
                break;
            case 2:
                horasextra= horastrabajadas-40;
                pagosextras=horasextra*50;
                horastrabajadas=horastrabajadas-horasextra;
                pagotrabajado=horastrabajadas*salariobase;
                break;
            case 3:
                horasextra=horastrabajadas-40;
                pagosextras=horasextra*85;
                horastrabajadas=horastrabajadas-horasextra;
                pagotrabajado=horastrabajadas*salariobase;
                break;
            case 4:
                horasextra=horastrabajadas-40;
                pagosextras=horasextra*salariobase;
                horastrabajadas=horastrabajadas-horasextra;
                pagotrabajado=horastrabajadas*salariobase;;
                break;
            default:
                break;
        }
        
        float salarioneto=(pagotrabajado+pagosextras);
        
        System.out.println("\n\n--------------Boleta de Pago--------------");
        
        System.out.println("Codigo: "+codigo);
        System.out.println("Nombre Completo: "+nombre);
        System.out.println("Salario Base: "+pagotrabajado+"$");
        System.out.println("Horas Trabajas: "+horastrabajadas);
        System.out.println("Categoria: "+categoria);
        System.out.println("Horas Extras: "+horasextra);
        System.out.println("Salario Neto: "+salarioneto+"$");
         
    }
    
}
