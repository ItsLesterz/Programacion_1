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
public class Empleado {
    //Atributos
    private int codigo;
    private String nombre;
    private double horas;
    
    //Constructor 
    public Empleado(int codigo,String nombre){
        this.codigo=codigo;
        this.nombre=nombre;
        horas=0;
    }
    
    //Funciones Set & Get
    public void setHoras(double hora){
        this.horas=hora;
    }
    public double getHoras(){
        return horas;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public void imprimir(){
        System.out.println("***** Datos del Empleado *****\n"+
                           "Codigo: "+codigo+
                           "\nNombre: "+nombre+
                           "\nHoras: "+horas);
    }
    public double pagar(){
        double salarioExtra=0,salario,total;
     if(horas>40){
         salarioExtra=(horas-40)*200;
     salario=40*100;
     
     }else{
         salario=horas*100;   
     }
     total=salarioExtra+salario;
                 return total;
    }
    
    public double pagar2(){
        if(horas>40)
            return (40*100)+((horas-40)*200);
        else
            return horas*100;
    }
}




