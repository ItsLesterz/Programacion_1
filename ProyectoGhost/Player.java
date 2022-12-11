
package ProyectoGhost;

public class Player {
    private int puntaje;
    private String users, pass, logros;
    //llamado de variables globales=lcocales
    public Player(String user, String pass){
        this.users=user;
        this.pass = pass;
        puntaje = 0;
        logros = " ";
    }
    public String getLogros() {
        return logros;
    }

    public void setLogros(String logros) {
        this.logros = logros+this.logros;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje() {
        this.puntaje += 3;
    }

    public String getUser() {
        return users;
    }

    public void setUser(String user) {
        this.users = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public void imprimir(){
        System.out.println("Username: "+users
                +"\nPassword: "+pass
                +"\nPuntaje: "+puntaje+" pts");
    }
    
    public void ranking(){
        System.out.println("Username: "+users+" || puntaje: "+puntaje+" pts");
    }
    
    public void imprimirlogros(){
        System.out.println("Ultimos 10 juegos\n"+logros);
    }
}
