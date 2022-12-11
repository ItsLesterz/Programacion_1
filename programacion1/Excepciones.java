/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion1;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author leste
 */
public class Excepciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        try {
            System.out.print("Ingresar un numero: ");
            int numero=leer.nextInt();
            System.out.println("Nnumero es: "+numero);
        } catch (InputMismatchException e) {
            System.out.println("JAJAJAJA te equivocaste ;)");
        }
    }
}
