package TalentLab.Clase3;

import java.util.Arrays;

public class GrupoDeDatos {
    public static void main(String[] args) {
        String textoEjemplo = "mensaje en formato String 123";

        System.out.println(textoEjemplo);

        //con el primer método se llama a mayus el índice 0 del String, en este caso R
        //luego, con el método.subString y con índice 1, se llama al resto de la palabra
        //imprime la nueva var String nombre, es decir, se asigna un nuevo valor al array,
        // no se reemplaza el original, se le da un nuevo valor
        String nombre = "rosina";
        String apellido = "cristaldo";
        String nombreCompleto = nombre + " " + apellido;
        // nombreCompleto.lenght;
        nombre = nombre.toUpperCase().charAt(0) + nombre.substring(1);
        apellido = apellido.toUpperCase().charAt(0) + apellido.substring(1);

        System.out.println(nombre+ " " + apellido);
        String[] palabras = nombreCompleto.split(" ");

        System.out.println(Arrays.toString(palabras));


        String url = "http://www.youtube.com/watch?v=FmvPl6UaqRc&list=PL03ueGbdtz3QvP88JcZmLHapXH08FxWm_&index=4";
        String[] partesUrl = url.split("/");
        String recursoFinalUrl = partesUrl[partesUrl.length - 1]; //empieza el índice desde 0 (porque el 0 es -1)

        System.out.println(recursoFinalUrl);


    }
}
