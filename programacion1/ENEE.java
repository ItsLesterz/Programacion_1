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
public class ENEE {
    public static void main(String[] args) {
        
    System.out.println("* C A L C U L O  C O N S U M O  E N E R G I A *\n");
    
    Scanner leer = new Scanner(System.in);
    
    System.out.print("Indique el nombre del cliente: ");
    String nombreCliente = leer.nextLine();
    
    System.out.print("Indique zona de residencia { A, B, C}: ");
    char zonaCliente = leer.next().charAt(0);
    
    System.out.print("Indique si el cliente es Diplomatico o Ciudadano: ");
    String tipoCliente=leer.next();
    
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
        case "Diplomatico":    
            
    descuento = (subtotal / 2);
    combustible = (subtotal - descuento) * 0.30;
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
 }
}
