package eje2_POO;

public class Paciente extends Persona {
    
    public String afiliacion;

    public Paciente(String nombre,String afiliacion) {
        super(nombre);
        this.afiliacion = afiliacion;
    }

    public boolean pedir_cita(Medico medico){
        System.out.println(medico.dia.disponibles());
        int cita = (int)(Math.random() * 7);
        medico.dia.reservar(cita);
        System.out.println("Cita reservada en la franja " + cita);
        return true;
    }

    public boolean equals(Paciente otro){
        return nombre.equals(otro.nombre) && afiliacion.equals(otro.afiliacion);
        
    }
}
