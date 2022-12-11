/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoPrograP2.Ghost;

import static ProyectoPrograP2.Ghost.MenuPrincipal.Game;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author leste
 */
public class Juego {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private static Player id = new Player();
    private static MenuPrincipal idGameMode = new MenuPrincipal();

    private static MenuPrincipal Gamemode = new MenuPrincipal();
    private static String Players[][] = new String[2][3];

    private static boolean readyPlayer1, readyPlayer2;
    private static String tableroPlayer[][] = new String[7][7];

//posicion
    private static int fila, columna, nuevaFila, nuevaColumna;
    private static boolean espacioLibre, JuegoTermino, FantasColocado1, FantasColocado2, JuegoRepetir;
    private static String FantasBueno, FantasMalo;
    private static int CurrentPlayer;

    private static String ganador, perdedor;
    private static String player1, player2;
    private static int EntradaCastillo1 = 6, EntradaCastillo2 = 0;
    private static boolean EntraCastillo = false;

    private static String FBP1 = "F1", FMP1 = "F2", FBP2 = "F2", FMP2 = "F2";
    private static String nuevaPosicion = "  ";

    private static int fantasma = 0;
    private static int FanBuenoP1, FanMaloP1, FanBuenoP2, FanMaloP2;

    public Juego() {
        FanBuenoP1 = 0;
        FanMaloP1 = 0;
        FanBuenoP2 = 0;
        FanMaloP2 = 0;

        JuegoTermino = false;
        JuegoRepetir = false;

        ganador = "NP";
        perdedor = "NP";
    }

    public static void MostrarTablero() {
        System.out.println("\n----------Tablero del Juego----------");

        System.out.println("\n  0   1   2   3   4   5   6");
        System.out.println("\n 0 " + tableroPlayer[0][0] + "  " + tableroPlayer[0][1] + "  " + tableroPlayer[0][2] + tableroPlayer[0][3] + "  " + tableroPlayer[0][4] + "  " + tableroPlayer[0][5] + "  " + tableroPlayer[0][6] + "  ");
        System.out.println("\n 1 " + tableroPlayer[1][0] + "  " + tableroPlayer[1][1] + "  " + tableroPlayer[1][2] + tableroPlayer[1][3] + "  " + tableroPlayer[1][4] + "  " + tableroPlayer[1][5] + "  " + tableroPlayer[1][6] + "  ");
        System.out.println("\n 2 " + tableroPlayer[2][0] + "  " + tableroPlayer[2][1] + "  " + tableroPlayer[2][2] + tableroPlayer[2][3] + "  " + tableroPlayer[2][4] + "  " + tableroPlayer[2][5] + "  " + tableroPlayer[2][6] + "  ");
        System.out.println("\n 3 " + tableroPlayer[3][0] + "  " + tableroPlayer[3][1] + "  " + tableroPlayer[3][2] + tableroPlayer[3][3] + "  " + tableroPlayer[3][4] + "  " + tableroPlayer[3][5] + "  " + tableroPlayer[3][6] + "  ");
        System.out.println("\n 4 " + tableroPlayer[4][0] + "  " + tableroPlayer[4][1] + "  " + tableroPlayer[4][2] + tableroPlayer[4][3] + "  " + tableroPlayer[4][4] + "  " + tableroPlayer[4][5] + "  " + tableroPlayer[4][6] + "  ");
        System.out.println("\n 5 " + tableroPlayer[5][0] + "  " + tableroPlayer[5][1] + "  " + tableroPlayer[5][2] + tableroPlayer[5][3] + "  " + tableroPlayer[5][4] + "  " + tableroPlayer[5][5] + "  " + tableroPlayer[5][6] + "  ");
        System.out.println("\n 6 " + tableroPlayer[6][0] + "  " + tableroPlayer[6][1] + "  " + tableroPlayer[6][2] + tableroPlayer[6][3] + "  " + tableroPlayer[6][4] + "  " + tableroPlayer[6][5] + "  " + tableroPlayer[6][6] + "  ");

        if (FantasColocado1 == true) {
            System.out.println("\nFantasmas de Jugador 1"
                    + "\nFantasmas Buenos: " + FanBuenoP1
                    + "\nFantasmas Malos: " + FanMaloP1);
        }
        if (FantasColocado2 == true) {
            System.out.println("\nFantasmas de Jugador 2"
                    + "\nFantasmas Buenos: " + FanBuenoP2
                    + "\nFantasmas Malos: " + FanMaloP2);
        }
    }

