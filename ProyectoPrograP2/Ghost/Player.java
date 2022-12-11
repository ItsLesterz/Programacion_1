/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoPrograP2.Ghost;

import java.util.Scanner;

/**
 *
 * @author leste
 */
public class Player {

    static int nPlayers = 50;
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    static String username[][] = new String[nPlayers][3];
    static String partidasPlayers[][] = new String[nPlayers][11];
    static int puntosPlayers[] = new int[nPlayers];
    static int partidasGuardadas = 0;

    private static boolean userCorrecto = false, passCorrecto = false;
    public static boolean loggedin = false;

    private static boolean registered = false;
    private static boolean userGuardado = false, passGuardado = false, userExiste = false, registro1 = false;
    static boolean loggedout = false;

    static String userin[][] = new String[1][3];

    public boolean getLoggedOut() {
        if (loggedout != false) {
            return true;
        } else {
            return false;
        }
    }

    public String getUserLoggeado() {
        return userin[0][0];
    }

    public boolean getRegistered() {
        if (registro1 == false) {
            return false;
        } else {
            return true;
        }
    }

    public boolean getUserGuardado() {
        if (registered != false) {
            return true;
        } else {
            return false;
        }
    }

    public static void usuarioExistente(String user) {
        for (int i = 0; i < username.length; i++) {
            if (username[i].equals(user)) {
                userExiste = true;
            } else {
                userExiste = false;
            }
        }
    }

    public static boolean getUserExist() {
        return userExiste;
    }

    public static void loggearse(String user1, String contra) {
        userCorrecto = false;
        passCorrecto = false;
        int i = 0;
        for (i = 0; i < username.length; i++) {
            if (username[i][0] == null) {
                username[i][0] = "N/A";
                username[i][1] = "N/A";
                username[i][2] = "0";
            }
        }
        for(i=0 ;i<username.length;i++){
        if (registro1 == true) {
            if (username[i][0].equals(user1) && username[i][1].equals(contra)) {
                userCorrecto = true;
                passCorrecto = true;
            }
        }
        }
        if (userCorrecto == true && passCorrecto == true) {
            System.out.println("Ingresando.........");
            if (loggedout == true) {
                userin[0][0] = user1;
                userin[0][1] = contra;
            }
            loggedin = true;
        } else {
            System.out.println("USUARIO NO EXISTE!!!");
            loggedin = false;
        }
    }

    public static void Registrarse(String user, String pass) {
        nPlayers++;
        int e = 0;
        registered = false;
        userExiste = false;
        for (int i = 0; i < username.length; i++) {
            if (username[i][0] == null) {
                username[i][0] = "N/A";
                username[i][1] = "N/A";
                username[i][2] = "0";
            }
        }
        for (int i = 0; i < username.length; i++) {
            if (username[i][0].equals(user)) {
                userExiste = true;
            }
        }
        for (int i = 0; i < username.length; i++) {
            if (username[i][0].equals("N/A") && userExiste == false) {
                userGuardado = true;
                passGuardado = true;
                registro1 = true;
                registered = true;
                e = i;
            }
        }
        if (userGuardado == true && passGuardado == true) {
            nPlayers++;
            System.out.println("\nSu username se ha guardado correctamente!");
            System.out.println("\nSu contraseña se ha guardado correctamente!");
            userGuardado = false;
            passGuardado = false;
            username[e][0] = user;
            username[e][1] = pass;
            username[e][2] = "0";
            partidasPlayers[e][0] = user;
            puntosPlayers[e] = 0;
        } else if (userExiste = true) {
            System.out.println("\nEl usuario que intenta registrar ya existe!"
                    + "\nLoggeate de nuevo!");
            loggearse(user, pass);
        } else {
            System.out.println("\nError al registrar su usuario y contraseña!");
        }
    }

    public static void cambiar() {
        if (loggedin == true) {
            System.out.println("\nCambiar Contraseña!");
            System.out.println("\nNecesitamos verificar que es usted en realidad");
            System.out.print("Ingrese su password: ");
            String pass = leer.next();
            boolean cambioPass = false;

            if (pass.equals(userin[0][1])) {
                if (userin[0][1].equals(pass)) {
                    String userloged = userin[0][0];
                    System.out.println("Ingrese su nueva password: ");
                    String nueva = leer.next();

                    for (int i = 0; i < username.length; i++) {
                        if (username[i][0].equals(userloged)) {
                            username[i][1] = nueva;
                            userin[0][1] = nueva;
                            cambioPass = true;
                        }
                    }
                    if (cambioPass == true) {
                        System.out.println("\nTu nueva contraseña es: " + userin[0][1]);
                    }
                } else {

                }
            }
        } else {
            System.out.println("\nParece que no eres tu, vuelve a intentar!");
        }
    }

