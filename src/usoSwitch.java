import java.util.Scanner;

public class usoSwitch {

    public static boolean esVocalMinuscula(char ch){
        boolean vocal;
        switch(ch){
            // para los char se tienen que utilizar comillas simples
            // obligatoriamente
            // para strings van con comillas dobles
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                vocal = true;
                break;
                // con return se sale de la funcion  
            default:
                vocal = false;
                break;
        }
        return vocal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char carecter = sc.nextLine().charAt(0);

        System.out.println(esVocalMinuscula(carecter));

        sc.close();

    }
}
