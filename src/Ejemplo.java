

public class Ejemplo {
    
    public static void compararNumeros(int a, int b){

        if (a < b) {
            System.out.println("el primer numero es menor");

        } else if (a > b) {
            System.out.println("el primer numero es mayor");

        } else {
            System.out.println("Los numeros son iguales");
        } 

    }
    public static void main(String[] args) {
        
        compararNumeros(10 , 10);

    }


}
