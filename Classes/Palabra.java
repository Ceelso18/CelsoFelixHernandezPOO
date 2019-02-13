import java.util.*;
public class Palabra{
    //ATRIBUTOS
    private int longitud;
    private String palabra;
    //METODOS
    public void setPalabra(String palabra){
        this.palabra = palabra;
    }    
    public String getPalabra(){
        return palabra;
    }
    
    public String contarLetras(){

        String mensaje ="La palabra "+palabra+" tiene "+palabra.length()+" letras";
        return mensaje;
    }

    public boolean esMayor(){
        if (palabra.length()>8){
          return true;
          }else{
          return false;
        }
    }

    public void setLongitud(int longitud){
        this.longitud = longitud;
    }    
    public int getLongitud(){
        return longitud;
    } 

    public static void main(String[] args) {
        Palabra newpalabra = new Palabra();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Escribe una palabra");
        String palabra = scanner.next();
        newpalabra.setPalabra(palabra);


        if (newpalabra.esMayor()){
            System.out.println("La palabra "+palabra+" es largo");
        }else{
            System.out.println("La palabra "+palabra+" es largo");
        }
        System.out.println(newpalabra.contarLetras());
    }
}