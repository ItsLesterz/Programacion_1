package ProyectoGhost;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Juego {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ThreadLocalRandom rnd = ThreadLocalRandom.current();
    //creamos el arreglo unidimensional de un tamaño de 100 donde es privado
    private Player user[] = new Player[100];
    int contador = 0, cantFantasmas = 4, iterador1 = 9, iterador2 = 9;
    //las variables de las dificultades donde la predeterminada es normal
    String modalidad = "aleatorio", difficulty = "normal";
    String player1, player2, logro;
    int ranking[] = new int[100];
    String users[] = new String[100];

    //aqui verificamos que ya exista el username y buscamos el mismo
    public Player buscarUser(String username) {
        for (Player jugador : user) {
            if (jugador != null && jugador.getUser().equals(username)) {
                return jugador;
            }
        }
        return null;
    }
    //impresion del ranking donde buscamos dentro de la clase player
    public void ranking() {
        for (Player ply : user) {
            if (ply != null) {
                ply.ranking();
            }
        }
    }

    //Registrar un nuevo usuario
    public boolean crearUser(String username, String password) {
        if (buscarUser(username) == null) {
            for (int x = 0; x < user.length; x++) {
                if (user[x] == null) {
                    user[x] = new Player(username, password);
                    System.out.println("Se ha creado con exito!!");
                    return true;
                }
            }
        }
        System.out.println("Usuario ya existe!");
        return false;
    }

    public Player Sesion1(String username, String password) {
        for (Player ply : user) {
            //si dentro del arreglo es distinto a null y que sea igual al que ingresamos a la clase player
            if (ply != null && ply.getUser().equals(username) && ply.getPass().equals(password)) {
                return ply;
            }
        }
        return null;
    }

    public Player Sesion2(String username) {
        for (Player ply : user) {
            if (ply != null && ply.getUser().equals(username)) {
                return ply;
            }
        }
        return null;
    }

    public boolean cambiarPass(String username, String password) {
        if (buscarUser(username) != null) {
            for (Player ply : user) {
                if (ply != null && ply.getUser().equals(username)) {
                    ply.setPass(password);
                }
                System.out.println("La constraseña se cambio exitosamente!");
                return true;
            }
        }
        return false;
    }

    public boolean verDatos(String username) {
        if (buscarUser(username) != null) {
            for (Player ply : user) {
                if (ply != null && ply.getUser().equals(username)) {
                    ply.imprimir();
                    return true;
                }
            }
        }
        return false;
    }

    public void dificulty(String dificultad) {
        cantFantasmas = (dificultad.equals("genius")) ? 1 : (dificultad.equals("expert")) ? 2 : 4;
        difficulty = (dificultad.equals("genius")) ? "genius" : (dificultad.equals("expert")) ? "expert" : "normal";
    }

    public boolean eliminarUser(String username) {
        if (buscarUser(username) != null) {
            for (int x = 0; x < user.length; x++) {
                if (user[x] != null) {
                    //esto borraria todo lo del usuario que fue almacenado en el arreglo
                    user[x] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public void Menu() {
        int opcion = 0;
        String user1, pass;
        while (opcion != 3) {
            System.out.print("\n-----------Menu de Incio----------"
                    + "\n[1]. Login"
                    + "\n[2]. Crear Player"
                    + "\n[3]. Salir"
                    + "\nIngrese una opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n********** Inicio de Sesion **********");
                    System.out.print("Nombre de usuario: ");
                    String username = leer.next();
                    System.out.print("Contraseña: ");
                    String password = leer.next();
                    if (Sesion1(username, password) != null) {
                        player1 = username;
                        MenuJuego();
                    }
                    break;

                case 2:
                    do {
                        System.out.println("***** Registrar Usuario *****");
                        System.out.print("Ingrese el usuario: ");
                        user1 = leer.next();
                    } while (buscarUser(user1) != null);
                    System.out.print("Ingrese una contraseña: ");
                    pass = leer.next();
                    crearUser(user1, pass);
                    if (Sesion1(user1, pass) != null) {
                        player1 = user1;
                        MenuJuego();
                    }
                    break;

                case 3:
                    System.out.println("El juego a terminado!");
                    break;
            }
        }
    }

    public void MenuJuego() {
        int opcion = 0, opcion2 = 0, opcion3 = 0, opcion4 = 0;

        while (opcion != 5) {
            System.out.print("\n-----------Menu Principal----------"
                    + "\n[1]. Jugar Ghost Game"
                    + "\n[2]. Configuracion"
                    + "\n[3]. Reportes"
                    + "\n[4]. Mi perfil"
                    + "\n[5]. Cerrar Sesion"
                    + "\nIngrese una opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("-----------Jugar Ghost Game-----------"
                            + "\nIngrese el usuario contrincante: ");
                    String username2 = leer.next();
                    if (Sesion2(username2) != null && !username2.equals(player1)) {
                        player2 = username2;
                        jugar();
                    } else {
                        System.out.println("El usuario no existe o es el mismo del login");
                    }
                    break;

                case 2:
                    while (opcion2 != 3) {
                        System.out.print("\n-----------Configuracion-----------"
                                + "\n[1]. Dificultad"
                                + "\n[2]. Modo de Juego"
                                + "\n[3]. Regresar al Menu Principal"
                                + "\nIngrese una opcion: ");
                        opcion2 = leer.nextInt();
                        switch (opcion2) {
                            case 1:
                                System.out.print("Ingrese la dificultad que desea jugar (normal, expert, genius): ");
                                String dificultad = leer.next().toLowerCase();
                                dificulty(dificultad);
                                break;

                            case 2:
                                System.out.print("Ingrese el modo de juego que desea (manual, aleatorio): ");
                                modalidad = leer.next().toLowerCase();
                                break;

                            case 3:
                                break;
                        }
                    }
                    break;

                case 3:
                    while (opcion3 != 3) {
                        System.out.print("\n-----------Reportes-----------"
                                + "\n[1]. Ultimos 10 Juegos"
                                + "\n[2]. Ranking de Jugadores"
                                + "\n[3]. Regresar al Menu Principal"
                                + "\nIngrese una opcion: ");
                        opcion3 = leer.nextInt();
                        switch (opcion3) {
                            case 1:
                                printlogros(player1);
                                break;

                            case 2:
                                ranking();
                                break;

                            case 3:
                                break;
                        }
                    }
                    break;

                case 4:
                    while (opcion4 != 4) {
                        System.out.print("\n-----------Perfil-----------"
                                + "\n[1]. Ver mis datos"
                                + "\n[2]. Cambiar Password"
                                + "\n[3]. Eliminar Cuenta"
                                + "\n[4]. Volver al Menu principal"
                                + "\nIngrese una opcion: ");
                        opcion4 = leer.nextInt();
                        switch (opcion4) {
                            case 1:
                                verDatos(player1);
                                break;

                            case 2:
                                System.out.print("Ingrese la contraseña a cambiar: ");
                                String passw = leer.next();
                                cambiarPass(player1, passw);
                                break;

                            case 3:
                                System.out.print("Esta seguro que desea eliminar su cuenta (SI/NO)? ");
                                String resp = leer.next().toLowerCase();
                                if (resp.equals("si")) {
                                    System.out.println("Se ha eliminado su cuenta!");
                                    eliminarUser(player1);
                                    opcion = 5;
                                    opcion4 = 4;
                                }
                                break;

                            case 4:
                                System.out.println("Volviendo al menu principal!");
                                break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Se ha cerrado sesion!");
                    break;
            }
        }
    }

    public void jugar() {
        String J1Buenos = "F1", J2Buenos = "F2", resp = "no", J1Malos = "F1", J2Malos = "F2", guion = "__";
        boolean turno = true, posValida, correcto, finPartida = false;
        String tablero[][] = new String[7][7];
        int fila, columna, counter = 0, hayFicha = 0, fila2, columna2, ComidaJ2M = cantFantasmas;
        int ComidaJ1B = cantFantasmas, ComidaJ1M = cantFantasmas, ComidaJ2B = cantFantasmas;

        rellenarMatriz(tablero, guion);

        for (int f = 0; f < tablero.length; f++) {
            tablero[f][0] = f + "";
            for (int c = 1; c < tablero.length; c++) {
                tablero[0][c] = c + " ";
            }
        }

        if (modalidad.equals("manual")) {
            while (counter < (cantFantasmas * 4)) {
                mostrarTurnoActual(turno);
                mostrarMatriz(tablero);

                do {
                    correcto = false;
                    System.out.print("Ingrese la fila: ");
                    fila = leer.nextInt();
                    System.out.print("Ingrese la columna: ");
                    columna = leer.nextInt();
                    if (turno == true) {
                        posValida = validarPosicion1(tablero, fila, columna);
                    } else {
                        posValida = validarPosicion2(tablero, fila, columna);
                    }
                    if (posValida) {
                        if (hayValor(tablero, fila, columna, guion)) {
                            correcto = true;
                            contador++;
                        } else {
                            System.out.println("Ya hay una ficha en esta posicion!");
                        }
                    } else {
                        System.out.println("La posicion no es valida!");
                    }

                } while (!correcto);
                //Se va alternando entre fichas buenas y malas con ayuda del contador, dependiendo del turno
                if ((turno) || (turno && contador == 3) || (turno && contador == 5) || (turno && contador == 7)) {
                    insertarEn(tablero, fila, columna, J1Buenos);
                } else if ((turno && contador == 2) || (turno && contador == 4) || (turno && contador == 6) || (turno && contador == 8)) {
                    insertarEn(tablero, fila, columna, J1Malos);
                    System.out.println(contador);
                } else if ((turno == false && contador == 1) || (turno == false && contador == 3) || (turno == false && contador == 5) || (turno == false && contador == 7)) {
                    insertarEn(tablero, fila, columna, J2Buenos);
                } else if ((turno == false && contador == 2) || (turno == false && contador == 4) || (turno == false && contador == 6) || (turno == false && contador == 8)) {
                    insertarEn(tablero, fila, columna, J2Malos);
                }
                //Devuelve lo inverso a true
                counter++;
                if (counter == (cantFantasmas * 2)) {
                    contador = 0;
                    turno = false;
                }
                //Evaluo para colocar fichas en modo random
            }
        } else if (modalidad.equals("aleatorio")) {
            if (difficulty.equals("normal")) {
                while (counter < cantFantasmas * 5) {
                    insertarRnd(tablero, J1Buenos, J1Malos, J2Buenos, J2Malos);
                    counter++;
                }
            } else if (difficulty.equals("expert")) {
                while (counter < cantFantasmas) {
                    insertarRnd(tablero, J1Buenos, J1Malos, J2Buenos, J2Malos);
                    counter++;
                }
            } else if (difficulty.equals("genius")) {
                insertarRnd(tablero, J1Buenos, J1Malos, J2Buenos, J2Malos);
            }
        }
        counter = 0;
        while (finPartida == false) {
            mostrarTurnoActual(turno);
            mostrarMatriz(tablero);
            System.out.println("Fantasmas buenos de " + player1 + ": " + ComidaJ1B + " || Fantasmas malos de " + player1 + ": " + ComidaJ1M
                    + "\nFantasmas buenos de " + player2 + ": " + ComidaJ2B + " || Fantasmas malos de " + player2 + ": " + ComidaJ2M);
            do {
                correcto = false;
                System.out.print("Ingrese la fila: ");
                fila = leer.nextInt();
                System.out.print("Ingrese la columna: ");
                columna = leer.nextInt();
                posValida = validarPos(tablero, fila, columna);
                if (posValida) {
                    if (fila == -1 && columna == -1 && turno == true) {
                        System.out.print("Esta seguro que desea retirarse (si/no): ");
                        resp = leer.next();
                        if (resp.equals("si")) {
                            sumarPuntos(player2);
                            logro = (player1 + " Se Ha Retirado, " + player2 + " Gana\n");
                            System.out.println(logro);
                            logros10(player1);
                            logros10(player2);
                            correcto = true;
                            finPartida = true;
                        }
                    } else if (fila == -1 && columna == -1 && turno == false) {
                        System.out.print("Esta seguro que desea retirarse (si/no): ");
                        resp = leer.next();
                        if (resp.equals("si")) {
                            sumarPuntos(player1);
                            logro = (player2 + " Se Ha Retirado, " + player1 + " Gana\n");
                            System.out.println(logro);
                            logros10(player1);
                            logros10(player2);
                            correcto = true;
                            finPartida = true;
                        }
                    } else if (hayValor(tablero, fila, columna, J1Buenos)) {
                        hayFicha = 1;
                        correcto = true;
                    } else if (hayValor(tablero, fila, columna, J1Malos)) {
                        hayFicha = 2;
                        correcto = true;
                    } else if (hayValor(tablero, fila, columna, J2Buenos)) {
                        hayFicha = 3;
                        correcto = true;
                    } else if (hayValor(tablero, fila, columna, J2Malos)) {
                        hayFicha = 4;
                        correcto = true;
                    } else {
                        System.out.println("No hay fichas en esta posicion");
                    }
                } else {
                    System.out.println("Esta posicion no es valida");
                }
            } while (correcto == false);
            if (finPartida == false) {
                do {
                    correcto = false;
                    System.out.print("Ingrese la fila a moverse: ");
                    fila2 = leer.nextInt();
                    System.out.print("Ingrese la columna a moverse: ");
                    columna2 = leer.nextInt();
                    if (fila2 < tablero.length && columna2 < tablero.length && ((columna2 == columna + 1 && fila2 == fila)
                            || (columna2 == columna && fila2 == fila + 1) || (columna2 == columna + 1 && fila2 == fila + 1) || (columna2 == columna - 1
                            && fila2 == fila) || (columna2 == columna && fila2 == fila - 1) || (columna2 == columna - 1 && fila2 == fila - 1))) {
                        posValida = true;
                        if (posValida) {
                            if (hayValor(tablero, fila2, columna2, guion)) {
                                correcto = true;
                            } else if (hayValor(tablero, fila2, columna2, J2Buenos) && turno == true) {
                                correcto = true;
                                ComidaJ2B--;
                                System.out.println(player1 + " se comio un fantasma bueno de " + player2);
                            } else if (hayValor(tablero, fila2, columna2, J2Malos) && turno == true) {
                                correcto = true;
                                ComidaJ2M--;
                                System.out.println(player1 + " se comio un fantasma malo de " + player2);
                            } else if (hayValor(tablero, fila2, columna2, J1Buenos) && turno == false) {
                                correcto = true;
                                ComidaJ1B--;
                                System.out.println(player2 + " se comio un fantasma bueno de " + player1);
                            } else if (hayValor(tablero, fila2, columna2, J1Malos) && turno == false) {
                                correcto = true;
                                ComidaJ1M--;
                                System.out.println(player2 + " se comio un fantasma bueno de " + player1);
                            }
                        }
                        counter++;
                        switch (hayFicha) {
                            case 1:
                                insertarEn(tablero, fila2, columna2, J1Buenos);
                                break;
                            case 2:
                                insertarEn(tablero, fila2, columna2, J1Malos);
                                break;
                            case 3:
                                insertarEn(tablero, fila2, columna2, J2Buenos);
                                break;
                            case 4:
                                insertarEn(tablero, fila2, columna2, J2Malos);
                                break;
                        }
                        turno = !turno;
                    } else if (columna == columna2 && fila == fila2) {
                        System.out.println("Esta posicion esta ocupada por la misma ficha");
                    } else {
                        System.out.println("Solo se puede mover 1 posicion");
                    }
                    insertarEn(tablero, fila, columna, guion);
                } while (correcto == false);
            }
            if (ComidaJ1B == 0) {
                finPartida = true;
                logro = ("Ha ganado " + player2 + " se comio todos los fantasmas buenos de " + player1 + "\n");
                System.out.println(logro);
                logros10(player1);
                logros10(player2);
                sumarPuntos(player2);
            } else if (ComidaJ1M == 0) {
                finPartida = true;
                logro = ("Ha ganado " + player2 + " se comio todos los fantasmas malos de " + player1 + "\n");
                System.out.println(logro);
                logros10(player1);
                logros10(player2);
                sumarPuntos(player2);
            } else if (ComidaJ2B == 0) {
                finPartida = true;
                logro = ("Ha ganado " + player1 + " se comio todos los fantasmas buenos de " + player2 + "\n");
                System.out.println(logro);
                logros10(player1);
                logros10(player2);
                sumarPuntos(player1);
            } else if (ComidaJ2M == 0) {
                finPartida = true;
                logro = ("Ha ganado " + player1 + " se comio todos los fantasmas malos de " + player2 + "\n");
                System.out.println(logro);
                logros10(player1);
                logros10(player2);
                sumarPuntos(player1);

            } else if (tablero[1][1].equals(J1Buenos) || tablero[1][6].equals(J1Buenos)) {
                finPartida = true;
                logro = ("El fantasma bueno de " + player1 + " ha salido por el castillo contrario, " + player2 + " perdio!\n");
                System.out.println(logro);
                logros10(player1);
                logros10(player2);
                sumarPuntos(player1);
            } else if (tablero[6][1].equals(J2Buenos) || tablero[6][6].equals(J2Buenos)) {
                finPartida = true;
                logro = ("El fantasma bueno de " + player2 + " ha salido por el castillo contrario, " + player1 + " perdio!\n");
                System.out.println(logro);
                logros10(player1);
                logros10(player2);
                sumarPuntos(player2);
            }
        }

    }

    public void insertarEn(String[][] tablero, int fila, int columna, String ficha) {
        tablero[fila][columna] = ficha;
    }

    public void insertarRnd(String tablero[][], String ficha, String ficha2, String ficha3, String ficha4) {
        insertarEn(tablero, rnd.nextInt(5, 6 + 1), rnd.nextInt(2, 5 + 1), ficha);
        insertarEn(tablero, rnd.nextInt(5, 6 + 1), rnd.nextInt(2, 5 + 1), ficha2);
        insertarEn(tablero, rnd.nextInt(1, 2 + 1), rnd.nextInt(2, 5 + 1), ficha3);
        insertarEn(tablero, rnd.nextInt(1, 2 + 1), rnd.nextInt(2, 5 + 1), ficha4);
    }

    public void mostrarTurnoActual(boolean turno) {
        if (turno) {
            System.out.println("Turno de jugador 1");
        } else {
            System.out.println("Turno de jugador 2");
        }
    }

    public void rellenarMatriz(String[][] matriz, String simbolo) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = simbolo;
            }
        }
    }

    public boolean sumarPuntos(String username) {
        Player ply = buscarUser(username);
        if (buscarUser(username) != null) {
            ply.setPuntaje();
            return true;
        }
        return false;
    }

    public void printlogros(String username) {
        Player ply = buscarUser(username);
        if (buscarUser(username) != null) {
            ply.imprimirlogros();
        }
    }

    public boolean logros10(String username) {
        Player ply = buscarUser(username);
        if (buscarUser(username) != null) {
            ply.setLogros(logro);
            return true;
        }
        return false;
    }

    public boolean validarPos(String[][] tablero, int fila, int columna) {
        return fila < tablero.length && columna < tablero.length;
    }

    public boolean validarPosicion1(String[][] tablero, int fila, int columna) {
        return (fila >= 5 && fila <= 6) && fila < tablero.length && columna >= 2 && columna < tablero.length && columna < 6;
    }

    public boolean validarPosicion2(String[][] tablero, int fila, int columna) {
        return (fila >= 1 && fila <= 2) && fila < tablero.length && columna >= 2 && columna < tablero.length && columna < 6;
    }

    public boolean hayValor(String[][] matriz, int fila, int columna, String simbolo) {
        return matriz[fila][columna].equals(simbolo);
    }

    public void mostrarMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
