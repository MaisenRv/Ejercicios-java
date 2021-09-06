package eje1_POO;

import java.util.List;

public class Barrio {
    public String nombre;
    public List<Direccion> direcciones;

    public Barrio (String nombre,List<Direccion> direcciones){
        this.nombre = nombre;
        this.direcciones = direcciones;
    }
    
}
