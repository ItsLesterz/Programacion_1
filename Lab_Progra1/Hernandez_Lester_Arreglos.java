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
public class Hernandez_Lester_Arreglos {
    public static void main(String[] args) {
        int opcion=0;
        boolean End = true;
        Scanner leer=new Scanner(System.in);
        
        while (End){
            System.out.print("\n\n-------------- Menu Principal --------------" + 
                    "\n\t1. Abecesario" + 
                    "\n\t2. Notas" + 
                    "\n\t3. Ordenamiento Burbuja" +
                    "\n\t4. Mayor y Menor" +
                    "\n\t5. Salir del Programa" +
                    "\n--------------------------------------------" + 
                    "\n\nElija la opcion que desee: ");
             opcion = leer.nextInt();
          switch (opcion){
              case 1://Abecedario
                 System.out.println("******** Abecedario ********");
        
                 char mayusculas[] = new char[26];
                 for (int i = 65, j = 0; i <= 90; i++, j++) {
                     mayusculas[j] = (char) i;
                }
                 String cadena = "";
                int eleccion = -1;//si es -1 se cierra el programa
 
                 do {
                     System.out.println("Elija un indice entre 0 y " + (mayusculas.length - 1));//elegir una opcion en numeros del abecedario
                     eleccion = leer.nextInt();
 
                     if (!(eleccion >= 0 && eleccion <= mayusculas.length - 1)) {
                         System.out.println("Error, inserte otro numero");//al ingresar un numero mayor a 25, dara error
                     } else {
                         if (eleccion != -1) {
                             cadena += mayusculas[eleccion];
                         }
                     }
 
                 } while (eleccion != -1);
 
                 System.out.println(cadena);
        
                  break;
                  
              case 2://Notas
                  System.out.println("****** Nota Alumos ******");
                  Scanner lea=new Scanner(System.in);
                  System.out.print("Introduzca el número de alumnos: ");
                  int numAlumnos = Integer.parseInt(lea.nextLine());

                  //las variables que se van a usar
                  String[] nombres = new String[numAlumnos];
                  double[] notasN = new double[numAlumnos];
                  String[] notasS = new String[numAlumnos];

                  //for para que pida el nombre de cada alumno
                  for (int i = 0; i < nombres.length; i++) {
                      System.out.print("\nIntroduzca el nombre del alumno: ");
                      nombres[i] = lea.nextLine();
                      do {//un do while para evaluar la nota y saber su estado 
                          System.out.print("Introduzca la nota entre 0 y 10: ");
                          notasN[i] = Double.parseDouble(lea.nextLine());
                          //if else para el estado de la nota
                          if (notasN[i] >= 0 && notasN[i] < 5) {
                              notasS[i] = "Suspenso";
                          } else if (notasN[i] >= 5 && notasN[i] < 7) {
                              notasS[i] = "Bien";
                          } else if (notasN[i] >= 7 && notasN[i] < 9) {
                              notasS[i] = "Notable";
                          } else if (notasN[i] >= 9 && notasN[i] <= 10) {
                              notasS[i] = "Sobresaliente";
                          } else {
                              notasS[i] = "nota incorrecta";
                          }
                      } while (notasN[i] < 0 || notasN[i] > 10);//mientras las notas sean mayor a 0 o menor a 10			
                  }

                  System.out.println(" ");
                  //un for para imprimir el nombre y cuenta de los alumnos
                  for (int i = 0; i < nombres.length; i++) {
                      System.out.println("La nota de " + nombres[i] + " es " + notasN[i] + ", Estado: " + notasS[i]);
                  }

                  break;
                  
              case 3://Ordenamiento Burbuja
                  System.out.println("****** Ordenamiento Burbuja ******");
                  System.out.println("Este programa ejecuta el ordenamiento burbuja con un array con una tamano de 20");

                  int ArrayNumbers[] = new int[20];

                  for (int i = 0; i < ArrayNumbers.length; i++) {
                      //asignamos 20 numeros radom entre 0 y 20

                      ArrayNumbers[i] = (int) (Math.random() * ArrayNumbers.length);

                  }

                  for (int a : ArrayNumbers) {
                      System.out.println(a);
                  }
                  //Aqui se inicia el metodo burbuja el metodo burbuja consiste en que los numeros menores seran lo que sobresalen,
                  /*dentro de un Array .En este procedimiento comparamos el numero de la posicion 0  y 1(0>1) y si x integral
                  de la posicion 0 es mayor a la siguiente se intercambian ambos. esto se repite a lo largo de l array
                  */
                  for (int i = 0; i < (ArrayNumbers.length); i++) {
                      //Se ha ecplicado qeu no se neceistan de muchos ciclos para ordenarlos seria suficeinte con el tamaño del array.//
                      for (int x = 0; x < ArrayNumbers.length - 1; x++) {
                          //negativo 1 para evitar salirnos del ranog y que el programa falle

                          if (ArrayNumbers[x] > ArrayNumbers[x + 1]) {
                              //guardamos numero actual
                              int numero_Actual = ArrayNumbers[x];
                              //remplazamos primea posicion con la siguiente
                              ArrayNumbers[x] = ArrayNumbers[x + 1];
                              //remplazamos la siguiente con el anterior
                              ArrayNumbers[x + 1] = numero_Actual;
                          }
                      }
                  }
                  System.out.println("Numero Ordenados:");
                  //imprimimos el array ordenado
                  for (int a : ArrayNumbers) {
                      System.out.println(a);
                  }                 
                  break;
                  
              case 4://Mayor y Menor
                  
                  System.out.println("******* Mayor y Menor *******");
                  System.out.println("Ingrese el tamaño del arreglo: ");
                  int tam = leer.nextInt();
                  int[] nums = new int[tam];

                  System.out.print("Ingrese los " + tam + " numeros:");
                  for (int i = 0; i < nums.length; i++) {
                      nums[i] = leer.nextInt();
                  }
                  int mayor = nums[0]; //mayor momentaneo por defecto
                  int menor = nums[0]; //menor momentaneo por defecto
                  int num = 0;
                  for (int i = 0; i < nums.length; i++) {
                      num = nums[i];
                      if (num > mayor) // ¿actual numero es mayor al "mayor" que tengo almacenado?
                      {
                          mayor = num; // si es mayor reemplazar, ahora tengo un nuevo mayor
                      }
                      if (num < menor) // ¿actual numero es menor al "menor" que tengo almacenado?
                      {
                          menor = menor;//si es menor reemplazar, ahora tengo un nuevo menor
                      }
                  }
                  int cantMayor = 0;
                  int cantMenor = 0;
                  for (int j = 0; j < nums.length; j++) {
                      num = nums[j];
                      if (num == mayor) {
                          cantMayor++;
                      }
                      if (num == menor) {
                          cantMenor++;
                      }
                  }
                  System.out.println();
                  System.out.println("El mayor numero es: " + mayor + " y se repite  " + cantMayor + " veces");
                  System.out.println("El menor numero es: " + menor + " y se repite  " + cantMenor + " veces");

                  break;
                  
              case 5://Salir del Programa
                System.out.println("Se termino el programa!");
                End = false;
          }
    }
  }
}

