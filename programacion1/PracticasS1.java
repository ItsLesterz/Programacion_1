/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion1;

/**
 *
 * @author RetselHerdez
 */
public class PracticasS1 
{ 
    public static void main(String[] args) 
    {
        System.out.println("**** D A T O S  A L U M N O S ****");
        // Comentarios en linea
        /*
        Comentarios en Bloque
        */
       
        /* 
        Tipo de Datos 
        1) String - Texto        - ? cant x 2 bytes - "Hola"
        2) Char - Caracteres     - 1 o 2 bytes      - '@'
        3) Int - Entero Corto    - 4 bytes          - 1,23,1345,...
        4) Long - Entero Largo   - 8 bytes          - 1,23,1345,...
        5) Float - Decimal       - 8 bytes          - 2.12,23.6,...
        6) Double - Decimal     - 8 bytes          - 2.12,23.6,...
        7) Boolean - Logico      - 1 bytes          - True or False
        8) Object - Objeto       - ?                - Arreglo, Clase,...
        
        ++Variables
        Sintacis: 1 - Tipo Dato IdVariable = "Texto o  Palabra";
                  2 - Tipo Dato IdVariable;
                  2.1 IdVariable = 12.34;
        */
        
        int numeroCuenta=22111193;
        String nombre="Lester";
        String apellido="Hernandez";
        String carrera="Ing. Sistemas Computacionales";
        int edad=31;
        double promedio=60.3;
        boolean estado=true;
        char genero= 'M';
        
        System.out.println("Cuenta: "+numeroCuenta);
        System.out.println("Nombre Completo: "+nombre+" "+apellido);
        //System.out.println(apellido);
        System.out.println("Carerra: "+carrera);
        System.out.println("Edad: "+edad+ " años");
        System.out.println("Promedio: "+promedio);
        System.out.println("Estado: "+estado);
        System.out.println("Genero: "+genero);
        
    }
}
