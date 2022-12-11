/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoPrograP2.Ghost;

import ProyectoPrograP2.Ghost.Juego;
import ProyectoPrograP2.Ghost.Player;
import java.util.Scanner;

/**
 *
 * @author leste
 */
public class Inicio {

    Player OP = new Player();
    MenuPrincipal menu = new MenuPrincipal();

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Player OP = new Player();
        MenuPrincipal menu = new MenuPrincipal();
        //Menu
        int opcion1 = 0;
        while (opcion1 != 3) {
            OP.loggedout = true;
            System.out.print("\n-----------Menu de Incio----------"
                    + "\n\n[1]. Login"
                    + "\n[2]. Crear Player"
                    + "\n[3]. Salir");
            System.out.print("\nSelecciones su opcion: ");
            try {
                opcion1 = leer.nextInt();
            } catch (Exception e) {
                leer.next();
            }
            switch (opcion1) {
                case 1:
                    if (OP.getRegistered() == true) {
                        if (OP.loggedin == false) {
                            System.out.println("\n**********Inicio de Sesion**********");
                            System.out.print("Ingrese su Usuario: ");
                            String nombre = leer.next();

                            System.out.println("Ingrese su Contraseña: ");
                            String contra = leer.next();
                            OP.loggearse(nombre, contra);

                            if (OP.loggedin == true) {
                                int opcion2 = 0;

                                while (opcion2 != 5) {
                                    OP.loggedout = false;
                                    menu.getMenu();
                                    System.out.print("\n\nSeleccione una opcion: ");
                                    try {
                                        opcion2 = leer.nextInt();
                                    } catch (Exception e) {
                                        leer.next();
                                    }
                                    switch (opcion2) {
                                        case 1:
                                            menu.JUEGUITO();
                                            break;
                                        case 2:
                                            menu.Configuracion();
                                            break;
                                        case 3:
                                            menu.reportes();
                                            break;
                                        case 4:
                                            menu.Perfil();
                                            if (OP.getLoggedOut() == true) {
                                                opcion2 = 5;
                                            }
                                            break;
                                        case 5:
                                            String dato1 = OP.userin[0][0];
                                            String dato2 = OP.userin[0][1];

                                            for (int i = 0; i < OP.username.length; i++) {
                                                if (OP.username[i][0].equals(dato1) && OP.username[i][1].equals(dato2)) {
                                                    OP.Logout(dato2);

                                                }
                                            }

                                    }
                                }

                            }
                        }
                    } else {
                        System.out.println("\nNo hay usuario registrado prueba a crear un usuario!!!");
                    }
                    break;
                case 2:
                    if (OP.loggedin == false) {
                        System.out.println("***** Crear Usuario *****");
                        System.out.print("\nIngrese su Usuario: ");
                        String user1 = leer.next();
                        System.out.print("Ingrese su Password: ");
                        String pass1 = leer.next();

                        OP.Registrarse(user1, pass1);
                        OP.loggearse(user1, pass1);
                    }
                    if (OP.loggedin == true) {
                        int opcionMPrincipal = 0;

                        while (opcionMPrincipal != 5) {
                            OP.loggedout = false;
                            menu.getMenu();
                            System.out.print("Elige una opcion: ");

                            try {
                                opcionMPrincipal = leer.nextInt();
                            } catch (Exception e) {
                                leer.next();
                            }
                            switch (opcionMPrincipal) {
                                case 1:
                                    menu.JUEGUITO();
                                    break;
                                case 2:
                                    menu.Configuracion();
                                    break;
                                case 3:
                                    menu.reportes();
                                    break;
                                case 4:
                                    menu.Perfil();
                                    if (OP.getLoggedOut() == true) {
                                        opcionMPrincipal = 5;
                                    }
                                    break;
                                case 5:
                                    String dato1 = OP.userin[0][0];
                                    String dato2 = OP.userin[0][1];

                                    for (int i = 0; i < OP.username.length; i++) {
                                        if (OP.username[i][0].equals(dato1) && OP.username[i][1].equals(dato2)) {
                                            OP.Logout(dato2);
                                        }
                                    }

                            }
                        }
                    }
                    break;
            }

        }
    }
}
