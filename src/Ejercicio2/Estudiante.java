package Ejercicio2;

public class Estudiante extends Persona{
    
    String nombre,apellido;
    int edad;
    
    public Estudiante(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    /**********************************************/
    
    @Override
    public void presentarse(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad+"años.");
    }
    
}
