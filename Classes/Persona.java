public class persona{
    //atributos
    private String nombre;
    private int edad;
    private String rfc; 
    private char sexo;
    private double peso; 
    private double altura;

    //metodos 
    public int cacularimc(){
        double imc = peso / Math.pow(altura,2);
        int res = 0;
        
        if (imc < 20){  
            res -1;
    } 
        else if (imc <-20 && imc <-25){
            res 0;
        }
        else {
            res 1;
        }
        else {
            res 1;
        }

    public boolean esMayorDeEdad(){
        boolean mayor = false;
        if (edad >= 18){
            mayor =true
    }

    public String toString(){
        system.out.println ("nombre " + nombre +
        "\n tu edad es " + edad +
        "\n Tu RFC es: " + rfc +
        "\n Tu sexo es " + sexo + 
        "\n Tu peso es " + peso +
        "\n Tu altura es " + altura); 
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public void setEdad (String edad){
        this.edad = edad;
    }

    public void setRfc (String rfc){
        this.edad = rfc;
    }

    public void setSexo (String sexo){
        this.sexo = sexo;
    }

    public void setPeso (String peso){
        this.peso = peso;
    }

    public void setAltura (String altura){
        this.altura = altura;
    }

    public String getNombre(){
        return nombre
    }

    public String getEdad (){
        return edad
    }

    public String getRfc (){
        return rfc
    }

    public String getSexo (){
        return sexo
    }

    public String getPeso (){
        return peso 
    }   
