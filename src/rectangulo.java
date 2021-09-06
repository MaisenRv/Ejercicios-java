import java.util.Scanner;


public class rectangulo {

    public static void area_rectangulo(double ancho, double alto){
        double area = ancho * alto;
        System.out.println(area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double ancho = sc.nextDouble();
        double alto = sc.nextDouble();
        area_rectangulo(ancho, alto);

        sc.close();
    }
}
