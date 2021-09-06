import java.util.Scanner;



public class ArreglosMatrices {

    public static int[] leerArreglo(int n){
        int[] x = new int[n];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
        }
        sc.close();
        return x;


    }

    public static int sumaArreglo(int[]x){
        int s = 0;
        for (int i = 0; i < x.length; i++) {
            s +=x[i];
        }
        return s;


    }
    public static void main(String[] args) {
        // Arrays.sort(arraglo) ordena el arreglo de forma acendente
    }
}
