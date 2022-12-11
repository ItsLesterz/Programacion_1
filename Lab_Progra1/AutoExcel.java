/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_Progra1;

import java.util.Scanner;

/**
 *
 * @author leste
 */
public class AutoExcel {

    private static final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private static boolean verificarP = false;
    private static ClienteAuto[] clienteauto = new ClienteAuto[50];

    public static int posVacia() {
        for (int i = 0; i < clienteauto.length; i++) {
            if (clienteauto[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public static void agregarCliente(int numPlaca) {
        if (verificarP == true) {
            return;
        } else {
            System.out.println("Ingrese el nombre del cliente: ");
            String nombre = leer.next();
            System.out.println("Ingrese el modelo del auto: ");
            String modelo = leer.next();
            ClienteAuto cliente = new ClienteAuto(numPlaca, nombre, modelo);
            int pos = posVacia();
            clienteauto[pos] = cliente;
        }
    }

    public static void atenderRevision(int numPlaca) {
        for (ClienteAuto clienteAuto : clienteauto) {
            if (clienteAuto != null && clienteAuto.getNumeroPlaca() == numPlaca) {
                System.out.println("Atendiendo la revision: " + clienteAuto.getProximaRevision() + " del cliente " + clienteAuto.getnombreCliente()); // Imprime los datos del cliente
                System.out.println("Ingrese el monto a pagar para esta revision: ");
                int monto = leer.nextInt();
                clienteAuto.incrementarMonto(monto);
                clienteAuto.setProximaRevision(clienteAuto.getProximaRevision() + 5000);
            }
        }
    }

    public static void eliminarClientesCompletos() {
        for (int i = 0; i < clienteauto.length; i++) {
            if (clienteauto[i] != null && clienteauto[i].getProximaRevision() >= 100000) {
                clienteauto[i] = null;
            }
        }
    }

    public static void listarClientes() {
        for (int i = 0; i < clienteauto.length; i++) {
            if (clienteauto[i] != null) {
                System.out.println(clienteauto[i].toString());
            }
        }
    }

    public static void buscarPlaca(int numPlaca) {
        for (ClienteAuto clienteAuto : clienteauto) {
            if (clienteAuto != null && clienteAuto.getNumeroPlaca() == numPlaca) {
                System.out.println("Ya esta registrada la placa");
                verificarP = true;
            }
        }
    }
}
