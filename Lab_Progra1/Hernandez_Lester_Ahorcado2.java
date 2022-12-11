
import java.util.Scanner;

public class Hernandez_Lester_Ahorcado2{
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Scanner lea=new Scanner(System.in);
        int opcion=0;

        String Palabras[] = {"programacion", "zapato", "carro", "moto", "flauta", "baleada", "comida","Papas","pollo","aeropuerto"};
        boolean End = true;

        String Users[]=new String[100];

        for(int i=0;i<100;i++){
            Users[i]="";
        }

        while (End){
            System.out.print("\n\n-------------- Menu Inicio --------------" +
                    "\n\t1.Inicio de Sesión" +
                    "\n\t2. Registrar Usuario" +
                    "\n\t3. Salir" +
                    "\n--------------------------------------------" +
                    "\n\nElija la opcion que desee: ");
            opcion = leer.nextInt();

            switch (opcion){
                case 1://Inicio de Sesión
                    System.out.println("INICIO DE SESION"+"\n");
                    System.out.print("Nombre de Usuario: ");

                    String Username=lea.next();
                    System.out.print("\n");
                    System.out.print("Password: ");
                    int password=leer.nextInt();
                    String compare=Users[password];
                    if(!compare.equals(Username)) {
                        System.out.println("error");
                        break;

                    }

                    int opcion1=0;

                    while (End){
                        System.out.print("\n\n-------------- Menu Principal --------------" +
                                "\n\t1. Jugar" +
                                "\n\t2. Cambiar Palabras" +
                                "\n\t3. Cerrar sesión" +
                                "\n--------------------------------------------" +
                                "\n\nElija la opcion que desee: ");
                        opcion1 = leer.nextInt();
                        switch (opcion1){
                            case 1://Jugar



                                int Alazar = (int) (Math.random() * Palabras.length);
                                int size = Palabras[Alazar].length();

                                String palabra_adivina = Palabras[Alazar];

                                char Adivina[] = new char[size];
                                char Palabras_Adivinadas[] = new char[size];

                                int vidas = 5;

                                for (int i = 0; i < Adivina.length; i++) {

                                    Palabras_Adivinadas[i] = '_';

                                    Adivina[i] = palabra_adivina.charAt(i);

                                }

                                boolean game = true;
                                while (game) {
                                    boolean Adivinaste = false;

                                    System.out.println("");
                                    System.out.println("vidas:"+vidas);
                                    System.out.println("Ingrese una letra");

                                    char letra_ingresada = leer.next().toLowerCase().charAt(0);

                                    for (int i = 0; i < Adivina.length; i++) {

                                        if (letra_ingresada == Adivina[i] ||letra_ingresada==Palabras_Adivinadas[i]) {
                                            Palabras_Adivinadas[i] = letra_ingresada;
                                            Adivinaste = true;
                                            System.out.println("¡Le pegaste a un carácter!");
                                        }

                                    }

                                    if (Adivinaste != true) {
                                        System.out.println("te equivocaste");
                                        vidas--;
                                        System.out.println("vidas: " + vidas);
                                    }
                                    System.out.println("");

                                    System.out.println();
                                    for (int x = 0; x < Palabras_Adivinadas.length; x++) {
                                        System.out.print(Palabras_Adivinadas[x]);

                                    }

                                    int counter = 0;
                                    for (char checar : Palabras_Adivinadas) {

                                        if (checar == Adivina[counter]) {
                                            game = false;
                                        } else {
                                            game = true;
                                            break;
                                        }
                                        counter++;

                                    }
                                    if (vidas < 1) {
                                        System.out.println("\nPerdiste se te acabaron las vidas!");
                                        System.out.println("La palabra era: " + palabra_adivina);
                                        game = false;
                                    }
                                }





                                break;

                            case 2://Cambiar Palabras
                                System.out.println("Agregar palabras aqui se pueden cambaiar las siguientesd palabras");
                                int indice=0;
                                for(int i=0;i<Palabras.length;i++){
                                    System.out.println(i+"-"+Palabras[i]);

                                }
                                System.out.println("elija el indice de la palabra que desea modificar");
                                indice=lea.nextInt();
                                System.out.println("Ingrese la palabra  nada de espacios en blanco");
                                Palabras[indice]=leer.next().toLowerCase();
                                break;


                            case 3://Cerrar sesión\
                                End=false;

                                break;
                        }


                    }

                    End=true;
                    break;




                case 2://Registrar Usuario

                    String NewUsername;
                    int NewPassword;

                    boolean fail=false;
                    System.out.println("Registrar Usuario");

                    System.out.print("Nombre de Usuario: ");

                    NewUsername=lea.next();
                    System.out.print("\n");
                    System.out.print("Password: ");
                    NewPassword=leer.nextInt();
                    for(int i=0;i<Users.length;i++){
                        if (Users[i].equals(NewUsername)|| !Users[NewPassword].equals("")){
                            fail=true;
                            break;

                        }

                    }
                    if(fail){
                        break;
                    }


                    Users[NewPassword]=NewUsername;
                    System.out.println("se ha registrado");
                    break;


                case 3://Salir
                    System.out.println("Se termino el programa!");
                    End = false;
                    break;


            }

        }
    }


}