/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_Progra1;

import java.util.Calendar;

/**
 *
 * @author leste
 */
public class ClienteAuto {

    private int numeroPlaca;
    private String nombreCliente;
    private String modeloAuto;
    private int ProximaRevision = 5000;
    private int montoTotal;
    private int monto;

    //Fecha de creacion del vehiculo
    Calendar calendario = Calendar.getInstance();
    int año = calendario.get(Calendar.YEAR);

    public static void main(String args[]) {

    }

    public ClienteAuto(int numeroPlaca, String nombreCliente, String modeloAuto) {
        this.numeroPlaca = numeroPlaca;
        this.nombreCliente = nombreCliente;
        this.modeloAuto = modeloAuto;
    }

    public int getNumeroPlaca() {
        return numeroPlaca;
    }

    public String getnombreCliente() {
        return nombreCliente;
    }

    public String getModeloAuto() {
        return modeloAuto;
    }

    public int getProximaRevision() {
        return ProximaRevision;
    }

    public void setProximaRevision(int ProximaRevision) {
        this.ProximaRevision = ProximaRevision;
    }

    public void incrementarMonto(double monto) {
        if (monto >= 0) {
            this.montoTotal += monto;
        }
    }

    public String toString() {
        return "\n***** Datos *****"
                + "\nNombre del cliente : " + nombreCliente
                + "\nNumero de placa    : " + numeroPlaca
                + "\nModelo del auto    : " + modeloAuto
                + "\nProxima Revision   : " + ProximaRevision
                + "\nFecha de Creacion  : " + calendario.getTime() + "\n"
                + "\nMonto Total        : " + montoTotal + "Lps." + "\n";

    }

}