    public static void EliminarCuenta() {
        MenuPrincipal obj = new MenuPrincipal();
        String eliminar = "";
        if (loggedin == true) {
            System.out.println("Eliminar Cuenta");
            System.out.println("\nSeguro que deseas eliminar tu cuenta 1.Si 2.No");
            eliminar = leer.next().toUpperCase();

            boolean deleted = false, seguro = false;

            if (eliminar.equals("SI")) {
                for (int i = 0; i < username.length; i++) {
                    if (username[i][0].equals(userin[0][0]) && username[i][1].equals(userin[0][1])) {
                        seguro = true;
                        if (seguro == true) {
                            Logout(userin[0][1]);
                            username[i][1] = null;
                            username[i][0] = null;
                            username[i][2] = "0";
                            username[0][0] = null;
                            username[0][1] = null;
                            deleted = true;
                        }

                        obj.opcPerfil = 4;
                    }
                }

            }
            if (deleted == true) {
                System.out.println("El Usuario se elimino!");
            } else {
                System.out.println("No se elimino el usuario!");
                deleted = false;
            }
        } else {

        }
    }

    public static void Logout(String pass) {
        if (loggedin == true) {
            loggedout = false;
            if (userin[0][1].equals(pass)) {
                userin[0][0] = null;
                userin[0][1] = null;
                loggedout = true;
            } else {
                System.out.println("Contraseña incorrecta!");
                loggedout = false;
            }
            if (loggedout == true) {
                System.out.println("Saliendo del Sistema");
                loggedin = false;
            }
        } else {
            System.out.println("Necesita loggearse antes de hacer esto!");
        }
    }

    public static boolean getLogout() {
        if (loggedin == false) {
            return true;
        }
        return false;
    }

    public static void setUltimasPartidas(String user, String partida) {
        int posicion = 0;
        if (partidasGuardadas > 10) {
            partidasGuardadas = 0;
        } else {
            partidasGuardadas++;
        }
        for (int i = 0; i < partidasPlayers.length; i++) {
            if (user.equals(partidasPlayers[i][0])) {
                for (int j = 0; j < partidasPlayers[i].length; j++) {
                    if (partidasPlayers[i][j] == null) {
                        posicion = i;
                    }
                }
            }
        }
        partidasPlayers[posicion][partidasGuardadas]=partida;
    }
    
    public static String getPartidas(String user){
        String partidas="";
        for(int i=0;i<partidasPlayers.length;i++){
            if(user.equals(partidasPlayers[i][0])){
                for(int j=0;j<partidasPlayers[i].length;j++){
                    if(partidasPlayers[i][j]!=null){
                        partidas=partidas+"\n"+partidasPlayers[i][j];
                    }
                }
                return partidas;
            }
        }
        return "No hay partidas aun!";
    }
    public static void setPuntos(String player,int puntos){
        for (int i=0;i<username.length;i++){
            if(username[i][0].equals(player)){
                puntosPlayers[i]=puntosPlayers[i]+puntos;
                username[i][2]=Integer.toString(puntosPlayers[i]); 
            }
        }
    }
    public static int getPuntos(String user){
        for(int i=0;i<username.length;i++){
            if(username[i][0].equals(user)){
                return Integer.parseInt(username[i][2]);
            }
        }
        return 0;
    }
    public static String getListPuntos(){
        int aux=0;
        String auxName="";
        String auxPass="";
        String list="";
        for(int i=0; i<username.length;i++){
            for(int j=0;j<username.length-1;j++){
                if(Integer.parseInt(username[j][2])>Integer.parseInt(username[j+1][2])){
                    aux=Integer.parseInt(username[j][2]);
                    auxName=username[j][0];
                    auxPass=username[j][1];
                    username[j][2]=username[j+1][2];
                    username[j][1]=username[j+1][1];
                    username[j][0]=username[j+1][0];
                    username[j+1][2]=Integer.toString(aux);
                    username[j+1][1]=auxPass;
                    username[j+1][0]=auxName;
                }
            }
        }
        for(int i=username.length-1;i>=0;i--){
            if(!username[i][0].equals("N/A")){
                list=list+"\n"+"Nombre: "+username[i][0]+" Puntos: "+username[i][2];
            }
        }
        return list;
    }
}
