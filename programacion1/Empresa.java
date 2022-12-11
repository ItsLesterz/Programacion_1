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
public class Empresa {
    //Atributos
    private String nombreEmpresa;
    private int contador=0;
    private Empleado listaEmp[];
    
    //Constructor
    public Empresa(String nombreE,int cantidadEmpleado){
        this.nombreEmpresa=nombreE;
        listaEmp=new Empleado[cantidadEmpleado];
    }
   
    public Empleado buscar(int codigo){
        for(Empleado eph:listaEmp){
            if(eph!=null && eph.getCodigo()==codigo);
            return eph;
        }
        return null;
    }   
    //Agregar empleado
    public boolean agregarV1(int code, String name){
       if(buscar(code)==null){
           for(int posicion=0;posicion<listaEmp.length;posicion++)
               if(listaEmp[posicion]==null){
                   listaEmp[posicion]=new Empleado(code,name);
                   return true;
               }
       }
       return false;
    }
    public boolean agregarV2(int code, String name){
        if(buscar(code)==null){
            if(listaEmp[contador]==null){
                listaEmp[contador]=new Empleado(code,name);
                contador++;
                return true;
            }
        }
        return false;
    }
}
