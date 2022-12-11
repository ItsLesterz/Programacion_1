/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion1;

import java.util.Scanner;

/**
 *
 * @author RetselHerdez
 */
public class EjercicioClase 
{
      public static void main(String[] args) {
          Scanner leer=new Scanner (System.in);
          System.out.println("**** Visita Medica ****");
          //Declarara variables
          double subtotal=0,isv,totalPaga;
          int visita;
          System.out.println("**** Motivo ****\n1-Consultas\t2-Cirugia");
          visita=leer.nextInt();
          
          System.out.println("Nombre del Paciente: ");
          String nombrepac=leer.nextLine();
       
          System.out.println("**** Tipo de Doctor ****\n1-Internista\t2-Cardiologo\t3-Pediatra\t4-Dermatologo");
          int tipo_doctor=leer.nextInt();
          String motivo="",doctor="";
          if(visita==1 && tipo_doctor==1){
              subtotal=1200.56;
              doctor="Internista";
              motivo="Consultas";
          } else if(visita==2 && tipo_doctor==1){
              subtotal=18599.99;
              doctor="Internista";
              motivo="Cirugia";
          } else if(visita==1 && tipo_doctor==2){
              subtotal=1500;
              doctor="Cardiologo";
              motivo="Consultas";
          } else if(visita==2 && tipo_doctor==2){
            subtotal=28395.99;
            doctor="Cardiologo";
              motivo="Cirugia";
          } else if(visita==1 && tipo_doctor==3){
             subtotal=950;
             doctor="Pediatra";
              motivo="Consultas";
          } else if (visita==2 && tipo_doctor==3){
              subtotal=25000;
              doctor="Pediatra";
              motivo="Cirugia";
          } else if(visita==1 && tipo_doctor==4){
              subtotal=1000;
              doctor="Dermatologo";
              motivo="Consultas";
          }else if(visita==2 && tipo_doctor==4){
             subtotal=16799.99;
             doctor="Dermatologo";
              motivo="Cirugia";
          }else{
              System.out.println("Valores ingresados no son validos");
          }
                 
          isv=Math.round((subtotal*0.15)*100)/100;
          totalPaga=Math.round(subtotal+isv);
          
          System.out.println("***** Centro Medico *****\n"+
                             "Paciente:"+nombrepac+
                             "\nMotivo de Visita:"+motivo+
                              "\n\n******Factura*******"+
                              "\nSubtotal: "+subtotal+"Lps."+
                              "\nISV 15%: "+isv+"Lps."+
                               "\nTotal a Pagar: "+totalPaga+"Lps.");
    }
                                                                                                                                                                                                                                                                                                                                                                                                                                       
}
