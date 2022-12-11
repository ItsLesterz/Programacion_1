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
public class CUADRADO_PERFECTO {
     public static void main(String [] args)
      {
         int num;
         double sum,r;
         Scanner leer=new Scanner(System.in);
         System.out.print("Ingrese Numero:");
         num = leer.nextInt();
      
         sum = Math.sqrt(num);
         r = sum;
         if(r*r == num)
         {
            if(sum*sum == num)
            {
               System.out.print("Es cuadrado Perfecto");
            }
         }
         else{
            System.out.print("No es un cuadrado Perfecto");
         }
      }
   }
