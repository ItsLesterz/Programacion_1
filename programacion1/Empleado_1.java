/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion1;

/**
 *
 * @author leste
 */
public class Empleado_1 {
//atributos

    private int codigo;
    private String nombre;
    private double horas;

//Constructor
    public Empleado_1(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        horas = 0;
    }

    public Empleado_1(int horas) {
        this.horas = horas;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setHoras(double hora) {
        this.horas = hora;
    }

    public double getHoras() {
        return horas;
    }

    public void imprimir() {
        System.out.println("\n***Datos del Empleado***"
                + "\nCodigo: " + codigo
                + "\nNombre: " + nombre
                + "\nHoras: " + horas);
    }
//Calcular el pago del empleado de acorde a sus horas asignadas

    public double pagar() {
        double salarioExtra = 0, salario, total;
        if (horas > 40) {
            salarioExtra = (horas - 40) * 200;
            salario = 40 * 100;
        } else {
            salario = horas * 100;
        }
        total = salarioExtra + salario;
        return total;
    }

    public double pagar2() {
        if (horas > 40) {
            return (40 * 100) + ((horas - 40) * 200);
        } else {
            return horas * 100;
        }
    }
}
