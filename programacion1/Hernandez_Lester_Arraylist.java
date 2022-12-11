/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *S
 * @author leste
 */
public class Hernandez_Lester_Arraylist {
    public static void main(String[] args) {

        Scanner leer = new Scanner (System.in);
        System.out.println("Que es un ArrayList?");
        System.out.println("La clase ArrayList en Java, es una clase que permite \n"+
                "almacenar datos en memoria de forma similar a los Arrays, con la ventaja de que el \n"+
                "numero de elementos que almacena, lo hace de forma dinámica, es decir, que \n"+
                "no es necesario declarar su tamaño como pasa con los Arrays.\n");
        ArrayList<Integer> lista = new ArrayList<>();
         
        //Metodo add. añade elementos a nuestra lista
        System.out.println("\nPosicion 0: ");
        int pos0=leer.nextInt();
        
        System.out.println("Posicion 1: ");
        int pos1=leer.nextInt();
        
        System.out.println("Posicion 2: ");
        int pos2=leer.nextInt();
        
        lista.add(pos0);
        lista.add(pos1);
        lista.add(pos2);
         
        System.out.println("\nADD");
        System.out.println(lista.toString());
         
        //Metodo remove, elimina elementos de nuestra lista mediente indice
        
        System.out.println("Ingrese poscion del 0 al 2 para removerlo: ");
        int remover=leer.nextInt();
        lista.remove(remover); //Elimino el ultimo elemento, no el elemento 2
         
        System.out.println("\nREMOVE");
        System.out.println(lista.toString());
         
        //Metodo size, indica el numero de elementos de la lista
         
        System.out.println("\nSIZE");
        System.out.println(lista.size());
         
        //Metodo get, devolvemos un elemento de un indice
         
        System.out.println("\nGET");
        System.out.println(lista.get(1)); //Primer elemento
         
        //Metodo Iterator, util para recorrer un arrayList
         
        System.out.println("\nITERATOR");
        Iterator<Integer> it = lista.iterator();
        int num;
        while (it.hasNext()){
            num = it.next();
            System.out.println(num);
             
        }
         
        //Metodo indexOf, util para saber la posicion de un elemento
         
        System.out.println("\nINDEXOF");
        System.out.println(lista.toString());
        System.out.println("De que elemento quiere saber la posicion: ");
        int posicion=leer.nextInt();
        System.out.println("La posicion del elemento indicado es: "+lista.indexOf(posicion));
         
        //Metodo Clear, elimina todos los elementos
        lista.clear();
         
        System.out.println("\nCLEAR");
        System.out.println("Ya no hay elementos! "+lista.toString());
         
        //Metodo isEmpty, indica si un arraylist esta vacio o no
         
        System.out.println("\nisEmpty");
        System.out.println(lista.isEmpty());
        System.out.println("Si es true esta vacio y si es false no esta vacio");
        
    }
}
