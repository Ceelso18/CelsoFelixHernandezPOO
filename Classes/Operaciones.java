import java.util.Scanner;

public class Operaciones 
{
    //atributos 
    public double a;
    public double b;

    //metodos 

    public double sumarNumeros(){
        return a + b;
    }

    public double restarNumeros(){
        return a - b;
    }

    public double dividirNumeros(){
        return a / b;  
    }

    public double multiplicarNumeros(){
        return a * b;
    }

    public void main(String[] args){

        Operaciones operaciones1 = new Operaciones();

        System.out.println ("numero1");
        operaciones1.a = Scanner.nextdouble();

        System.out.println ("numero2");
        operaciones1.b = Scanner.nextdouble();

        double suma = operaciones1.sumarNumeros();

        System.out.println("El resultado es" + suma);

    }

}
