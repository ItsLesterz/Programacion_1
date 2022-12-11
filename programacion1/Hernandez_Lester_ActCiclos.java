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
public class Hernandez_Lester_ActCiclos {
    public static void main(String[] args) {
        int opcion=0;
        boolean End = true;
        Scanner leer=new Scanner(System.in);
        while (End){
            System.out.println("\n\n-------------- Menu Principal --------------" + 
                    "\n\t1. Ejercio ENEE" + 
                    "\n\t2. Cuadro Perfecto" + 
                    "\n\t3. Numeros Primos" +
                    "\n\t4. Ejercio Palabra Vocalista" + 
                    "\n\t5. Salir" +
                    "\n--------------------------------------------" + 
                    "\n\nElija la opcion que desee: ");
            
            opcion = leer.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("**** CALCULO  CONSUMO  ENERGIA ****\n");
    
                    System.out.print("Indique el nombre del cliente: ");
                    String nombreCliente = leer.nextLine();
                    leer.nextLine();
                    System.out.print("Indique zona de residencia { A, B, C}: ");
                    char zonaCliente = leer.next().charAt(0);
    
                    System.out.print("Indique si el cliente es Diplomatico o Ciudadano: ");
                    String tipoCliente=leer.next().toLowerCase();
    
                    System.out.print("Indique consumo en  KW/h: ");
                    int consumoCliente = leer.nextInt();
    
                    int cliente = 0;
                    double totalConsumo = 0;
                    double subtotal;
                    double combustible=0.30;
                    double descuento;
    
                    switch(zonaCliente)
                    {
                        case 'A':
                        case 'a':
                            if(consumoCliente <= 100){
                                totalConsumo = consumoCliente * 50;
                
                            }else if(consumoCliente >100 && consumoCliente <1000){
                               totalConsumo = consumoCliente * 100;
                
                            }else if(consumoCliente >1000){
                totalConsumo = consumoCliente * 200;
            
                            }else
                                System.out.println("es un numero negativo");
                            break;
            
                        case 'B':
                        case 'b':
                           if(consumoCliente <= 100){
                                totalConsumo = consumoCliente * 30;
                
                            }else if(consumoCliente >100 && consumoCliente <1000){
                                totalConsumo = consumoCliente * 60;
                
                           }else if(consumoCliente >1000){
                totalConsumo = consumoCliente * 120;
            
                            }else
                                System.out.println("es un numero negativo");
                            break;
            
                        case 'C':
                        case 'c':
                            if(consumoCliente <= 100){
                                totalConsumo = consumoCliente * 20;
                
                            }else if(consumoCliente >100 && consumoCliente <1000){
                                totalConsumo = consumoCliente * 40;
                
                            }else if(consumoCliente >1000){
                                totalConsumo = consumoCliente * 80;
            
                            }else
                                System.out.println("es un numero negativo");
                            break;
            
                        default:
                            System.out.println("Zona indicada incorrecta!");
                            break;
            
                    }
                    subtotal=totalConsumo;

                    switch(tipoCliente){
                        case "diplomatico":

                    descuento = (subtotal / 2);
                    combustible = (subtotal - descuento) * combustible;
                    subtotal = subtotal - descuento + combustible;
                    cliente++;
                    break;
    
                        case "Ciudadano":
                        case "ciudadano":
            
                    combustible = subtotal * 0.30;
                    subtotal = subtotal + combustible;
                    cliente++;
                    }
                    if(cliente>0){
                    System.out.printf("El cliente(a) %s tiene un total a pagar de: L %.2f\n", nombreCliente, subtotal);
                    }else
                            System.out.println("el tipo de cliente es incorrecto");
                    break;

                    case 2:
                    System.out.println("**** CUADRADO PERFECTO ****");
                    int num;
                    double sum,n;
     
                    System.out.print("Ingrese Numero:");
                    num = leer.nextInt();
      
                    sum = Math.sqrt(num);
                    n = sum;
                    if(n*n ==num)
                    {
                       if(sum*sum == num)
                       {
                          System.out.print("Es cuadrado Perfecto");
                       }
                    }
                    else{
                       System.out.print("No es un cuadrado Perfecto");
                    } 
                    break;  
    
                    case 3:
                        System.out.println("*****  EL PRIMO *****");
                        System.out.print("\nIngrese un número: ");
   
                        int numero = leer.nextInt();

                        if (numero <= 0) {
                            System.out.printf("El número debe ser mayor que cero%n");
                        } else {
                            int cant_divisores = 0;
                            int i = 2;
                            while (i < numero) {
                                if (numero % i == 0) {
                                    cant_divisores++;
                                }
                                i++;
                            }
                            if (cant_divisores == 0 && numero>1) {
                                System.out.printf("El número es primo%n");
                            } else {
                                System.out.printf("El número no es primo%n");
                            }
                        }
                    break;  
                    
                    case 4:
                     System.out.println("***** PALABRA VOCA-LISTA *****");
        
        
                     System.out.print("Ingrese Texto: ");
                     String frase = leer.next();

                     int a=0,e=0,i=0,o=0,u=0;
                     int longitud = frase.length();
                     int vocales=0;
                     int counter = 0;
                     char letra;

                 do {
                    letra = frase.charAt(counter);

                     switch(letra) {
            
                     case 'a':
                     case 'A':
                      a++;
                      vocales++;
                     break;

                     case 'e':
                     case 'E':
                      e++;
                      vocales++;
                     break;
 
                     case 'i':
                     case 'I':
                      i++;
                      vocales++;
                     break;

                     case 'o':
                     case 'O':
                      o++;
                     vocales++;
                     break;

                     case 'u':
                     case 'U':
                      u++;
                      vocales++;
                     break;

                     default:
                     break;
                     }
                     counter++;
        
                 }while(counter < longitud);

                     if(vocales>=4){
                     System.out.println("**PALABRA VOCA-LISTA**");
                    } else if(vocales<4){
                     System.out.println("No es palabra vocalista!");
                     }
  
                    break;
                    
                    case 5:
                        System.out.println("Se termino el programa!");
                        End = false;
                        
                 }
                }

         }
}
 

        