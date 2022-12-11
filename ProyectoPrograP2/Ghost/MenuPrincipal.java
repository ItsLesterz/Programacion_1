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
public class MenuPrincipal {

    static Player obj = new Player();
    static Juego Game = new Juego();
    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");

//Variables de dificultad
    private static boolean difficultNormal, difficultExpert, difficultGenius;
    private static boolean modAleatorio, modManual;
    private static String difficult;
//Variables de Modo de Juego
    private static String GameMode;
    private static int canFantasmas;
    public static int opcPerfil = 0;
    private static boolean puestos;

    public MenuPrincipal() {
        GameMode = "Aleatorio";
        difficult = "NOormal";
        canFantasmas = 8;
        modAleatorio = true;
        difficultNormal = true;
        puestos = false;
    }

    public static void setGameMode(String Game) {
        if (modManual == true) {
            GameMode = "Manual";
        }
        if (modAleatorio == true) {
            GameMode = "Aleatorio";
        }
    }

    public static void setDifficult(String diff) {
        if (difficultNormal == true) {
            difficult = "Normal";
            canFantasmas = 8;
        }
        if (difficultExpert == true) {
            difficult = "Expert";
            canFantasmas = 4;
        }
        if (difficultGenius == true) {
            difficult = "Genius";
            canFantasmas = 2;
        }
    }

    public static String getDifficult() {
        if (difficultNormal == true) {
            return "Normal";
        }
        if (difficultExpert == true) {
            return "Expert";
        }
        if (difficultGenius == true) {
            return "Genius";
        }
        return "Normal";
    }

    //doy valor a la cantidad de fantasmas
    public static void setFantasmas(int cantidad) {
        canFantasmas = cantidad;
    }

    //pido la cantidad de fantasmas
    public static int getFantasmas() {
        return canFantasmas;
    }

    //pido mi tipo de juego
    public static String getGameMode() {
        return GameMode;
    }

    //hago para que pida el menu principal
    public static void getMenu() {
        System.out.println("\n-----------Menu Principal----------"
                + "\n\n[1]. Jugar Ghost Game"
                + "\n[2]. Configuracion"
                + "\n[3]. Reportes"
                + "\n[4]. Mi Perfil"
                + "\n[5]. Salir");
        GameMode = "Aleatorio";
        difficult = "Normal";
    }

