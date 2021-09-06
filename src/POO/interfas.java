package POO;

// la interfaz puede heredar de otra interfaz
public interface interfas {
    // son constantes si o si
    int MAX = 0;
    int MIN = 0;

    // solo se pone la deficion de los metodos
    // se asume que son adstractos
    public void sonido();

    //default es para definir la funcion
    // esta funcion no es necesario implemetarla en la clase
    public default void dormir(){
        System.out.println("ZZZZZZZ");
    }
    public void alimentarse();


    
}