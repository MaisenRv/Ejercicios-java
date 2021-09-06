package eje2_POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class eps {
    List <Medico> medicos;
    List <Paciente> pacientes;

    public eps (){
        medicos = new ArrayList<Medico>();
        pacientes = new ArrayList<Paciente>();
        
    }

    public void crear_medico (Scanner sc){
        String entrada = sc.nextLine();
        String[] datos = entrada.split(" ");
        medicos.add(new Medico(datos[0], datos[1]));    
    }

    public void crear_paciente (Scanner sc){
        String entrada = sc.nextLine();
        String[] datos = entrada.split(" ");
        pacientes.add(new Paciente(datos[0], datos[1]));    
    }
    
//    public void pedir_cita(){

//    }

//    private void listar_paciente(){
//        for(Paciente paciente: pacientes){
//            System.out.println(pacientes.indexOf(paciente) + " "+ paciente.nombre);
//        }
//    }

    public static void main(String[] args) {
        eps sanitas = new eps();
        Scanner sc = new Scanner(System.in);
        char comando = sc.nextLine().charAt(1);

        boolean salir = false;
        do{
            System.out.println("1 crear medico");
            System.out.println("2 crear paciente");
            System.out.println("3 pedir cita paciente");
            switch (comando) {
                case '1':
                    sanitas.crear_medico(sc);
                    break;
                case '2':
                    sanitas.crear_paciente(sc);
                    break;
                case '3':
                    //sanitas.pedir_cita();
                    int n = 0;
                    break;
                case '4':
                    salir = true;
                    break;
            }
        } while(!salir);


        Medico medico = new Medico("Manuel","General");
        Paciente paciente = new Paciente("Alejandro","Cotizante");

        sanitas.medicos.add(medico);

        
        
    }
}
