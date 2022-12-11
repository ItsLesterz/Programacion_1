/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programacion_2;

/**
 *
 * @author leste
 */
public class Funcion_Recursiva {

    public static void foo(int x) {
        if (x < 10) {
            foo(++x);
        }
        System.out.println("Recursion Foo con x:" + x);
    }

    public static void main(String[] args) {
        foo(1);
    }

}
