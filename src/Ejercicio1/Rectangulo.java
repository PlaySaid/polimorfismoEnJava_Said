package Ejercicio1;

public class Rectangulo extends Figura{
        
    private double largo,ancho;
    
    public Rectangulo(double largo, double ancho){
        this.largo = largo;
        this.ancho = ancho;
    }
    
    //Metodo para sobreescribir el metodo abstracto de la clase padre
    @Override
        public void calcularArea(){
            double area = largo*ancho;
            System.out.println("El area del rectangulo es: "+area);
        
       }
    
}