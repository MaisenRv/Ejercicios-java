//import java.util.Scanner;


public class Ciclos{
    public static void ciclosWhile(int i){
        while (i <= 6) {
            System.out.println(i);
            i++;
        }
    }

    public static void cicloDoWhile(int i){
        // el ciclo se cumple minimo una ves
        do{
            System.out.println(i);
            i++;
        }while(i<= 10);
        // el break sugue funcionando
        
        //-----> continue <------
        //reinicia el ciclo desde la condicion
        // la actualizacion sigue donde se quedo  
    }

    
    public static void main(String[] args) {


    }
}