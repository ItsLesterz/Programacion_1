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
public class Metodo_Up {

    public static int suma(int n) {
        if (n >= 1) {
            return suma(n - 1) + n;
        }
        return 0;
    }
}
