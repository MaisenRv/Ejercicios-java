

public class App {
    public static void main(String[] args) throws Exception {
        int i = 5;
        System.out.println(i++);
        // Tambien se puede hacer asi pero tiene
        // otro tipo de implicaciones
        System.out.println(++i);

        // elebar un numero a otro
        // esta reservado para strings

        // ------>  Float.parseFloat();

        float r = (float)Math.pow(2,4);
        System.out.println(r);

        // la f al final es para decir que es float
        float a  = 5.2342f;
        System.out.println(a);

    }
}
