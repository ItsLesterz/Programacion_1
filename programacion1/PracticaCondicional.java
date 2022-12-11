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
public class PracticaCondicional 
{
    public static void main(String[] args) 
    {
     /*
     Operadores Condicionales
     1) If - Else
     2) Switch - Case
        
     Los Resultados Logicos
     1) Verdadero - True
     2) Falaso - False
        
    Pruebas Logicas o condiciones
        Sintaxis:
        IF (prueba logica){
        Bloque codigo
        }else{
        Bloque Codigo
        }
    1) Simple - If
    2) Varios - And=&& / Or=||
    3) Anidadas
     */   
        Scanner leer=new Scanner(System.in);
        //IF-simple
        
        // Declarar variable
        int numero;
        int numeroX=0;
        System.out.print("Ingresar numero: ");
        numero=leer.nextInt();//12
        
        //Evaluar o tomar decision
          //False o Tru=True
        if(numero<=9 && numero >=0){
            System.out.println(numero+" es de un digito");
        
        }else if(numero>=10 && numero <100){
                System.out.println(numero+" es de dos digitos");
        }else if(numero>=100 && numero<1000){
            System.out.println(numero+ " es de tres digitos");
        }else 
            System.out.println(numero+" Error!");
    }
}
