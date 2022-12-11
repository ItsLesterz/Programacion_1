/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_Progra1;

import java.util.Scanner;

/**
 *
 * @author RetselHerdez
 */
public class Hernandez_Lester_ExamenLab1 {
    public static void main(String[] args) {
        int opcion=0;
        int veces1 = 0;
        int veces2 = 0;
        int veces3 = 0;
        int veces4 = 0;
        
        boolean End = true;
        Scanner leer=new Scanner(System.in);
        while (End){
            System.out.print("\n\n-------------- Menu Principal --------------" + 
                    "\n\t1. Lavanderia" + 
                    "\n\t2. Al Reves" + 
                    "\n\t3. Caracter Popular" +
                    "\n\t4. Salir del Programa" +
                    "\n--------------------------------------------" + 
                    "\n\nElija la opcion que desee: ");
             opcion = leer.nextInt();
          switch (opcion){
              case 1://Lavanderia
                  System.out.println("****** LA LAVANDERIA ******");
        int formal = 0;
        int casual = 0;
        int colchas=0;
        int suavizante=0;
        int repeticion=0;
        int tipo=0;
        double subtotal=0;
        double total=0;        
        String repe;
        
        
        do{
        System.out.println("\nIngrese tipo de prenda: \n1.Formal \n2.Casual \n3.Colchas");
        System.out.print("Opcion: ");
        tipo=leer.nextInt();
 
        while(true){
        if(tipo>3||tipo<=0){
            System.out.println("\nIngrese tipo de prenda: \n1.Formal \n2.Casual \n3.Colchas");
            tipo = leer.nextInt();
            
            
        }else{
            
            break;
        }   
        }
  
        
        
        System.out.println("\nTipo Lavado: \n1.Normal \n2.Dryclean");
        System.out.print("Opcion: ");
        int lavado=leer.nextInt();
        while(true){
        if(lavado>2||lavado<=0){
            System.out.println("\nTipo Lavado: \n1.Normal \n2.Dryclean");
            lavado = leer.nextInt();   
        }else{            
            break;
        }   
        }
        
        switch (tipo) {
            case 1:
                if(tipo==1 && lavado==1){
                    formal++;
                    repeticion=repeticion*50;
                    subtotal = formal*50+repeticion;
                    
                    
                }else if (tipo==1 && lavado==2){
                    formal++;
                    repeticion=repeticion*100;
                    subtotal = formal*100+repeticion;
                }   break;
                
            case 2:
                if(tipo==2 && lavado==1){
                    casual++;
                    repeticion=repeticion*20;
                    subtotal = casual*20+repeticion;
                    
                }else if (tipo==2 && lavado==2){
                    casual++;
                    repeticion=repeticion*70;
                    subtotal = casual*70+repeticion;
                }   break;
                
            case 3:
                if(tipo==3 && lavado==1){
                    colchas++;
                    repeticion=repeticion*100;
                    subtotal = colchas*100+repeticion;
                    
                }else if (tipo==3 && lavado==2){
                    colchas++;
                    repeticion=repeticion*150;
                    subtotal = colchas*150+repeticion;
                }   break;
                     default: 
                         break;
                 }
                 System.out.println("\nSuavizante: \n1.Si \n2.No");
                 suavizante=leer.nextInt();
        
                 while(true){
                 if(suavizante>2||suavizante<=0){
                     System.out.println("\nSuavizante: \n1Si \n2.No");
                     suavizante = leer.nextInt();   
                 }else{            
                     break;
                 }   
                 }
        
                 if(suavizante==1)
                 subtotal=subtotal+200;
                 else 
                 subtotal=subtotal+0;    
        
        
                 double impuesto=(subtotal*0.15);
                 subtotal = subtotal+impuesto;
                 double totalpagar=subtotal;
                 System.out.println("TOTAL A PAGAR: "+totalpagar);
        
                 System.out.println("\nDesea ingresar otro producto: (SI / NO) ");
                     repe = leer.next().toLowerCase();
            
                 }while(repe.equalsIgnoreCase("Si")||repe.equalsIgnoreCase("Si"));    
        
                  veces1++;
                  break;
                 
              case 2://Al Reves
                  System.out.println("******* AL REVES ******");
                    int counter=1,cantidad=0;
                    String palabra="";
                    String invertir="";
                    System.out.print("Cantidad de Palabras: ");
                    cantidad = leer.nextInt();
                    
                    do{            
                    String invertida="";
                    System.out.print("Palabra "+counter+": ");
                    palabra = leer.next();
                    counter++;

	            for (int indice = palabra.length() - 1; indice >= 0; indice--) {
	            invertir += palabra.charAt(indice);
                    invertir=invertir+""+invertida+"";
                    }
                    invertir=invertir+"\n";
                    }while(counter<=cantidad);
	            System.out.println("Cadena invertida: \n" +invertir+"\n");
                  veces2++;
                  break;
                  
              case 3://Caracter Popular
                  System.out.println("****** CARACTER POPULAR ******");
                  System.out.println("Ingrese cadena de Texto:");
                  String frase = leer.nextLine();
                  System.out.println(frase);
                  int vecesre=0;
          
                  int mayor=0;
                  char mayoreo='-';
                  for (int i = 0; i < frase.length(); i++) {

                  char e = frase.charAt(i);
             

                 for (int o = i+1; o < frase.length()-1; o++) {
                 char cara2 = frase.charAt(o);
                 if (e == cara2) {
                    vecesre++;

                }
                 if(vecesre>mayor){
                     mayoreo=e;
                 }

            }
          vecesre=0;
          System.out.println("EL CARACTER MAS REPETIDO:"+mayoreo);
          veces3++;
        }
        System.out.println("EL CARACTER MAS REPETIDO:"+mayoreo);
                  veces3++;
                  break;
              case 4://Salir del Programa
                System.out.println("Se termino el programa!");
                System.out.println("Cuantas veces se ingreso a las opciones");
                    System.out.println("Opcion 1: "+veces1+
                            "\nOpcion 2: "+veces2+
                            "\nOpcion 3: "+veces3+
                            "\nOpcion 4: "+veces4);
                End = false;
          }
    }
 }
}
    

