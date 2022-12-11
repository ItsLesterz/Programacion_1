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
public class Examen_Enee {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
         System.out.println("***** CALCULO ENEE *****\n");
                    String opcion2 ="";
                    do{
                    double subtotalTotal=0;
                    double total=0;
                    double seguridad=0;
                    
                    System.out.println("Ingrese Nombre Completo: ");
                    String nombre=leer.nextLine();
         
                    System.out.println("Tipo Empleado: ");
                    String tipoCliente=leer.next();
    
                    System.out.print("Indique Consumo en Salario: ");
                    int salarioCliente = leer.nextInt();
                    
                    switch(tipoCliente){
                       
                    case "maestro":
                    case "Maestro":
                    if(salarioCliente > 0 && salarioCliente <= 12000){
                    subtotalTotal = salarioCliente;
                    total=salarioCliente+subtotalTotal;
                
                     }else if(salarioCliente > 12000 && salarioCliente <= 500000){
                    
                    total=salarioCliente;
                
                      }else if(salarioCliente > 500000){
                    subtotalTotal = salarioCliente-2000;
                    total=subtotalTotal;
            
                    }else if(salarioCliente < 0)
                    System.out.println("Es un numero negativo!");
                    break;
            
                    case "ingeniero":
                    case "Ingeniero":
                    if(salarioCliente > 0 && salarioCliente <= 12000){
                    subtotalTotal = salarioCliente*1;
                    total=salarioCliente+subtotalTotal;
                
                     }else if(salarioCliente > 12000 && salarioCliente <= 500000){
                    subtotalTotal = salarioCliente * 0.03;
                    total=salarioCliente+subtotalTotal;
                
                      }else if(salarioCliente > 500000){
                    subtotalTotal = salarioCliente-15000;
                    total=subtotalTotal;
            
                    }else if(salarioCliente < 0)
                    System.out.println("Es un numero negativo!");
                    break;
            
                    case "obrero":
                    case "Obrero":
                    if(salarioCliente > 0 && salarioCliente <= 12000){
                    subtotalTotal = salarioCliente*0.0005;
                    total=salarioCliente+subtotalTotal;
                
                     }else if(salarioCliente > 12000 && salarioCliente <= 500000){
                    subtotalTotal = salarioCliente * 0.02;
                    total=salarioCliente+subtotalTotal;
                
                      }else if(salarioCliente > 500000){
                    subtotalTotal = salarioCliente-10000;
                    total=subtotalTotal;
            
                    }else if(salarioCliente < 0)
                    System.out.println("Es un numero negativo!");
                    break;
                    
                    default:
                        System.out.println("Ingrese otra vez: ");
            
                    }
                    seguridad = total * 0.03;
                    total = total - seguridad;
                     
                    System.out.println("Nombre: "+nombre);
                    System.out.println("Tipo Cliente: "+tipoCliente);
                    System.out.println("Salario: "+salarioCliente);
                    System.out.println("Total a Pagar: "+total);
                    System.out.println("Desea repetir el programa?.\n Si \n No \n Escoge una opcion: ");
                    opcion2=leer.next();
                                
                    }while(opcion2.equalsIgnoreCase("Si")||opcion2.equalsIgnoreCase("Si"));
         }
    }

