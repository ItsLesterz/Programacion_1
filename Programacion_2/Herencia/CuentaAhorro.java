/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programacion_2.Herencia;

import java.util.Calendar;

/**
 *
 * @author leste
 */
public class CuentaAhorro extends CuentaBancaria {

    //Variables propias
    private Calendar ultimaModif;
    public static final double TASA_AHORRO = 0.03;

    public CuentaAhorro(int numero, String cliente) {
        super(numero, cliente, TASA_AHORRO);
        ultimaModif=Calendar.getInstance();
    }

    public Calendar getUltimaModif() {
        return ultimaModif;
    }
    public boolean estado(){
        Calendar hoy=Calendar.getInstance();
        hoy.add(Calendar.MONTH,-6);
        return hoy.before(ultimaModif);
    }
    @Override
    public String toString(){
        return super.toString()+ "- Estado: "+estado();
    }
    @Override
    public boolean retirar (double monto){
        if(estado()){
            return super.retirar(monto);
        }
        return false;
    }
    @Override
    public void depositar(double monto){
        if(!estado()){
            monto-=monto*0.1;
            super.depositar(monto);
        }
    }
}
