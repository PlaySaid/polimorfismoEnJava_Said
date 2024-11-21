package Ejercicio2;

public class Profesor extends Persona{
    
    String nombre,apellido,asignatura;
    
    public Profesor(String nombre, String apellido, String asignatura){
        this.nombre = nombre;
        this.apellido = apellido;
        this.asignatura = asignatura;
        
    }
    
    /**********************************************/
    
    @Override
    public void presentarse(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Asignatura: "+asignatura);
    }
    
}
