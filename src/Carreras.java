import java.util.Random;

public class Carreras {
    public static void main(String[] args) {
        Coche cocheAzul= new Coche("Focus", "Ford", 150);
        Coche cocheBlanco=new Coche("Cayane","Porsche",180);

        //Aqui jugamos con acelerar y frenar y vamos mostrando datos:

        cocheAzul.acelerar(50);
        cocheBlanco.acelerar(45);
        cocheAzul.mostrarDatos();
        cocheBlanco.mostrarDatos();

        cocheAzul.frenar(20);
        cocheBlanco.frenar(25);
        cocheAzul.mostrarDatos();
        cocheBlanco.mostrarDatos();

        cocheAzul.acelerar(40);
        cocheBlanco.acelerar(50);
        cocheAzul.mostrarDatos();
        cocheBlanco.mostrarDatos();

        cocheAzul.frenar(30);
        cocheBlanco.frenar(25);
        cocheAzul.mostrarDatos();
        cocheBlanco.mostrarDatos();


        if (cocheAzul.getKm() > cocheBlanco.getKm()) {
            System.out.println("El ganador es "+cocheAzul.getMarca()+ " "+ cocheAzul.getModelo());
        } else if (cocheBlanco.getKm()>cocheAzul.getKm()) {
            System.out.println("El ganador es "+cocheBlanco.getMarca()+" "+cocheBlanco.getModelo());
        }else{
            System.out.println("Empate");
        }

    }
}
class Coche{
    private String modelo;
    private String marca;
    private int cv;
    private int velocidad;
    private double km;
    public Coche(String modelo, String marca, int cv){
        this.modelo= modelo;
        this.marca = marca;
        this.cv=cv;
        this.velocidad=0;
        this.km=0.0;
    }
    //Getter y setter para los atributos
    public void acelerar(int cantidad){
        if(velocidad + cantidad <=180){
            velocidad+=cantidad;
        }else{
            velocidad=180;
        }
        Random random = new Random();
        km+= velocidad*(cv*(1+ random.nextDouble()*9)); //formula para aumentar los km en funcion de la velocidad y la cv
    }
    public void frenar(int cantidad){
        if(velocidad - cantidad >=0){
            velocidad -=cantidad;
        }else{
            velocidad=0;
        }
    }
    public void resetear(){
        velocidad=0;
        km=0.0;
    }
    public void mostrarDatos(){
        System.out.println("Coche: "+marca+" "+modelo);
        System.out.println("CV: "+cv);
        System.out.println("Velocidad: "+velocidad+" km/h");
        System.out.println("Kilometros recorridos: "+km);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
}
