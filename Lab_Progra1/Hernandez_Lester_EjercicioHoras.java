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
public class Hernandez_Lester_EjercicioHoras 
{
    public static void main(String[] args) 
    {
        Scanner leer=new Scanner(System.in);
        //Declaracion de Variables
        int numero;
        int hora;
        int minutos;
        int segundos;
        
        System.out.print("Ingrese los segundos: ");
        
        //Proceso de convertir
        numero=leer.nextInt();
        hora=numero/3600;
        minutos=(numero-(3600*hora))/60;
        segundos=numero-((hora*3600)+(minutos*60));
        
        System.out.println(hora+" » hora(s) » "+minutos+" minutos » "+segundos+" segundos «");
    }  
}
