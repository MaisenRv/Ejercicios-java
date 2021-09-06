package eje2_POO;

public class Medico extends Persona {
    public String especialidad;
    public Agenda dia;
    private int franja_actual;

    public Medico(String nombre,String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
        dia = new Agenda();
        franja_actual = 0;
    }

    public void atender(){
        System.out.println("Paciente atendidoen franaja "+ franja_actual);
        franja_actual += 1;

        if (franja_actual == 7) {
            dia = new Agenda ();
            franja_actual = 0;
        }
    }
}
