package POO;

//------------NOTAS-------------
//adstrac dice que no seba a instaciar la clase - se define un metodo sin funcion
// la clase tiene que tener adstrac si hay un metodo adstrac dentro de esta

// --- > extends para la herencia
// super es para llamar el constructor de la clase padre
//  el super tiene que estar en la primera linea 
//-------------------------------

//nombres de clases la primera en mayuscula
// asi se usa una interfaz
public class ClasePerro implements interfas{// tengo que definir esas funciones de la interfaz
    //------------------------ATRIBUTOS--------------------
    // mejor que sean private (modificador de acceeso)

    // protected clase y paquete
    // private solo la clasePerro pueden ver este atribruto
    // public lo pueder ver todo el mundo

    // --> se usa camelCase
    // en herencia solo se hereda los atributos protegidos y publicos
    private String nombre;
    private int edad;
    private String colorOjos;


    //-------------------CONSTRUTOR--------------------
    // tiene que ser el mismo nombre de la clase
    // se llama para inicializar un objeto
    public ClasePerro(String nombre, int edad, String colorOjos){
        this.nombre = nombre;
        this.edad = edad;
        this.colorOjos = colorOjos;
    }

    // POLIFORMISMO
    //son metodos que tienen varias formas
    // ahi dos constructores 
    // este es poliformismo estatico
    public ClasePerro(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }


    //--------------------------METODOS------------------------

    public void getInfo(){
        System.out.println(this.nombre);
        System.out.println(this.edad);
        System.out.println(this.colorOjos);
    }

        //Metodo que por parametro se le pasa otro objeto 
    public void quienEsMayorQueYo(ClasePerro otroPerro){
        
        if(this.edad > otroPerro.edad){
            System.out.println("yo soy mayor");
        }else  if (this.edad == otroPerro.edad){
            System.out.println("Tenemos la misma edad");
        }else{
            System.out.println("El es mayor");
        }
    }

    // getters y setters 
    public int getEdad(){
        return edad;
    }

    public void setEdad (int edad){
        this.edad = edad;
    }

    public void ladrar() {
        System.out.println("Guau Guau");
    }


    // Asi se redefine un metodo ya creado
    @Override // <--------------o POLIFORMISMO dinamico
    public String toString(){
        return nombre + edad;
    }
    
    @Override
    public void sonido(){
        System.out.println("sonido");
    }

    @Override
    public void alimentarse(){
        System.out.println("alimentarse");
    }
}