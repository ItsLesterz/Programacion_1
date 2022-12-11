/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_Progra1;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class TipTapToe {
    
    static String Usernames[] =  new String[1000];
    static String Passwords[] = new String[1000];
    static int Posiciones = 0;
        
        
    public static boolean buscarUsernames(String Username){
        for (int i = 0; i < 1000; i++){
            
            if (Posiciones == 0){
                return false;
            }
            
            if(Usernames[i] == null){
                continue;
            }
            
            if (Usernames[i].equals(Username)){
                return true;
            }
        }
        
        return false;
    }
    
    public static boolean buscarPasswords(String Password){
        for (int i = 0; i < 1000; i++){
            if (Passwords[i].equals(Password)){
                System.out.println("\n");
                return true;
            }
        }
        
        return false;
    }
        
    static String Tablero [][] = new String [3][3];
        
    public static int ActualizarTablero(){
        
        String SumaFila = "";
        int Win = 0;
        String Mensaje = "";
        
        for (int f = 0; f < 3; f++){
            for (int c = 0; c < 3; c++){
                System.out.print(Tablero[f][c] + "\t");
                SumaFila = SumaFila + Tablero[f][c];
                System.out.println(SumaFila);
            }
            
            System.out.println("");
            
            if (SumaFila.equals("XXX")){
                Win = 1;
                Mensaje = "Player 1 Wins";
            }else{
                if (SumaFila.equals("000")){
                    Win = 1;
                    Mensaje = "Player 2 WIns";
                }
            }
        }
        
        if (Win == 1){
            System.out.println(Mensaje);
            return 1;
        }
        
        
        return 0;
    }
    
        
    public static void main(String[] args) {
         
        Scanner lea = new Scanner(System.in).useDelimiter("\n");
        
        boolean Ending = true;
        
        while(Ending){
            System.out.println("\n********** MENU PRINCIPAL **********" + 
                    "\n\t1. INICIAR SESION" + 
                    "\n\t2. REGISTRO" + 
                    "\n\t3. SALIR" + 
                    "\n***************************" + 
                    "\nIngrese la opcion que desee: ");
            
            int Opcion = lea.nextInt();
            
            switch(Opcion){
                case 1:
                    System.out.println("\n********** INICIO DE SESION ***********");
                    
                    System.out.println("\nUSERNAME: ");
                    String Username = lea.next();
                    
                    System.out.println("\nPassword: ");
                    String Password = lea.next();
                    
                    if (buscarUsernames(Username) == true && buscarPasswords(Password) == true){
                        System.out.println("\nSe ha iniciado sesion....");
                        
                        boolean Fin = true;
                        
                        while(Fin){
                            System.out.println("\n********** MENU PRINCIPAL **********" + 
                                    "\n\t1. JUGAR X-0" + 
                                    "\n\t2. CERRAR SESION" + 
                                    "\n********************************" + 
                                    "\nIngrese la opcion que desee: ");
                            Opcion = lea.nextInt();
                            
                            switch(Opcion){
                                case 1:
                                    System.out.println("\n********** X-O ***********");
                                     int Exit = 0;
                                    while(true){
                                                                        
                                        System.out.println("Ingresar Username del PLAYER 2: " + 
                                                "\n(Ingrese EXIT si desea reresar al menu principal...)");
                                        String Username2 = lea.next();
                                    
                                        System.out.println("\nIngresar Password del PLAYER 2: ");
                                        String Password2 = lea.next();
                                        
                                        if (Username2.equals("EXIT")){
                                            Exit += 1;
                                            break;
                                        }
                                        if (buscarUsernames(Username2) == true && buscarPasswords(Password2) == true){
                                            System.out.println("\nEl Player 2 ha iniciado sesion correctamente...");
                                            System.out.println("\nPLAYER 1: " + Username + " Es X");
                                            System.out.println("PLAYER 2: " + Username2 + " Es 0");
                                            
                                            break;
                                        }else{
                                            System.out.println("\nNo se ha encontado al usuario o la contraseña... Por favor ingresar nuevamente los datos...");
                                        }
                                    }
                                    
                                    if (Exit > 0){
                                        break;
                                    }
                                    
                                    ActualizarTablero();
                                    
                                    boolean FIN = true;
                                    int contador = 0;
                                    
                                    while(FIN){
                                        
                                        while(true){
                                            System.out.println("\nTurno Player 1(X): Ingrese las coordenadas");
                                            System.out.println("Fila: ");
                                            int Fila = lea.nextInt();
                                            System.out.println("Columna: ");
                                            int Columna = lea.nextInt();
                                        
                                            if (Fila > 3 || Fila < 0 || Columna > 3 || Columna < 0 || Tablero[Fila - 1][Columna - 1] != null){
                                                System.out.println("\nLa coordenada ingresada es incorrecta, ingrese los datos nuevamente...");
                                            }else{
                                                Tablero[Fila - 1][Columna - 1] = "X";
                                                contador += 1;
                                                break;
                                            }
                                        }
                                        
                                        if (ActualizarTablero() == 1){
                                            FIN = false;
                                        }
                                        
                                        
                                        while(true){
                                            System.out.println("\nTurno Player 2(0): Ingrese las coordenadas");
                                            System.out.println("Fila: ");
                                            int Fila = lea.nextInt();
                                            System.out.println("Columna: ");
                                            int Columna = lea.nextInt();
                                        
                                            if (Fila > 3 || Fila < 0 || Columna > 3 || Columna < 0 || Tablero[Fila - 1][Columna - 1] != null){
                                                System.out.println("\nLa coordenada ingresada es incorrecta, ingrese los datos nuevamente...");
                                            }else{
                                                Tablero[Fila - 1][Columna - 1] = "0";
                                                contador += 1;
                                                break;
                                            }
                                        }
                                        
                                        if (ActualizarTablero() == 1){
                                            FIN = false;
                                        }
                                        
                                        if (contador >= 9){
                                            System.out.println("\nEMPATE!");
                                            FIN = false;
                                        }
                                    }
                                       
                                    break;
                                    
                                case 2:
                                    System.out.println("\nCerrando sesion....");
                                    Fin = false;
                                    break;
                            }
                            
                        }
                    }else{
                        break;
                    }
                    
                    break;
                case 2:
                    System.out.println("\n********** REGISTRO **********");
                    
                    System.out.println("\nIngrese el nombre de usuario que desee: ");
                    Username = lea.next();
                    
                    if (buscarUsernames(Username) == true){
                        System.out.println("\nEse nombre de usuario ya existe...");
                        break;
                    }
                    
                    Usernames[Posiciones] = Username;
                    
                    while(true){
                        System.out.println("\nIngrese la contraseña que desee(NO MAS NI MENOS DE 5 CARACTERES): ");
                        Password = lea.next();
                    
                        int Longitud = Password.length();
                    
                        if (Longitud < 5 || Longitud > 5){
                            System.out.println("\nSu contraseña no cumple con las condiciones solicitadas... Ingresela de nuevo...");
                        }else{
                            Passwords[Posiciones] = Password;
                            Posiciones += 1;
                            
                            System.out.println("\nSu cuenta ha sido registrada exitosamente...");
                            break;
                        }
                    }
                    
                    break;
                    
                case 3:
                    System.out.println("\nGracias por utilizar nuestro programa....");
                    Ending = false;
                    break;
            }
        }
    }
}
