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
public class Hernandez_Lester_Examen1 {
    public static void main(String[] args) {
        int opcion=0;
        boolean End = true;
        Scanner leer=new Scanner(System.in);
        while (End){
            System.out.print("\n\n-------------- Menu Principal --------------" + 
                    "\n\t1. Tipo V & F" + 
                    "\n\t2. String Mayor" + 
                    "\n\t3. ENEE" +
                    "\n\t4. Salir" +
                    "\n--------------------------------------------" + 
                    "\n\nElija la opcion que desee: ");
            
            opcion = leer.nextInt();
            
            switch (opcion){
                case 1://Tipo V & F
                    System.out.println("1- Si ejecuto “hola”.charAt(1) me devolverá el carácter h");
                    System.out.println("R//Falsa, porque al comenzar en 1 contara la letra 'o' ya que la lera 'h' es la letra 0");//Respuesta de la N.1
                    System.out.println("2- Todas las clausulas a poner dentro de un switch comienzan con la palabra case.");
                    System.out.println("R//Verdadero");//Respuesta de la N.2
                    System.out.println("3- La instrucción continue no hace que un ciclo termine pero ignora el código restante");
                    System.out.println("R//Verdadero");//Respuesta de la N.3
                    System.out.println("4- Si yo tengo la instrucción n += n * b, de forma extendida esto será n= n + n*b");
                    System.out.println("R//Verdadero");//Respuesta de la N.4
                    System.out.println("5- Si int a = 10, b= 50; y String c = “Daniel”; si tengo una condición booleana:" +
                    "IF((a > 0 && b <= 50) || c.length() >= 6)), su valor resultante es false.");
                    System.out.println("R//Falsa, porque las 3 condiciones se cumplen y todos los valroes estan de acuerdo al rango.");//Respuesta de la N.5
                break;
                
                case 2://String Mayor
                    System.out.println("***** STRING MAYOR *****");
                    int counter=1,cantidad=0,texto1,texto2;
                    String palabra1,palabra2="";
                    System.out.print("Cantidad de Palabras: ");
                    cantidad = leer.nextInt();

                    do{
                        System.out.print("Palabra "+counter+": ");
                        palabra1 = leer.next().toLowerCase();
                        counter++;
                        texto1=palabra1.length();
                        texto2=palabra2.length();
                        if(texto2<texto1){
                            palabra2=palabra1;
                        }
                                
                        } while(counter<=cantidad);
                         System.out.println("La palabra mas larga es: "+palabra2);
                break;
                
                case 3://ENEE
                    System.out.println("\n***** CALCULO ENEE *****\n");
                    
                    String opcion2 ="";
                    do{
                    double subtotalTotal=0;
                    double total=0;
                    double seguridad=0;
                    
    
                    System.out.print("Indique el nombre del cliente: ");
                     String nombreCliente = leer.next();
                     
                     System.out.print("Indique el nombre del apellido: ");
                     String apellidoCliente = leer.next();
         
                     System.out.println("Tipo empleado (maestro,ingeniero y obrero): ");
                    String tipoCliente=leer.next();
    
                     System.out.print("Indique consumo en salario: ");
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
                    System.out.println("es un numero negativo");
                    
                 
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
                    System.out.println("es un numero negativo");
                    
                   
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
                    System.out.println("es un numero negativo");
                    
                    
                    break;
                   
                    }
                    seguridad = total * 0.03;
                    total = total - seguridad;
                    
                     
                    System.out.println("nombre: "+nombreCliente+" "+apellidoCliente);
                    System.out.println("tipo cliente: "+tipoCliente);
                    System.out.println("salario: "+salarioCliente);
                    System.out.println("Total a pagar: "+total);
                    
                    System.out.println("Desea repetir el programa?.\n Si \n No \n Escoge una opcion: ");
                                opcion2=leer.next();
                                
                    }while(opcion2.equalsIgnoreCase("Si")||opcion2.equalsIgnoreCase("Si"));
                    
                break;
                
                case 4://Salir del Programa
                System.out.println("Se termino el programa!");
                End = false;
                    
                
            }
        }
    }
}