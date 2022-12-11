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
public class Hipotenusa {
     
public static void main(String[] args) {

Scanner input=new Scanner(System.in);

System.out.print("Valor cateto A: ");
double a=input.nextDouble();
System.out.print("Valor cateto B: ");
double b=input.nextDouble();

a=Math.pow(a,2);
b=Math.pow(b,2);

double c=Math.sqrt(a+b);
System.out.println("--------------------------");
System.out.println("Valor de Hipotenusa: "+c);
  }
}

