import java.util.Scanner;
public class password{
    //atributos
    private int String longitud;
    private String password; 

    //Es fuerte 
    public Password(){
        longitud =0;
        password = "";
    }
    
    public Password(int longitud){
        this.longitud = longitud;
         this.contrasena = this.generarPassword();
    }

    public Password(String contrasena){
        this.longitud = contrasena.length();
        this.contrasena = contrasena;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public int getLongitud() {

        return longitud;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }

    