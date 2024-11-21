package Ejercicio2;

public class Presentacion {

    public static void main(String[] args) {
        
        Persona mensaje = new Persona();
        Estudiante estud = new Estudiante("Said Alejandro", "Martelo Diaz", 17);
        Profesor profe = new Profesor("John Carlos", "Arrieta Arrieta", "Programacion Orientada a Objetos");
        
        mensaje.presentarse();
        estud.presentarse();
        System.out.println("----------------------");
        profe.presentarse();
        
        
    }
    
}
