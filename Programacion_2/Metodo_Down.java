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
public class Metodo_Down {

    public static int suma(int n, int sum) {
        if (n >= 1) {
            return suma(n - 1, sum + n);
        }
        return sum;
    }
}
