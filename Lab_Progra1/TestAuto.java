/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_Progra1;

import java.util.Scanner;
import static Lab_Progra1.AutoExcel.*;

/**
 *
 * @author leste
 */
public class TestAuto {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opcion;
        do {

            System.out.println("\nLista de números");
            System.out.println("[1] Agregar Cliente");
            System.out.println("[2] Mostrar Clientes");
            System.out.println("[3] Remover Cleintes");
            System.out.println("[4] Listar Clientes");
            System.out.println("[5] Salir\n");
            System.out.println("Ingrese una opción (1-5): ");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el numero de placa: ");
                    int placa = leer.nextInt();
                    buscarPlaca(placa);
                    agregarCliente(placa);
                    break;
                case 2:
                    System.out.println("Ingrese el numero de placa: ");
                    placa = leer.nextInt();
                    atenderRevision(placa);
                    break;
                case 3:
                    eliminarClientesCompletos();
                    break;
                case 4:
                    listarClientes();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (opcion != 5);
    }
}
