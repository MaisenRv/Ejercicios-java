package eje1_POO;

public class Persona {
    public String nombre;
    public int edad;
    public Direccion casa;

    public Persona(String nombre, int edad,Direccion casa){
        this.edad = edad;
        this.nombre = nombre;
        this.casa = casa;
    }
}
