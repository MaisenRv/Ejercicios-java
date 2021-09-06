package POO;

// la clase principal tiene el metodo main
public class Objetos {
    //static permite usar el objeto sin instanciar el objeto de la clase
    // el elemento que tiene static se puede usar sin crear el objeto


    // final modificador de sellamiento
    //constante no se puede modificar
    //
    public static final double vel_maxima = 50;


    public static void main(String[] args) {
        
        // instanciar una clase 
        ClasePerro mascota = new ClasePerro("jose",4,"cafe");
        ClasePerro mascota2 = new ClasePerro("carlos",5,"rojo");
        // llamando metodos desde el  metodo main
        mascota.ladrar();
        mascota.getInfo();

        // metodo que resive como parametro otro objeto
        mascota.quienEsMayorQueYo(mascota2);
        
    }
}
