/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion1;

import java.util.Scanner;

/**
 *
 * @author leste
 */
public class EmpresaMain {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaracion de funcion tipo Empresa1 para convocar funciones de dicha clase
        Empresa_1 obj = new Empresa_1();
        int opcion = 0, codigo;
        double horas;
        String nombre;

        while (opcion != 5) {
            System.out.print("\n***Menu Empleados***"+
                    "\n1. Agregar Empleados"+
                    "\n2. Listar Empleados"+ 
                    "\n3. Pagar Empleados"+ 
                    "\n4. Asignar horas"+
                    "\n5. Salir"+
                    "\nIngresar una opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("\n***Agregar Empleado***"+
                                     "\nIngrese Codigo Cliente: ");
                    codigo = leer.nextInt();
                    System.out.print("Ingrese Nombre Empleado: ");
                    nombre = leer.nextLine();
                    //Agrega el codigo y el nombre ingresado al array de empleados
                    obj.agregarV1(codigo, nombre);
                    break;

                case 2:
                    System.out.println("*** Listado de Empleados ***");
                    //Imprime cada uno de los datos de los empleados
                    obj.imprimirEmpleado();
                    break;

                case 3:
                    System.out.print("Ingrese su Codigo de Cliente: ");
                    codigo = leer.nextInt();
                    //Imprime el total a pagarle al empleado basado en el calculo de pagar
                    System.out.println("El total a pagar es de: " + obj.pagarEmpleado(codigo));
                    break;

                case 4:
                    System.out.print("Ingrese el Codigo de Cliente: ");
                    codigo = leer.nextInt();
                    System.out.print("Ingrese las horas a agregar: ");
                    horas = leer.nextDouble();
                    //Cambia el valor de horas 0, al valor ingresado por el usuario, siempre y cuando el codigo sea valido
                    obj.asignarHoras(codigo, horas);
                    break;

                case 5:
                    System.out.println("Ha salido del programa!");
                    break;

                default:
                    System.out.println("LOpcion no valida!");
                    break;
            }
        }
    }
}

