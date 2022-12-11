package Lab_Progra1;
import java.util.Scanner;

public class JavaLook {
    static EmailAccount Emails[];        
    static Scanner leer=new Scanner(System.in);

    public static void main(String[] args) {
        Emails=new EmailAccount[100];
        EmailAccount accountActual=null;
        int Opcion=1;
        while (Opcion!=3){
            System.out.print("---- Javalook ----\n\n");
            System.out.println("[1] LOGIN");
            System.out.println("[2] CREAR ACCOUNT");
            System.out.println("[3] SALIR");
            System.out.print("Ingrese opcion:");
            Opcion=leer.nextInt();
            if (Opcion==1){
                while (accountActual==null){
                    String direccion, password;
                    System.out.print("Ingrese la direccion: "); leer.useDelimiter("\n"); direccion=leer.next();
                    System.out.print("Ingrese el password: "); leer.useDelimiter("\n"); password=leer.next();
                    if (login(direccion, password)==true){
                        System.out.println("Se inicio sesion");
                        accountActual=searchEmail(direccion);
                        menuPrincipal(accountActual);
                    }else {
                        System.out.println("La direccion no existe o las credenciales son incorrectas");
                    } 
                }
            }else if (Opcion==2){
                while (accountActual==null){
                    if (espacioCuentas()!=-1){
                        String direccion, password, username, nombre;
                        System.out.print("Ingrese la Direccion: "); leer.useDelimiter("\n"); direccion=leer.next();
                        if (searchEmail(direccion)==null){
                            System.out.println("Ingrese su Nombre Completo: "); leer.useDelimiter("\n"); nombre=leer.next();
                            System.out.print("Ingrese Username: "); leer.useDelimiter("\n"); username=leer.next();
                            System.out.print("Ingrese Password: "); leer.useDelimiter("\n"); password=leer.next();
                            System.out.println("Se creo exitosamente");
                            Emails[espacioCuentas()]=new EmailAccount(direccion, password, username, nombre);
                            accountActual=searchEmail(direccion);
                            menuPrincipal(accountActual);
                        }else {
                            System.out.println("No se pudo crear porque ya existe esta direccion");
                        }
                    }
                }
            }
            accountActual=null;
        }
    }
    public static EmailAccount searchEmail(String direccion){
        for(int i=0;i<Emails.length;i++){
            if (Emails[i]!=null){
                if(direccion.equals(Emails[i].getDireccionEmail())){
                   return Emails[i];
                } 
            }
        }
        return null;
    }
    public static boolean login(String direccion, String password){
        for(int i=0;i<Emails.length;i++){
            if (Emails[i]!=null){
                if(direccion.equals(Emails[i].getDireccionEmail()) && password.equals(Emails[i].getPassword())){
                    return true;
                } 
            }
        }
        return false;
    }
    public static int espacioCuentas(){
        for (int i=0;i<Emails.length;i++){
            if (Emails[i]==null){
                return i;
            }
        }
        return -1;
    }
    public static void menuPrincipal(EmailAccount email){
        int Opcion=1;
        while (Opcion!=5){
            System.out.println("----Menu Principal----\n\n");
            System.out.println("[1] VER MI INBOX");
            System.out.println("[2] MANDAR CORREO");
            System.out.println("[3] LEER UN CORREO");
            System.out.println("[4] LIMPIAR MI INBOX");
            System.out.println("[5] CERRAR SESION");
            System.out.println("Ingrese opcion: ");
            Opcion=leer.nextInt();
            if (Opcion==1){
                email.printInbox();
            }else if(Opcion==2){
                String direccion, asunto, contenido;
                System.out.print("Ingrese Direccion del Destinatario: "); leer.useDelimiter("\n"); direccion=leer.next();
                System.out.print("Ingrese Asunto: "); leer.useDelimiter("\n"); asunto=leer.next();
                System.out.println("Ingrese Contenido: "); leer.useDelimiter("\n"); contenido=leer.next();
                Email emailEnviado=new Email(email.getDireccionEmail(), asunto, contenido);
                EmailAccount Destinatario=searchEmail(direccion);
                if (searchEmail(direccion)==null || Destinatario.EspacioInbox()==-1){
                    System.out.println("Direccion de email no existe o el inbox del destinatario esta lleno");
                }else{
                    System.out.println("El correo fue enviado exitosamente");
                    Destinatario.recibirEmail(emailEnviado);
                }
                
            }else if(Opcion==3){
                int pos;
                System.out.print("Ingrese la posicion del correo que desea leer: "); pos=leer.nextInt();
                email.leerEmail(pos);
            }else if(Opcion==4){
                email.borrarLeido();
                System.out.println("Inbox limpiado exitosamente!!!!1");
            }
        }
    }
}