    /*no pongo set porque no le doy valor ni get porque no lo pedire despues 
    solo configuracion para que imprima al llamarlo lo que tenga
     */
    public static void Configuracion() {
        System.out.println("Entrando a la Configuracion......");
        int opcConfiguracion = 0;

        while (opcConfiguracion != 3) {
            System.out.print("\n-----------Configuracion----------"
                    + "\n\n[1]. Dificultad"
                    + "\n[2]. Modo de Juego"
                    + "\n[3]. Regresar al Menu Principal");
            System.out.println("\nIngrese una opcion: ");
            opcConfiguracion = leer.nextInt();

            switch (opcConfiguracion) {
                case 1:
                    int tipDificultad = 0;

                    System.out.print("\nEstablezca la Dificultad"
                            + "\n\n[1]. Normal"
                            + "\n[2]. Expert"
                            + "\n[3]. Genius");

                    System.out.println("Ingrese Tipo de Dificultad: ");
                    tipDificultad = leer.nextInt();

                    switch (tipDificultad) {
                        case 1:
                            difficultNormal = true;
                            difficultExpert = false;
                            difficultGenius = false;
                            canFantasmas = 8;
                            break;
                        case 2:
                            difficultNormal = true;
                            difficultExpert = false;
                            difficultGenius = false;
                            canFantasmas = 4;
                            break;
                        case 3:
                            difficultNormal = true;
                            difficultExpert = false;
                            difficultGenius = false;
                            canFantasmas = 2;
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Entrando al Modo de Juego......");
                    int modoJuego = 0;

                    System.out.print("\n-----------Modo de Juego----------"
                            + "\n\n[1]. Manual"
                            + "\n[2]. Aleatorio");
                    System.out.println("\nIngrese Modo de Juego: ");
                    modoJuego = leer.nextInt();

                    switch (modoJuego) {
                        case 1:
                            modManual = true;
                            modAleatorio = false;
                            break;
                        case 2:
                            modManual = false;
                            modAleatorio = true;
                            break;
                    }
                    break;
            }

        }

    }

    public static void reportes() {
        System.out.println("\n------Reportes------");
        int opcReportes = 0;

        Player obj = new Player();
        while (opcReportes != 3) {
            System.out.print("\n-----------Mis Reportes----------"
                    + "\n\n[1]. Mis 10 Ultimos Juegos"
                    + "\n[2]. Ranking de Jugadores"
                    + "\n[3]. Regresar al Menu Principal");
            try {
                System.out.println("\nIngrese una Opcion: ");
                opcReportes = leer.nextInt();
            } catch (Exception e) {
                System.out.println("Ingrso una Letra");
                opcReportes = 0;
                break;
            }
            switch (opcReportes) {
                case 1:
                    System.out.println("\nMis 10 Ultimos Juegos");
                    System.out.println(obj.getPartidas(obj.userin[0][0]));
                    break;
                case 2:
                    System.out.println("\nRanking de los Jugadores");
                    System.out.println(obj.getListPuntos());
                    break;
                case 0:
                    break;
            }
        }
    }

    public static void Perfil() {
        System.out.println("Entrando al Perfil......");
        opcPerfil = 0;

        while (opcPerfil != 4) {
            opcPerfil = 0;
            System.out.print("\n-----------Perfil----------"
                    + "\n\n[1]. Ver mis datos"
                    + "\n[2]. Cambiar Password"
                    + "\n[3]. Eliminar Cuenta"
                    + "\n[4]. Regresar al Menu Pricipal");

            System.out.println("\nIngrese una Opcion: ");
            opcPerfil = leer.nextInt();

            switch (opcPerfil) {
                case 1:
                    System.out.println("El Usuario Logeado es: " + obj.getUserLoggeado() + " \nPuntos: " + obj.getPuntos(obj.getUserLoggeado()));
                    break;
                case 2:
                    obj.cambiar();
                    break;
                case 3:
                    obj.EliminarCuenta();
                    break;
            }
        }
    }

    public static void JUEGUITO() {
        Game.Players();

        if (modManual == true) {
            Game.vaciarTableroManual();
        } else if (modAleatorio == true) {
            Game.vaciarTableroAleatorio();
        }
        if (Game.getReady1() == true && Game.getReady2() == true) {
            if (modManual == true) {
                Game.MostrarTablero();
                Game.UbicacionManual();
            } else if (modAleatorio == true) {
                Game.PonerFantasmaAleatorio();
            }
            if (Game.getFantasmasColocados() == true) {
                while (Game.getJuegoF() == false) {
                    if (Game.getJuegoF() == true) {
                        break;
                    }
                    switch (Game.getCurrentPlayer()) {
                        case 1:
                            if (modAleatorio == true && Game.getJuegoF() != true) {
                                Game.MostrarTablero();
                                Game.buscarEspacioTablero(-1, -1);
                                Game.MoversePlayer1();
                            } else if (modManual == true && Game.getJuegoF() != true) {
                                Game.MostrarTablero();
                                Game.buscarEspacioTablero(-1, -1);
                                Game.MoversePlayer1();
                            }
                            break;
                        case 2:
                            if (modAleatorio == true && Game.getJuegoF() != true) {
                                Game.MostrarTablero();
                                Game.buscarEspacioTablero(-1, -1);
                                Game.MoversePlayer2();
                            } else if (modManual == true && Game.getJuegoF() != true) {
                                Game.MostrarTablero();
                                Game.buscarEspacioTablero(-1, -1);
                                Game.MoversePlayer2();
                            }
                            break;
                    }
                }
            }
        }
    }
}