    public static void Players() {
        Players[0][0] = id.userin[0][0];
        player1 = id.userin[0][0];
        readyPlayer1 = true;

        int opcion = 0;

        while (opcion != 3) {
            System.out.println("\n-----------Menu----------"
                    + "\n\n[1]. Iniciar Sesion"
                    + "\n[2]. Registrarse"
                    + "\n[3]. Salir");
            System.out.print("Ingrese opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nIngrese su Usuario: ");
                    String user2 = leer.next();

                    System.out.println("Ingrese su Password: ");
                    String pass = leer.next();

                    if (user2.equals(player1)) {
                        System.out.println("No puedes jugar contigo mismo :( ");
                        id.loggedin = false;
                    } else {
                        if (id.loggedin == true) {
                            id.loggearse(user2, pass);
                            if (id.loggedin == false) {
                                System.out.println("Registrate para jugar!");
                            } else if (id.loggedin == true) {
                                Players[1][0] = user2;
                                player2 = user2;
                                readyPlayer2 = true;
                                CurrentPlayer = 1;
                                opcion = 3;
                            }
                        }
                    }
                    id.loggedin = true;
                    break;

                case 2:
                    id.loggedin = true;

                    System.out.println("\nIngrese su Usuario: ");
                    user2 = leer.next();

                    System.out.println("Ingrese su Password en letras: ");
                    pass = leer.next();

                    if (user2.equals(player1)) {
                        System.out.println("\nNo puedes registrarte porque ya esta este user en uso!!!");
                    } else {
                        id.Registrarse(user2, pass);
                        if (id.loggedin == true) {
                            Players[1][0] = user2;
                            player2 = user2;
                            readyPlayer2 = true;
                            CurrentPlayer = 1;
                            opcion = 3;
                        }
                    }
                    break;
            }
        }
    }

    public static boolean getReady1() {
        if (readyPlayer1 == true) {
            return true;
        }
        return false;
    }

    public static boolean getReady2() {
        if (readyPlayer2 == true) {
            return true;
        }
        return false;
    }

    public static void PedirFantasma() {
        System.out.println("\n [1]. Bueno \n[2]. Malo");
        System.out.println("Que tipo de Fantasma desea colocar");
        fantasma = leer.nextInt();
    }

    public static void vistaTableroAleatorio() {
        for (int fila = 0; fila < tableroPlayer.length; fila++) {
            for (int columna = 0; columna < tableroPlayer[fila].length; columna++) {
                tableroPlayer[fila][columna] = "__";
            }
        }
    }

    public static void vistaTableroManual() {
        for (int fila = 0; fila < tableroPlayer.length; fila++) {

        }
    }

    public static void vaciarTableroManual() {
        for (int fila = 0; fila < tableroPlayer.length; fila++) {
            for (int columna = 0; columna < tableroPlayer[fila].length; columna++) {
                tableroPlayer[fila][columna] = "__";
            }
        }
    }

    public static void vaciarTableroAleatorio() {
        for (int fila = 0; fila < tableroPlayer.length; fila++) {
            for (int columna = 0; columna < tableroPlayer[fila].length; columna++) {
                tableroPlayer[fila][columna] = "__";
            }
        }
    }

    public static boolean buscarEspacioTablero(int _fila, int _columna) {
        if (_fila == -1 && _columna == -1) {
            _fila = fila;
            _columna = columna;
        }
        if (CurrentPlayer == 1) {
            if (_fila < -1 || _fila > 7 || _columna < -1 || _columna > 7) {
                espacioLibre = false;
                System.out.println("\nEsta fuera de los limites");
                return false;
            } else if (tableroPlayer[_fila][_columna].equals("__")) {
                espacioLibre = true;
                return true;
            } else if (tableroPlayer[_fila][_columna].equals(FBP2)) {
                espacioLibre = true;
                return true;
            } else if (tableroPlayer[_fila][_columna].equals(FMP2)) {
                espacioLibre = true;
                return true;
            } else {
                espacioLibre = false;
                return false;
            }
        } else if (CurrentPlayer == 2) {
            if (_fila < -1 || _fila > 7 || _columna < -1 || _columna > 7) {
                espacioLibre = false;
                System.out.println("\nEsta fuera de los limites");
                return false;
            } else if (tableroPlayer[_fila][_columna].equals("__")) {
                espacioLibre = true;
            } else if (tableroPlayer[_fila][_columna].equals(FBP2)) {
                espacioLibre = true;
                return true;
            } else if (tableroPlayer[_fila][_columna].equals(FMP2)) {
                espacioLibre = true;
                return true;
            } else {
                espacioLibre = false;
                return false;
            }
        }
        return false;
    }

    public static void PonerFantasmaAleatorio() {
        if (CurrentPlayer == 1) {
            int cont = 0;
            int fantasmas = idGameMode.getFantasmas();

            while (cont < fantasmas) {
                fila = (int) (Math.random() * 7);
                columna = (int) (Math.random() * 7);
                if (buscarEspacioTablero(fila, columna) == true && fila >= 0 && fila < 2) {
                    if (FanBuenoP1 < fantasma / 2) {
                        tableroPlayer[fila][columna] = FBP1;
                        FanBuenoP1++;
                        espacioLibre = false;
                        cont++;
                    } else if (FanMaloP1 < fantasmas / 2) {
                        tableroPlayer[fila][columna] = FMP1;
                        FanMaloP1++;
                        espacioLibre = false;
                        cont++;
                    }
                }
            }
            CurrentPlayer = 2;
            FantasColocado1 = true;
        }
    }

    public static void UbicacionManual() {
        int limiteB = 0;
        int limiteM = 0;
        System.out.println("Modo de Juego: " + MenuPrincipal.getDifficult());
        if (MenuPrincipal.getDifficult().equals("Normal")) {
            limiteB = 4;
            limiteM = 4;
        } else if (MenuPrincipal.getDifficult().equals("Expert")) {
            limiteB = 2;
            limiteM = 2;
        } else if (MenuPrincipal.getDifficult().equals("Genius")) {
            limiteB = 1;
            limiteM = 1;
        }
        if (CurrentPlayer == 1) {
            System.out.println("\nPlayer" + CurrentPlayer + ":" + player1);
            int fantasmas = idGameMode.getFantasmas();
            int cont = 0;

            while (cont < fantasmas) {
                PedirFantasma();
                System.out.println("\nSeleccione donde quiere colocar el Fantasma: ");

                System.out.println("\nPosicion en fila: ");
                fila = leer.nextInt();

                System.out.println("\nPosicion en columna: ");
                columna = leer.nextInt();

                buscarEspacioTablero(fila, columna);
                if (fila < 0 || fila > 7 || columna < 0 || columna > 7) {
                    System.out.println("\nEsta fuera de los limites");
                } else if (fantasma == 1 && espacioLibre == true && FanBuenoP1 < limiteB && fila < 2 && columna < 7) {
                    if (fila < 2 && columna < 7) {
                        tableroPlayer[fila][columna] = FBP1;
                        FanBuenoP1++;
                        cont++;
                    } else if (fila > 4) {
                        System.out.println("No puedes poner tus fichas del otro lado del tablero!");
                    } else {
                        System.out.println("No puedes poner tus fichas enmedio del tablero!");
                    }
                } else if (fantasma == 2 && espacioLibre == true && FanMaloP1 < limiteM && fila < 2 && columna < 7) {
                    if (fila < 2 && columna < 7) {
                        tableroPlayer[fila][columna] = FMP1;
                        FanMaloP1++;
                        cont++;
                    } else if (fila > 4) {
                        System.out.println("No puedes poner tus fichas del otro lado del tablero!");
                    } else {
                        System.out.println("NO puedes poner tus fichas enmedio del tablero!");
                    }
                } else if (espacioLibre == false) {
                    System.out.println("\nYa hay un fantasma ahi!");
                } else if (FanBuenoP1 >= limiteB || FanMaloP1 >= limiteM) {
                    System.out.println("\nYa alcanzaste el maximo de fantasmas de ese tipo!");
                }

            }
            FantasColocado1 = true;
            if (FantasColocado1 == true) {
                CurrentPlayer = 2;
            }
        }
        if (CurrentPlayer == 2) {
            System.out.println("\nPlayer" + CurrentPlayer + ":" + player2);
            int fantasmas = idGameMode.getFantasmas();
            int cont = 0;

            while (cont < fantasmas) {
                PedirFantasma();
                System.out.println("\nEscriba donde ubicar el fantasma");
                System.out.println("Posicion de Fila: ");
                fila = leer.nextInt();

                System.out.println("Posicion Columna");
                columna = leer.nextInt();

                buscarEspacioTablero(fila, columna);

                if (fila < 0 || fila > 7 || columna < 0 || columna > 7) {
                    System.out.println("\nEsta fuera de los limites");
                } else if (fantasma == 2 && espacioLibre == true && FanMaloP2 < limiteM) {
                    if (fila > 4 && columna < 7) {
                        tableroPlayer[fila][columna] = FMP2;
                        FanMaloP2++;
                        cont++;
                    } else if (fila < 3) {
                        System.out.println("No puedes poner tus fichas del otro lado del Tablero!");
                    } else {
                        System.out.println("No puedes poner tus fichas enmedio del Tablero!");
                    }
                } else if (fantasma == 2 && espacioLibre == true && FanMaloP2 < limiteM) {
                    if (fila > 4 && columna < 7) {
                        tableroPlayer[fila][columna] = FMP2;
                        FanMaloP2++;
                        cont++;
                    } else if (fila < 3) {
                        System.out.println("No puedes poner tus fichas del otro lado del Tablero!");
                    } else {
                        System.out.println("No puedes poner tus fichas enmedio del Tablero!");
                    }
                } else if (espacioLibre == false) {
                    System.out.println("\nYa hay un fantasma ahi!");
                } else if (FanBuenoP2 >= limiteB || FanMaloP2 >= limiteM) {
                    System.out.println("\nYa alacanzaste el maximo de fantasmas de ese tipo!");
                }
            }
            FantasColocado2 = true;
        }
        if (FantasColocado2 == true) {
            CurrentPlayer = 1;
        }
    }

    public static void MoversePlayer1() {
        while (CurrentPlayer == 1 && getJuegoF() != true) {
            if (FantasColocado1 == true && FantasColocado2 == true && JuegoTermino != true) {
                System.out.println("\nPlayer" + CurrentPlayer + ":" + player1 + "Es tu turno");
                System.out.println("\nRecierda solo peudes moverte 1 casilla de maera Horizontal o Vertical!!");
                System.out.println("\nIngrese Fila a escoger: ");
                fila = leer.nextInt();

                System.out.println("\nIngrese Columa a escoger: ");
                columna = leer.nextInt();

                if (fila <= 6 && fila >= 0) {
                    if (tableroPlayer[fila][columna].equals(FBP1)) {
                        System.out.println("]\nSi deseas retirarte escribe -2,-2!");

                        System.out.println("\nIngrese nueva fila:");
                        nuevaFila = leer.nextInt();

                        System.out.println("\nIngrese nueva columna:");
                        nuevaColumna = leer.nextInt();
                        JuegoAcabo(nuevaFila, nuevaColumna);

                        if (nuevaFila == fila + 1 && nuevaColumna == columna) {
                            if (buscarEspacioTablero(nuevaFila, nuevaColumna) == true) {
                                FantasmaComido(nuevaFila, nuevaColumna);
                                JuegoAcabo(nuevaFila, nuevaColumna);
                                tableroPlayer[fila][columna] = nuevaPosicion;
                                tableroPlayer[nuevaFila][nuevaColumna] = FBP1;
                                CurrentPlayer = 2;
                            }
                        } else if (nuevaFila == fila && nuevaColumna == columna + 1 || nuevaFila == fila && nuevaColumna == columna - 1) {
                            if (buscarEspacioTablero(nuevaFila, nuevaColumna) == true) {
                                FantasmaComido(nuevaFila, nuevaColumna);
                                JuegoAcabo(nuevaFila, nuevaColumna);
                                tableroPlayer[fila][columna] = nuevaPosicion;
                                tableroPlayer[nuevaFila][nuevaColumna] = FBP1;
                                CurrentPlayer = 2;
                            }
                        } else {
                            System.out.println("\nEstas tratando de moverte mas de 1 casilla o el espacio esta ocupado!!");
                        }
                    } else if (tableroPlayer[fila][columna].equals(FMP1)) {
                        System.out.println("]\nSi deseas retirarte escribe -2,-2!");

                        System.out.println("\nIngrese nueva fila:");
                        nuevaFila = leer.nextInt();

                        System.out.println("\nIngrese nueva columna:");
                        nuevaColumna = leer.nextInt();
                        JuegoAcabo(nuevaFila, nuevaColumna);

                        if (nuevaFila == fila + 1 && nuevaColumna == columna) {
                            if (buscarEspacioTablero(nuevaFila, nuevaColumna) == true) {
                                FantasmaComido(nuevaFila, nuevaColumna);
                                JuegoAcabo(nuevaFila, nuevaColumna);
                                tableroPlayer[fila][columna] = nuevaPosicion;
                                tableroPlayer[nuevaFila][nuevaColumna] = FMP1;
                                CurrentPlayer = 2;
                            }
                        } else if (nuevaFila == fila && nuevaColumna == columna + 1 || nuevaFila == fila && nuevaColumna == columna - 1) {
                            if (buscarEspacioTablero(nuevaFila, nuevaColumna) == true) {
                                FantasmaComido(nuevaFila, nuevaColumna);
                                JuegoAcabo(nuevaFila, nuevaColumna);
                                tableroPlayer[fila][columna] = nuevaPosicion;
                                tableroPlayer[nuevaFila][nuevaColumna] = FMP1;
                                CurrentPlayer = 2;
                            } else {
                                System.out.println("\nEstas tratando de moverte mas de 1 casilla o el espacio esta ocupado!!");
                            }
                        }

                    }
                }
            }

        }
    }

    public static void MoversePlayer2() {
        while (CurrentPlayer == 2 && getJuegoF() != true) {
            if (FantasColocado1 == true && FantasColocado2 == true && JuegoTermino != true) {
                System.out.println("\nPlayer" + CurrentPlayer + ":" + player1 + "Es tu turno");
                System.out.println("\nRecierda solo peudes moverte 1 casilla de maera Horizontal o Vertical!!");
                System.out.println("\nIngrese Fila a escoger: ");
                fila = leer.nextInt();

                System.out.println("\nIngrese Columna a escoger: ");
                columna = leer.nextInt();

                if (fila <= 6 && fila >= 0) {
                    if (tableroPlayer[fila][columna].equals(FBP2)) {
                        System.out.println("]\nSi deseas retirarte escribe -2,-2!");

                        System.out.println("\nIngrese nueva fila:");
                        nuevaFila = leer.nextInt();

                        System.out.println("\nIngrese nueva columna:");
                        nuevaColumna = leer.nextInt();
                        JuegoAcabo(nuevaFila, nuevaColumna);

                        if (nuevaFila == fila + 1 && nuevaColumna == columna) {
                            if (buscarEspacioTablero(nuevaFila, nuevaColumna) == true) {
                                FantasmaComido(nuevaFila, nuevaColumna);
                                JuegoAcabo(nuevaFila, nuevaColumna);
                                tableroPlayer[fila][columna] = nuevaPosicion;
                                tableroPlayer[nuevaFila][nuevaColumna] = FBP2;
                                CurrentPlayer = 1;
                            }
                        } else if (nuevaFila == fila && nuevaColumna == columna + 1 || nuevaFila == fila && nuevaColumna == columna - 1) {
                            if (buscarEspacioTablero(nuevaFila, nuevaColumna) == true) {
                                FantasmaComido(nuevaFila, nuevaColumna);
                                JuegoAcabo(nuevaFila, nuevaColumna);
                                tableroPlayer[fila][columna] = nuevaPosicion;
                                tableroPlayer[nuevaFila][nuevaColumna] = FBP2;
                                CurrentPlayer = 1;
                            }
                        } else {
                            System.out.println("\nEstas tratando de moverte mas de 1 casilla o el espacio esta ocupado!!");
                        }
                    } else if (tableroPlayer[fila][columna].equals(FMP2)) {
                        System.out.println("]\nSi deseas retirarte escribe -2,-2!");

                        System.out.println("\nIngrese nueva fila:");
                        nuevaFila = leer.nextInt();

                        System.out.println("\nIngrese nueva columna:");
                        nuevaColumna = leer.nextInt();
                        JuegoAcabo(nuevaFila, nuevaColumna);

                        if (nuevaFila == fila + 1 && nuevaColumna == columna) {
                            if (buscarEspacioTablero(nuevaFila, nuevaColumna) == true) {
                                FantasmaComido(nuevaFila, nuevaColumna);
                                JuegoAcabo(nuevaFila, nuevaColumna);
                                tableroPlayer[fila][columna] = nuevaPosicion;
                                tableroPlayer[nuevaFila][nuevaColumna] = FMP2;
                                CurrentPlayer = 1;
                            }
                        } else if (nuevaFila == fila && nuevaColumna == columna + 1 || nuevaFila == fila && nuevaColumna == columna - 1) {
                            if (buscarEspacioTablero(nuevaFila, nuevaColumna) == true) {
                                FantasmaComido(nuevaFila, nuevaColumna);
                                JuegoAcabo(nuevaFila, nuevaColumna);
                                tableroPlayer[fila][columna] = nuevaPosicion;
                                tableroPlayer[nuevaFila][nuevaColumna] = FMP2;
                                CurrentPlayer = 1;
                            } else {
                                if (nuevaFila != -2 && nuevaColumna != -2) {
                                    System.out.println("\nEstas tratando de moverte mas de 1 casilla o el espacio esta ocupado!!");
                                } else {
                                    System.out.println("\nJuego Ocupo!!!");
                                }
                            }
                        }

                    }
                }
            }

        }
    }

    public static void setCurrentPlayer(int Currplay) {
        if (Currplay == 1) {
            CurrentPlayer = 1;
        } else {
            CurrentPlayer = 2;
        }
    }

    public static int getCurrentPlayer() {
        if (CurrentPlayer == 1) {
            return 1;
        }
        return 2;
    }

    public static void JuegoAcabo(int x, int y) {
        if (FanBuenoP1 == 0 || FanMaloP1 == 0) {
            JuegoTermino = true;
            ganador = player2;
            perdedor = player1;

            if (FanBuenoP1 == 0) {
                System.out.println("\nGanador fue: " + player2 + "Porque capturo los fantasmas buenos de: " + player1 + " En el modo: " + idGameMode.getGameMode());
                id.setUltimasPartidas(id.getUserLoggeado(), "Ganador fue: " + player2 + "Comio todos los fantasmas buenos de: " + player1 + "en modo: " + idGameMode.getGameMode());
                id.setPuntos(ganador, 3);
            }
            if (FanMaloP1 == 0) {
                System.out.println("\nGanador fue: " + player2 + "Porque capturo los fantasmas malos de: " + player1 + " En el modo: " + idGameMode.getGameMode());
                id.setUltimasPartidas(id.getUserLoggeado(), "Ganador fue: " + player2 + "Comio todos los fantasmas malos de: " + player1 + "en modo: " + idGameMode.getGameMode());
                id.setPuntos(ganador, 3);
            }

        } else if (FanBuenoP2 == 0 || FanMaloP2 == 0) {
            JuegoTermino = true;
            ganador = player1;
            perdedor = player2;

            if (FanBuenoP1 == 0) {
                System.out.println("\nGanador fue: " + player1 + "Porque capturo los fantasmas buenos de: " + player2 + " En el modo: " + idGameMode.getGameMode());
                id.setUltimasPartidas(id.getUserLoggeado(), "Ganador fue: " + player1 + "Comio todos los fantasmas buenos de: " + player1 + "en modo: " + idGameMode.getGameMode());
                id.setPuntos(ganador, 3);
            }
            if (FanMaloP1 == 0) {
                System.out.println("\nGanador fue: " + player1 + "Porque capturo los fantasmas malos de: " + player2 + " En el modo: " + idGameMode.getGameMode());
                id.setUltimasPartidas(id.getUserLoggeado(), "Ganador fue: " + player1 + "Comio todos los fantasmas malos de: " + player2 + "en modo: " + idGameMode.getGameMode());
                id.setPuntos(ganador, 3);
            }
        } else if (x == -2 && y == -2) {
            JuegoTermino = true;

            if (CurrentPlayer == 1) {
                JuegoTermino = true;
                ganador = player2;
                perdedor = player1;
                System.out.println("\nGanador: " + player2 + "," + player1 + "Abandono el juego" + "en modo: " + idGameMode.getGameMode());
                id.setUltimasPartidas(id.getUserLoggeado(), "Ganador: " + player2 + "," + player1 + "abandono el juego" + "en modo: " + idGameMode.getGameMode());
                id.setPuntos(ganador, 3);
                
            } else if (CurrentPlayer == 2) {
                JuegoTermino = true;
                ganador = player1;
                perdedor = player2;
                System.out.println("\nGanador: " + player1 + "," + player2 + "Abandono el juego" + "en modo: " + idGameMode.getGameMode());
                id.setUltimasPartidas(id.getUserLoggeado(), "Ganador: " + player1 + "," + player2 + "abandono el juego" + "en modo: " + idGameMode.getGameMode());
                id.setPuntos(ganador, 3);
            }
        } else if (EntraCastillo == true) {
            if (CurrentPlayer == 1) {
                JuegoTermino = true;
                ganador = player1;
                perdedor = player2;
                System.out.println("\nGanador fue: " + player1 + "porque entro al castillo del: " + player2 + "en modo: " + idGameMode.getGameMode());
                id.setUltimasPartidas(id.getUserLoggeado(), "Ganador fue: " + player1 + "porque entro al castillo del: " + player2 + "en modo: " + idGameMode.getGameMode());
                id.setPuntos(ganador, 3);  
                
            }else if (CurrentPlayer == 2) {
                JuegoTermino = true;
                ganador = player2;
                perdedor = player1;
                System.out.println("\nGanador fue: " + player1 + "porque entro al castillo del: " + player2 + "en modo: " + idGameMode.getGameMode());
                id.setUltimasPartidas(id.getUserLoggeado(), "Ganador fue: " + player2 + "porque entro al castillo del: " + player1 + "en modo: " + idGameMode.getGameMode());
                id.setPuntos(ganador, 3);
            }
        }
    }
    public static boolean getJuegoF(){
        if(JuegoTermino == true){
            return true;
        }
        return false;
    }
    
    public static boolean getFantasmasColocados(){
        if(FantasColocado1 == true && FantasColocado2 == true){
            return true;
        }
        return false;
    }
    
    public static void FantasmaComido(int fila1, int columna1){
        if(CurrentPlayer == 1){
            if(tableroPlayer[fila1][columna1].equals(FBP1)){
                System.out.println("\nNo puedes poner tu fantasma aqui ya tienes uno tuyo!");
            }
            if(tableroPlayer[fila1][columna1].equals(FMP1)){
                System.out.println("\nNo puedes poner tu fantasma aqui ya tienes uno tuyo!");
            }
            if(tableroPlayer[fila1][columna1].equals(FBP2)){
                System.out.println("\nTe comiste un fantasma bueno de Player 2!");
                tableroPlayer[fila][columna]=nuevaPosicion;
                tableroPlayer[fila1][columna1]= FMP1;
                FanMaloP2--;
            }
            if(tableroPlayer[fila1][columna1].equals(FMP2)){
                System.out.println("\nTe comiste un fantasma malo de Player 2!");
                tableroPlayer[fila][columna]=nuevaPosicion;
                tableroPlayer[fila1][columna1]= FBP1;
                FanMaloP2--;
            }
            if(fila1==6){
                System.out.println("\nLograste llevar un fantasma bueno al otro castillo!");
                EntraCastillo=true;
            }
            
        }else if(CurrentPlayer==2){
            if(tableroPlayer[fila1][columna1].equals(FBP2)){
                System.out.println("\nNo puedes poner tu fantasma aqui ya tienes uno tuyo!");
            }
            if(tableroPlayer[fila1][columna1].equals(FMP2)){
                System.out.println("\nNo puedes poner tu fantasma aqui ya tienes uno tuyo!");
            }
            if(tableroPlayer[fila1][columna1].equals(FBP1)){
                System.out.println("\nTe comiste un fantasma bueno de Player 1!");
                tableroPlayer[fila][columna]=nuevaPosicion;
                tableroPlayer[fila1][columna1]=FMP2;
                FanBuenoP1--;
            }
            if(tableroPlayer[fila1][columna1].equals(FMP1)){
                System.out.println("\nTe comiste un fantasma malo de Player 1!");
                tableroPlayer[fila][columna]=nuevaPosicion;
                tableroPlayer[fila1][columna1]=FBP2;
                FanMaloP1--;
            }
            
            if(fila1==0){
                System.out.println("\nLograste llevar un fantasma bueno al otro castillo!");
                EntraCastillo=true;
            }
        }
    }

}
