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
public class Empresa_1 {
    //Atributos
    private int contador = 0;
    private Empleado listaEmp[] = new Empleado[50];

    //Funcion buscar empleado
    public Empleado buscar(int codigo) {
        for (Empleado eph : listaEmp) {
            if (eph != null && eph.getCodigo() == codigo) {
                return eph;
            }
        }
        return null;
    }

    //Agregar empleado, verifica que dicha posicion este vacia y agrega el codigo
    //y el nombre del empleado
    public boolean agregarV1(int code, String name) {
        if (buscar(code) == null) {
            for (int i = 0; i < listaEmp.length; i++) {
                if (listaEmp[i] == null) {
                    listaEmp[i] = new Empleado(code, name);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean agregarV2(int code, String name) {
        if (buscar(code) == null) {
            if (listaEmp[contador] == null) {
                listaEmp[contador] = new Empleado(code, name);
                contador++;
                System.out.println("Se ha agregado el empleado con exito!");
                return true;
            }
        }
        System.out.println("No se ha podido agregar el empleado!");
        return false;
    }

    //Imprime todos los datos de todos los empleados del arreglo, con la funcion imprimir en la clase Empleado
    public void imprimirEmpleado() {
        for (Empleado eph : listaEmp) {
            if (eph != null) {
                eph.imprimir();
            }
        }
    }

    //Retorna el valor obtenido en la clase empleado de pagar
    public double pagarEmpleado(int code) {
        Empleado emp = buscar(code);
        if (emp != null) {
            return emp.pagar();
        } else {
            return 0;
        }
    }

    //Se agregan horas al empleado, primero se verifica que el codigo exista
    public boolean asignarHoras(int code, double horas) {
        if (buscar(code) != null) {
            for (Empleado eph : listaEmp) {
                //Si hay datos en posicion x, y el codigo coincide con el ingresado
                if (eph != null && eph.getCodigo() == code) {
                    //Se utiliza la funcion setHoras para asignar lo que se ingreso y se retorna verdad
                    eph.setHoras(horas);
                    System.out.println("Las horas ingresadas son: " + horas);
                    return true;
                }
            }
        }//En caso que no se encuentre un codigo en el arreglo, se devuelve que no existe
        System.out.println("El usuario no existe");
        return false;
    }
}

