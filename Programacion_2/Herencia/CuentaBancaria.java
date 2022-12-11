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
public class CuentaBancaria {
 //Variables
    protected int numero;
    protected String cliente;
    protected double saldo;
    protected double tasa;
    protected Calendar creacion;
    
    //Constructor Padre
    public CuentaBancaria (int numero, String cliente,double tasa){
        this.numero=numero;
        this.cliente=cliente;
        this.saldo=500;
        this.tasa=tasa;
        this.creacion=Calendar.getInstance();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTasa() {
        return tasa;
    }

    public Calendar getCreacion() {
        return creacion;
    }
    
    public boolean retirar(double monto){
        if(saldo>monto){
            saldo-=monto;
            return true;
        }
        return false;
    }
    public void depositar (double monto){
        if(monto>0){
            saldo += monto;
        }else{
            System.out.println("Su deposito debe ser mayor que 0 - "+monto+"Lps");
        }
    }
    public String toString(){
        return "{Numero: "+numero+",Cliente: "+cliente+",Saldo: "+saldo+",Tasa: "+tasa+"}";
    }
}
