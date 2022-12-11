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
public class Proyecto1_TiendaJava {
    
    public static void main(String[] args) 
    {
        Scanner leer=new Scanner(System.in);
        //Declaracion de variables a utilizar en el programa
        int opcion=0, venta=0, compra=0;
        // Valores de caja y los productos
        float caja=0, volumen1=0, volumen2=0, venta1=0, venta2=0, venta3=0, venta4=0
                ,compra1=0,compra2=0, compra3=0, compra4=0;
        //Valores booleanos que nos ayudaran a crear restricciones
        boolean cerrado=true, dia=true, AccesoDenegado=false;
        // Realizacion del menu y hacemos que sea distintos 6 para que solo esaopcionpueda terminar nuestro programa
        while(opcion!=6){
            System.out.println("\n\n-------------- Menu Principal --------------" + 
                    "\n\t1. Abrir Caja" + 
                    "\n\t2. Ventas" + 
                    "\n\t3. Compras" +
                    "\n\t4. Reportes" + 
                    "\n\t5. Cierre de Caja" +
                    "\n\t6. Salir de Sistema");
            System.out.print("\nIngrese una Opcion: ");//Ingresara opcion del menu
            opcion=leer.nextInt();
            //Lo que es en si el ejercicio, un switch para utilizar cada caso el cual tendra su propia funcionalidad segun lo que se necesita realizar
            switch(opcion){
                case 1://Abrir Caja
                    
                    float efectivo;//Esta variable nos ayudara a almacenar el efectivo que ingresamos a caja
                    if(dia==true || AccesoDenegado==false){//valores para comenzar el dia y poder acceder a ella
                        System.out.println("\n************* CAJA ABIERTA *************\n"
                        +"Hay un total de: "+caja+" Lps.\nIngrese la cantidad de efectivo que desea guardar: ");
                        efectivo=leer.nextFloat();
                        // si efectivo esunnumeroenteropositivo,se hara el proceso
                        if(efectivo>0){
                            caja+=efectivo;// fuardamos el efectvio en caja y lo imprimimos
                            System.out.println("\nHay un total de "+caja+" Lps en caja.");
                            cerrado=false;
                        //creacion de un else par que imprima la oracion si el dato ingresado es erroneo    
                        }else{
                            System.out.println("Inserte una cantidad valida de dinero!\n");    
                        }
                    }else if(dia==false || AccesoDenegado==true){//al estar la caja abierta, se podra realizar los demas procesos
                        
                        cerrado=false;
                        AccesoDenegado=false;
                    
                    }System.out.println("\nLa caja ha sido abierta!\n");
                    break;
                    
                case 2: //Ventas
                    if(cerrado==false){//se ejecutara si y solo si la caja esta abierta
                        
                        //Este for nos servira como menu para el clioente que escojamos
                        for(int cliente=0; cliente!=1 && cliente!=2 && cliente!=3; cliente=cliente){
                            System.out.println("\n************* VENTAS *************\n"
                            +"1) Cliente A - Disponibilidad: Todos los Productos\n"
                            +"2) Cliente B - Disponibilidad: Producto con Codigo 1, 2 y 3\n"
                            +"3) Cliente C - Disponibilidad: Producto con Codigo 4.");
                            System.out.println("Ingrese el codigo del cliente: ");
                            cliente=leer.nextInt();
                            
                            int producto, SI=0;
                            //variables que guardan los datos de todas las verntas, impuestos,descuentros,subtotales y totales
                            float subtotalkilo1=0, subtotalkilo2=0, subtotalkilo3=0, subtotalkilo4=0,
                                    subtotal1=0, subtotal2=0, subtotal3=0, subtotal4=0, ISV=0, descuento=0,
                                    totalpagar=0, subtotal=0, kilo1, kilo2, kilo3, kilo4;
                            //con este string se detalla la factura
                            String descuentosSt="";
                            // Este do-while nos ayuda como un ciclo siempre que la eleccion del usuario sea SI
                            do{
                            switch(cliente){//Abrimos
                                case 1://Cliente A
                                    System.out.println("Codigo | Producto | Precio \n"
                                                         +" 1-     Azucar:    30 Lps.\n"
                                                         +" 2-     Avena:     25 Lps.\n"
                                                         +" 3-     Trigo:     32 Lps.\n"
                                                         +" 4-     Maiz:      20 Lps.\n");
                                    System.out.println("Ingrese el codigo del producto: ");
                                    producto=leer.nextInt();
                                    
                                    switch(producto){
                                        case 1://Azucar
                                            //Le solicitamos cuantos kilos desea comprar
                                            System.out.println("Ingrese la cantidad de kilogramos que desea comprar: ");
                                            kilo1=leer.nextFloat();
                                            
                                            subtotal1+=kilo1*30;// MULTIPLICAMOS LA CANTIDAD DE KG Solicitado por su precio
                                            subtotalkilo1+=kilo1;
                                            /*
                                            guardaremos elsubtotal de cada producto y lo detallamos en la factura y este proceso se aplicara para cada producto
                                            con su respectivo precio
                                            */
                                            System.out.println("\n¿Desea comprar otro producto?");
                                            System.out.println("1- SI\n2- NO");
                                            System.out.println("Ingrese el numero de respuesta: ");
                                            SI=leer.nextInt();
                                            break;
                                        case 2: //Avena
                                            System.out.println("Ingrese la cantidad de kilogramos que desea comprar: ");
                                            kilo2=leer.nextFloat();
                                            
                                            subtotal2+=kilo2*25;
                                            subtotalkilo2+=kilo2;
                                            
                                            System.out.println("\n¿Desea comprar otro producto?");
                                            System.out.println("1- SI\n2- NO");
                                            System.out.println("Ingrese el numero de respuesta: ");
                                            SI=leer.nextInt();
                                            break;
                                        case 3: //Trigo
                                            System.out.println("Ingrese la cantidad de kilogramos que desea comprar: ");
                                            kilo3=leer.nextFloat();
                                            
                                            subtotal3+=kilo3*32;
                                            subtotalkilo3+=kilo3;
                                            
                                            System.out.println("\n¿Desea comprar otro producto?");
                                            System.out.println("1- SI\n2- NO");
                                            System.out.println("Ingrese el numero de respuesta: ");
                                            SI=leer.nextInt();
                                            break;
                                        case 4: //Maiz
                                            System.out.println("Ingrese la cantidad de kilogramos que desea comprar: ");
                                            kilo4=leer.nextFloat();
                                            
                                            subtotal4+=kilo4*20;
                                            subtotalkilo4+=kilo4;
                                            
                                            System.out.println("\n¿Desea comprar otro producto?");
                                            System.out.println("1- SI\n2- NO");
                                            System.out.println("Ingrese el numero de respuesta: ");
                                            SI=leer.nextInt();
                                            break;
                                        default:// este default es en caso de que ingresen  una opcion invalida
                                            System.out.println("\nPorfavor ingrese una opcion valida!");
                                            break;
                                }
                                break;
                                    case 2://Cliente B
                                        System.out.println("Codigo | Producto | Precio \n"
                                                         +" 1-     Azucar:    30 Lps.\n"
                                                         +" 2-     Avena:     25 Lps.\n"
                                                         +" 3-     Trigo:     32 Lps.\n"
                                                         +" 4-     Maiz:      20 Lps.\n");
                                    System.out.println("Ingrese el codigo del producto: ");
                                    producto=leer.nextInt();
                                    
                                    switch(producto){
                                        case 1://Azucar
                                            //Le solicitamos cuantos kilos desea comprar
                                            System.out.println("Ingrese la cantidad de kilogramos que desea comprar: ");
                                            kilo1=leer.nextFloat();
                                            
                                            subtotal1+=kilo1*30;
                                            subtotalkilo1+=kilo1;
                                            
                                            System.out.println("\n¿Desea comprar otro producto?");
                                            System.out.println("1- SI\n2- NO");
                                            System.out.println("Ingrese el numero de respuesta: ");
                                            SI=leer.nextInt();
                                            break;
                                        case 2: //Avena
                                            System.out.println("Ingrese la cantidad de kilogramos que desea comprar: ");
                                            kilo2=leer.nextFloat();
                                            
                                            subtotal2+=kilo2*25;
                                            subtotalkilo2+=kilo2;
                                            
                                            System.out.println("\n¿Desea comprar otro producto?");
                                            System.out.println("1- SI\n2- NO");
                                            System.out.println("Ingrese el numero de respuesta: ");
                                            SI=leer.nextInt();
                                            break;
                                        case 3: //Trigo
                                            System.out.println("Ingrese la cantidad de kilogramos que desea comprar: ");
                                            kilo3=leer.nextFloat();
                                            
                                            subtotal3+=kilo3*32;
                                            subtotalkilo3+=kilo3;
                                            
                                            System.out.println("\n¿Desea comprar otro producto?");
                                            System.out.println("1- SI\n2- NO");
                                            System.out.println("Ingrese el numero de respuesta: ");
                                            SI=leer.nextInt();
                                            break;
                                        case 4: //Maiz
                                            // la unica restriccion es el producto numero 4
                                            System.out.println("NO PUEDE COMPRAR MAIZ!");
                                            
                                            System.out.println("\n¿Desea comprar otro producto?");
                                            System.out.println("1- SI\n2- NO");
                                            System.out.println("Ingrese el numero de respuesta: ");
                                            SI=leer.nextInt();
                                            break;
                                        default:
                                            System.out.println("\nPorfavor ingrese una opcion valida!");
                                            break;
                                    }
                                    break;
                                    case 3://Cliente C
                                        System.out.println("Codigo | Producto | Precio \n"
                                                         +" 1-     Azucar:    30 Lps.\n"
                                                         +" 2-     Avena:     25 Lps.\n"
                                                         +" 3-     Trigo:     32 Lps.\n"
                                                         +" 4-     Maiz:      20 Lps.\n");
                                    System.out.println("Ingrese el codigo del producto: ");
                                    producto=leer.nextInt();
                                    
                                    switch(producto){
                                        case 1://Azucar
                                            //Le solicitamos cuantos kilos desea comprar
                                            System.out.println("NO PUEDE COMPRAR AZUCAR!");
                                            
                                            System.out.println("\n¿Desea comprar otro producto?");
                                            System.out.println("1- SI\n2- NO");
                                            System.out.println("Ingrese el numero de respuesta: ");
                                            SI=leer.nextInt();
                                            break;
                                            
                                        case 2: //Avena
                                            System.out.println("NO PUEDE COMPRAR AVENA!");
                                            
                                            System.out.println("\n¿Desea comprar otro producto?");
                                            System.out.println("1- SI\n2- NO");
                                            System.out.println("Ingrese el numero de respuesta: ");
                                            SI=leer.nextInt();
                                            break;
                                            
                                        case 3: //Trigo
                                            System.out.println("NO PUEDE COMPRAR TRIGO!");
                                            
                                            System.out.println("\n¿Desea comprar otro producto?");
                                            System.out.println("1- SI\n2- NO");
                                            System.out.println("Ingrese el numero de respuesta: ");
                                            SI=leer.nextInt();
                                            break;
                                            
                                        case 4: //Maiz
                                            System.out.println("Ingrese la cantidad de kilogramos que desea comprar: ");
                                            kilo4=leer.nextFloat();
                                            
                                            subtotal4+=kilo4*20;
                                            subtotalkilo4+=kilo4;
                                            
                                            System.out.println("\n¿Desea comprar otro producto?");
                                            System.out.println("1- SI\n2- NO");
                                            System.out.println("Ingrese el numero de respuesta: ");
                                            SI=leer.nextInt();
                                            break;
                                        default:
                                            System.out.println("\nPorfavor ingrese una opcion valida!");
                                            break;
                                    }
                                    break;
                                        default:
                                            System.out.println("\nPorfavor ingrese una opcion valida!");
                                    break;}
                                    //Suma de los subtotales
                                    subtotal=subtotal1+subtotal2+subtotal3+subtotal4;
                                    //Impuesto sobre la centa al 7%
                                    ISV=(float) (subtotal*0.07);
                                    //estos if-else nos ayudaran a saber si se aplica el descuento y cuanto
                                    if(subtotal>=5000){
                                        descuento=(float) (subtotal*0.10);// descuento del 10% si compra mas de 5,000
                                        descuentosSt="10% sobre el subtotal";
                                    }else{
                                        if(subtotal>=1000){
                                            descuento=(float) (subtotal*0.05);// descuento del 5% si compras mas de 1,000
                                            descuentosSt="5% sobre el subtotal";
                                        }
                                        else{
                                            if(subtotal<1000){
                                                descuento=0;//no se aplica descuento debido a que consumio menos de 1,000
                                                descuentosSt="No aplica descuento";
                                            }
                                        }
                                    }
                                    //sumamos impuestos al subtotal y restamos descuento (si lo hay)
                                    totalpagar=subtotal-descuento+ISV;
                                    
                            }while(SI==1);// cierre del while
                            caja+=totalpagar;//Sumatoria total a caja
                            volumen1+=totalpagar;//Volumen de ventas
                            //esto no sirve para sacar el producto estrella o el mas vendido
                            venta1+=subtotal1; venta2+=subtotal2; venta3+=subtotal3; venta4+=subtotal4;
                            //si hay algun subtotal distinto a ceroseimprimelafactura
                            if(subtotal1!=0||subtotal2!=0||subtotal!=0||subtotal4!=0){
                                System.out.println("\n******** FACTURACION ********\nProducto: \n"
                                +"\nAzucar-kilogramos: "+subtotalkilo1+"\nsubtotal: "+subtotal1+" Lps.\n"
                                +"\nAvena-kilogramos: "+subtotalkilo2+"\nsubtotal: "+subtotal2+" Lps.\n"
                                +"\nTrigo-kilogramos: "+subtotalkilo3+"\nsubtotal: "+subtotal3+" Lps.\n"
                                +"\nMaiz-kilogramos: "+subtotalkilo4+"\nsubtotal: "+subtotal4+" Lps.\n"
                                +"\n\n----------------DETALLE DE COBRO----------------"
                                +"\n\nSubtotal: "+subtotal+" Lps."
                                +"\n\nDescuentop: "+descuento+" Lps.\n"+descuentosSt
                                +"\n\nISV-7%: "+ISV+" Lps."
                                +"\n\nTotal a Pagar: "+totalpagar+" Lps.\n\n"+"Hay un total de "+caja+"Lps en caja.\n");
                            }
                            
                          }venta++;//contador de las ventas efectuadas
                        }else{//este else es en caso de que la caja este cerrada
                        System.out.println("\nLa caja se encuentra cerrada!");
                        }
                        break;
                case 3://Compra
                    //variable int para que nos sirva como contadores
                    int producto=0;
                    //variables que guardaran los datos de todas las compras, subtotales y totales
                    float subtotalkilo1=0, subtotalkilo2=0, subtotalkilo3=0, subtotalkilo4=0,
                          subtotal1=0, subtotal2=0, subtotal3=0, subtotal4=0,
                          totalpagar=0, subtotal=0, kilo1, kilo2, kilo3, kilo4;
                    // este if se utilizara si y solosi la caja esta abierta
                    if(cerrado==false){
                        // elfornosservira como menu para el cliente que escojamos
                        for(int proveedor=0; proveedor!=1 && proveedor !=2 && proveedor !=3; proveedor=proveedor){
                          System.out.println("\n************* COMPRAS *************\n"
                            +"1- Proveedor A - Disponibilidad: Productos con Codigo 1 y 4\n"
                            +"2- Proveedor B - Disponibilidad: Producto con Codigo 2 y 3\n"
                            +"3- Proveedor C - Disponibilidad: Producto con Codigo 2");
                            System.out.println("Ingrese el tipo de proveedor: ");
                            proveedor=leer.nextInt(); 
                            
                            switch(proveedor){
                                case 1://Proveedor A
                                    System.out.println("Codigo | Producto | Precio \n"
                                                         +" 1-     Azucar:    25 Lps.\n"
                                                         +" 2-     Avena:     25 Lps.\n"
                                                         +" 3-     Trigo:     30 Lps.\n"
                                                         +" 4-     Maiz:      18 Lps.\n");
                                    System.out.println("Ingrese el codigo del producto: ");
                                    producto=leer.nextInt();
                                    
                                    switch(producto){
                                        case 1://Azucar
                                            System.out.println("Ingrese la cantidad de kilogramos que desea comprar: ");
                                            kilo1=leer.nextInt();
                                            subtotal1+=kilo1*25;
                                            subtotalkilo1+=kilo1;
                                            break;
                                        case 2: //Avena
                                            System.out.println("El proveedor no vende este producto!\n");
                                            break;
                                        case 3://Trigo
                                            System.out.println("El proveedor no vende este producto!\n");
                                            break;
                                        case 4://Maiz
                                            System.out.println("Ingrese la cantidad de kilogramos que desea comprar: ");
                                            kilo4=leer.nextInt();
                                            subtotal4+=kilo4*18;
                                            subtotalkilo4+=kilo4;
                                            break;
                                        default: 
                                            System.out.println("\nPorfavor ingrese una opcion valida!");
                                            break;
                                    }
                                    break;
                                case 2://Proveedor B
                                    System.out.println("Codigo | Producto | Precio \n"
                                                         +" 1-     Azucar:    25 Lps.\n"
                                                         +" 2-     Avena:     20 Lps.\n"
                                                         +" 3-     Trigo:     30 Lps.\n"
                                                         +" 4-     Maiz:      18 Lps.\n");
                                    System.out.println("Ingrese el codigo del producto: ");
                                    producto=leer.nextInt();
                                    
                                    switch(producto){
                                        case 1://Azucar
                                            System.out.println("El proveedor no vende este producto!\n");
                                            break;
                                         case 2: //Avena
                                            System.out.println("Ingrese la cantidad de kilogramos que desea comprar: ");
                                            kilo2=leer.nextInt();
                                            subtotal2+=kilo2*20;
                                            subtotalkilo2+=kilo2;
                                            break;
                                        case 3://Trigo
                                            System.out.println("Ingrese la cantidad de kilogramos que desea comprar: ");
                                            kilo3=leer.nextInt();
                                            subtotal3+=kilo3*30;
                                            subtotalkilo3+=kilo3;
                                            break;
                                        case 4://Maiz
                                            System.out.println("El proveedor no vende este producto!\n");
                                            break;
                                        default: 
                                            System.out.println("\nPorfavor ingrese una opcion valida!");
                                            break;
                                    }
                                    break;
                                case 3://Proveedor C
                                    System.out.println("Codigo | Producto | Precio \n"
                                                         +" 1-     Azucar:    25 Lps.\n"
                                                         +" 2-     Avena:     25 Lps.\n"
                                                         +" 3-     Trigo:     30 Lps.\n"
                                                         +" 4-     Maiz:      18 Lps.\n");
                                    System.out.println("Ingrese el codigo del producto: ");
                                    producto=leer.nextInt();
                                    
                                    switch(producto){
                                        case 1://Azucar
                                            System.out.println("El proveedor no vende este producto!\n");
                                            break;
                                         case 2: //Avena
                                            System.out.println("Ingrese la cantidad de kilogramos que desea comprar: ");
                                            kilo2=leer.nextInt();
                                            subtotal2+=kilo2*25;
                                            subtotalkilo2+=kilo2;
                                            break;
                                        case 3://Trigo
                                            System.out.println("El proveedor no vende este producto!\n");
                                            break;
                                        case 4://Maiz
                                            System.out.println("El proveedor no vende este producto!\n");
                                            break;
                                        default: 
                                            System.out.println("\nPorfavor ingrese una opcion valida!");
                                            break;}
                                    break;
                                        default:
                                            System.out.println("\nPorfavor ingrese una opcion valida!");
                                            break;
                                    }
                            //suma de todoslossubtotales en unosolo
                            subtotal=subtotal1+subtotal2+subtotal3+subtotal4;
                            // elifasegura de que eldinero en caja sea mayor que el cobro de la compra
                            if(caja<subtotal){
                                System.out.println("\nNo tiene dinero suficiente para efectuar esta compra!");
                            }else{
                                totalpagar+=subtotal;
                                caja-=totalpagar;// se resta el dinero de la caja
                                // si es distinto a 0 se imprimira la factura detallada
                                if(subtotal1!=0||subtotal2!=0||subtotal3!=0||subtotal!=0){
                                    System.out.println("\n******** FACTURACION ********\nProducto: \n"
                                +"\nAzucar-kilogramos: "+subtotalkilo1+"\nsubtotal: "+subtotal1+" Lps.\n"
                                +"\nAvena-kilogramos: "+subtotalkilo2+"\nsubtotal: "+subtotal2+" Lps.\n"
                                +"\nTrigo-kilogramos: "+subtotalkilo3+"\nsubtotal: "+subtotal3+" Lps.\n"
                                +"\nMaiz-kilogramos: "+subtotalkilo4+"\nsubtotal: "+subtotal4+" Lps.\n"
                                +"\n\n----------------DETALLE DE COBRO----------------"
                                +"\n\nSubtotal: "+subtotal+" Lps."
                                +"\n\nTotal a Pagar: "+totalpagar+" Lps.\n\n"+"Hay un total de "+caja+"Lps en caja.\n");
                                }
                            }
                             volumen2+=totalpagar;
                             
                             compra1+=subtotal1; compra2+=subtotal2; compra3+=subtotal3;compra4+=subtotal4;
                        }compra++;// contador para las compras efectuadas
                        
                        }else{//el mismo proceso en caso de que la caja este cerrada
                        System.out.println("\nLa caja se encuentra cerrada!");
                        }
                        break;
                 case 4://Reporte
                     String Estrella="";//string para detallar en factura
                     
                     float VentaM=0, CompraM=0, promedio1=0, promedio2=0;// Valores de promedio, compra mayor y venta mayor
                     float ganancia=volumen1-volumen2;//ganancias totales, se resta de lo que se gasto en compras
                     
                     if(cerrado==false){//negar acceso si la caja esta cerrada
                         promedio1=volumen1/venta;
                         promedio2=volumen2/compra;
                         //Producto mas vendido
                         if(venta1>venta2 && venta1>venta3 && venta1>venta4){
                             Estrella="Azucar";
                         }else if(venta2>venta1 && venta2>venta3 && venta3>venta4){
                             Estrella="Avena";
                         }else if(venta3>venta1 && venta3>2 && venta3>venta4){
                             Estrella="Trigo";
                         }else if(venta4>venta1 && venta4>venta2 && venta4>venta3){
                             Estrella="Maiz"; 
                         }else{
                             Estrella="No hay producto estrella";
                         }
                         //Producto con mayor venta
                         if(venta1>venta2 && venta1>venta3 && venta1>venta4){
                            VentaM+=venta1;
                         }else if(venta2>venta1 && venta2>venta3 && venta2>venta4){
                             VentaM+=venta2;
                         }else if(venta3>venta1 && venta3>venta2 && venta3>venta4){
                             VentaM+=venta3;
                         }else if(venta4>venta1 && venta4>venta2 && venta4>venta3){
                             VentaM+=venta4;
                         }
                         //Compra Mayor
                         if(compra1>compra2 && compra1>compra3 && compra1>compra4){
                             CompraM+=compra1;
                         }else if(compra>compra1 && compra2>compra3 && compra2>compra4){
                             CompraM+=compra2;
                         }else if(compra3>compra1 && compra3>compra2 && compra3>compra4){
                             CompraM+=compra3;
                         }else if(compra4>compra1 && compra4>compra2 && compra4>compra3){
                             CompraM+=compra4;
                         }
                         
                         System.out.println("************* REPORTE *************\n"
                                           +"\nCantidad Actual en Caja: \n"+caja
                                           +"\n\nNumero de Compras y Ventas realizadas en el dia:"
                                           +"\nCompras: "+compra+"\nVentas: "+venta
                                           +"\n\nVolumen Total de Compras y Ventas: "
                                           +"\nCompras: "+volumen1+"\nVentas: "+volumen2
                                           +"\n\nMargen de Ganancia Obtenido: \n"+ganancia
                                           +"\n\nValor Promedio Compra y Venta: "
                                           +"\nCompras: "+promedio2+"\nVentas - "+promedio1
                                           +"\n\nLa Venta con Mayor Ganancia y la Compra con mas Gasto: "
                                           +"\nCompras: "+CompraM+"\nVentas: "+VentaM
                                           +"\n\nProducto Estrella: "+Estrella);
                     }else{// if para negar ecceso si la caja esta cerrada
                         System.out.println("La caja se encuentra cerrada");
                     }
                     break;
                 case 5://Cierre de caja
                     if(cerrado==false){
                         System.out.println("\n************* CIERRE DE CAJA *************\n");
                         
                         float banco=0, deposito=0;
                         System.out.println("El Total actual de dinero en caja es de "+caja+" Lps.");
                         System.out.println("¿Cuanto dinero desea depositar en el banco?");
                         deposito=leer.nextInt();
                         
                         if(deposito<=caja*0.6 && deposito>0){
                             
                             caja-=deposito;
                             banco+=deposito;
                             System.out.println("\n-------- TRANSACCION EFECTUADA ---------\n");
                             System.out.println("El monto total en el banco es de "+banco+"Lps.\n");
                             //Cierre de caja negando el acceso hasta que se abra el dia siguiente
                             dia=false;
                             cerrado=true;
                             AccesoDenegado=true;
                             //Contadores del reporte a 0
                             venta=0; compra=0; Estrella=""; volumen1=0; volumen2=0;
                             ganancia=0; promedio1=0; promedio2=0; venta1=0; venta2=0;
                             venta3=0; venta4=0; compra1=0; compra2=0; compra3=0; compra4=0;
                         }else{
                             System.out.println("Su ingreso excede el 60% permitido a depositar - Por favor ingrese un numero valido!");
                         }
                           }else{
                             System.out.println("La caja ya se encuentra cerrada");
                         }
                     break;
                 case 6://Cierre del programa
                     System.out.println("\nQue tenga un feliz día! :D\n");
                     break;
                 default:
                     System.out.println("\nPorfavor ingrese una opcion valida!");
                     break;
             }
         }
                    
     }
}
        


