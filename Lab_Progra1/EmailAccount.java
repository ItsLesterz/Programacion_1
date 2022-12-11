package Lab_Progra1;

public class EmailAccount {
    private String DireccionEmail="", password="", username="", nombre="";
    Email inbox[];
    public void borrarLeido(){
        for (int i=0;i<inbox.length;i++){
            if (inbox[i]!=null){
                inbox[i]=null;
            }
        }
    }
    
    public int EspacioInbox(){
        for (int i=0;i<inbox.length;i++){
            if (inbox[i]==null){
                return i;
            }
        }
        return -1;
    }
    public boolean recibirEmail(Email em){
        if (EspacioInbox()!=-1){
            inbox[EspacioInbox()]=em;
            return true;
        }
        return false;
    }
    public EmailAccount(String Direccion, String password, String username, String nombre){
        DireccionEmail=Direccion;
        this.password=password;
        this.username=username;
        this.nombre=nombre;
        inbox=new Email[100];
    }
    public void printInbox(){
        int TotalRecibidos=0, Sinleer=0;
        System.out.println("Direccion: "+DireccionEmail);
        System.out.println("Nombre completo: "+nombre);
        
        for (int i=0;i<inbox.length;i++){
            if (inbox[i]!=null){
                String mensaje=inbox[i].getLeido()==false ? "Sin Leer":"Leido";
                System.out.println((i+1)+" - "+inbox[i].getEmailE()+" - "+inbox[i].getAsunto()+" - "+mensaje);
                if (inbox[i].getLeido()==false){
                    Sinleer++;
                }
                TotalRecibidos++;
            }
        }
        System.out.println("Correos sin leer: "+Sinleer);
        System.out.println("Total de correos recibidos: "+TotalRecibidos);
    }
    public void leerEmail(int pos){
        if (inbox[pos-1]!=null){
            inbox[pos-1].print();
            inbox[pos-1].leido();
        }else{
            System.out.println("Correo No Existe");
        }
    }
    //Getters
    public String getDireccionEmail(){
        return DireccionEmail;
    }
    public String getPassword(){
        return password;
    }
    public String getUsername(){
        return username;
    }
    public String getNombre(){
        return nombre;
    }
}
