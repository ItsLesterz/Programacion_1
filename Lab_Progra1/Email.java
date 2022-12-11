package Lab_Progra1;

public class Email {
    private String EmailE="", Asunto="", Contenido="";
    boolean Leido;
    public Email(String EmailE, String Asunto, String Contenido){
        this.EmailE=EmailE;
        this.Asunto=Asunto;
        this.Contenido=Contenido;
        Leido=false;
    }
    public boolean getLeido(){
        return Leido;
    }
    public void leido(){
        Leido=true;
    }
    public String getEmailE(){
        return EmailE;
    }
    public String getAsunto(){
        return Asunto;
    }
    public String getContenido(){
        return Contenido;
    }
    public void print(){
        System.out.println("De: "+EmailE);
        System.out.println("Asunto: "+Asunto);
        System.out.println(Contenido);
    }
  
}
