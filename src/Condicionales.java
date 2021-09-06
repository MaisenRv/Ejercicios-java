import java.util.Scanner;


public class Condicionales {

    // devuelve el valor adsoluto
    public static int valorAbs(int numero){
        if (numero > 0){
            return numero;
        } else {
            return - numero;
        }
    }

    public static double maximo(double a , double b){
        if (a > b){
            return a;
        }else{
            return b;
        }
    }

    // este es el operador ternario
    // se utiliza solo en una linea
    public static double valorAdsoluto2(double x){
        double valor;

        valor = (x >= 0) ? x : -x;

        return valor;
    }

    // manejando expreciones booleanas 
    public static boolean condicional(boolean a, boolean b){
        if (a && !b){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(valorAbs(-5));

        Scanner sc = new Scanner(System.in);
    
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println(maximo(x, y));

        sc.close();
    }
}