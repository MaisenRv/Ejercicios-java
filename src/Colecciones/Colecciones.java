package Colecciones;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Colecciones {
    public static void main(String[] args) {
        
          //ArrayList
        //El accceso de los elemetos es rapido
        List<Integer> lista = new ArrayList<>();

        //añade un elemento a la lista
        lista.add(3);
        lista.add(5);
        // meuestra la pocicion del 5
        //System.out.println(lista.indexOf(0));
        // Muestra si el 5 esta en la lista
        lista.contains(5);
        //Elimina el numero 5 de la lista
        lista.remove(1); //new Intefer(2); coje el elemento
        //remplaza el elemento
        lista.set(1, 6);


        //LinkedList
        //la eleminacion es mas eficiente
        //el acceso a los elemetos del medio es mas complicado
        LinkedList<Integer> lista2 = new LinkedList<>();

        //addFirst
        lista2.addFirst(2);
        //addLast
        lista2.addLast(4);
        //devueleve el primero
        lista2.getFirst();
        //remueve el primero
        lista2.removeFirst();


        //Vector
        //permite almasenar elementos de diferentes tipos
        //es mas lenta para todas las operaciones menos para agragar elemetos
        Vector vector = new Vector();

        vector.add("hola");
        vector.add(23232);
        vector.add(12.43);


        //interfaz Map DICCIONARIO
        //entrySet()
        //keySet()
        //values()
        //isEmpty()
        //size()
        //containsKey()
        //containsValue()
        //put()
        // recorrerlo le cuesta, consultarlo es mas eficiente
        Map <Integer,String> dic = new HashMap<>();

        dic.put(1, "hola");
        //borra todos los elemtos
        dic.clear();


    }   
}
