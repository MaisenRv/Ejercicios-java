package eje2_POO;

import java.util.ArrayList;


public class Agenda {
    public boolean[] franjas;

    public Agenda() {
        this.franjas = new boolean[8];
    }

    public int reservar (int franja){
        if (!franjas[franja]) {
            franjas[franja] = true;
            return franja;
        }
        return -1;
    }

    public ArrayList<Integer> disponibles(){

        ArrayList <Integer> disp = new ArrayList<Integer>();
        for (int i = 0; i < franjas.length; i++) {
            if (!franjas[i]) disp.add(i);
        }
        return disp;
    }
}
