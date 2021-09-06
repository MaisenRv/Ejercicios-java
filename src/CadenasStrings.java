import java.util.Scanner;

public class CadenasStrings {
    public static void main(String[] args) {
        //Un solo caracter se  le pone una comilla simple
        char a = 'a';

        //----> carateres espaciales \n mismos que python

        //NO se puede modificar
        String cadena = "hola";
        String b  = "HOLA";
        //Para solo imprimir un solo carecter de la cadena
        System.out.println(cadena.charAt(2));
        
        //permite modificar strings
        //le cuesta mas en riempo de ejecucion
        // ----> StringBuffer

        //-->para comparar cadenas es  con el .equals<---
        System.out.println(b.equals(cadena));
        //Ignora el case de las cadenas
        System.out.println(b.compareToIgnoreCase(cadena));


        String c = "hola";
        String cadena2 = "hola mundo";
        // igual que b in cadena en python
        // mira si esta el hola en el hola mundo
        if (cadena2.contains(c)) {
            System.out.println("si esta");
        }

        //toLowerCase minusculas

        String s = "Programar es genial";
        // escribe de la posicion 8 hasta el final del string
        //en python ---> s[8:]
        System.out.println(s.substring(8,s.length()));

        // Me hace un array separendo por espacios
        String[] datos = s.split(" ");
        System.out.println(datos[0]);

        System.out.println(a);
        Scanner sc = new Scanner(System.in);
        

        
        sc.close();

    }
}
