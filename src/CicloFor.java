public class CicloFor {
    public static int cicloFor1(int n){
        int suma = 0 ;
        for (int i = 0; i < n; i++) { // el i++ se puede mover dentro del ciclo
            suma += i;
            // i++ se puede poner ahi 
        }
        return suma;
    }

    public static void masVariables(){
        for (int i = 0, j =10; i <= j ; i++,j--) {// se pueden utilizar la dos variables dentro del for
            System.out.println(i);
            System.out.println(j);
        }
    }

    public static void recorerColeccion(){
        //Asi se declara una array 
        // no es dinamico
        // NO se puede agragar elementos
        // Si se pude editar
        String[] frutas = new String[]{"tomate","maracuya","guayaba"};        
        
        //Asi se recorre un arreglo con un for
        for (String f : frutas) {
            System.out.println(f);

            //para compara string mejor usar el ---> .iguals(String)
            // todos los tipos de datos que empiecen con mayuscula
            if (f.equals("guayaba")){
                break;
            }
        }



    }
    public static void main(String[] args) {
        System.out.println(cicloFor1(10));
    }
}
