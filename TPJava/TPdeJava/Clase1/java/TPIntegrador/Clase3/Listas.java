package TalentLab.Clase3;

import java.util.ArrayList;
import java.util.Arrays;

public class Listas {
    public static void main(String[] args) {
        // Listas en Java

        // String
        String nombre = "talento tech";
        nombre.charAt(0); // -- t
        nombre.charAt(1); // -- a
        nombre.charAt(2); // -- l
        int ultimoIndice = nombre.length() - 1;
        nombre.charAt(ultimoIndice); // -- h

        //En los array String se pueden cambiar los valores string del array usando
        // String[] nombre = new String[2];
        // nombre [0] = "Mario";
        // nombre [1] = "Bross";
        // solo se puede cambiar la info de los que ya estan, no se pueden agregar nuevos índices

        //Array
        String[] letrasArray = {"t", "a", "l", "e", "n", "t", "o"}; // estático, no se puede cambiar la cantidad de la lista
        String letra1 = letrasArray[0];
        String letra2 = letrasArray[1];
        String letra3 = letrasArray[2];
        int ultimoIndiceArray = letrasArray.length - 1;

        String ultimaLetra = letrasArray[ultimoIndiceArray]; // -- o

        //Array List
        ArrayList<String> letras = new ArrayList<>(); //[] se crea el objeto array list vacío
        //transformaciones para que el objeto sea compatible con el ArrayList, en este caso el String
        letras.addAll(Arrays.stream(letrasArray).toList());

        letras.get(0); // -- t distintos métodos para acceder a los elementos
        letras.get(1); // -- a
        letras.get(2); // -- l
        int ultimoIndiceList = letras.size() - 1;
        letras.get(ultimoIndiceList);

        letras.add(" ");
        letras.add("t");
        letras.add("e");

        System.out.println(letras);

        // En los array String se utiliza con , en los Array se hace con [] y en los List se hace con ()
        // En los String se utiliza la función/método .lenght, en los Array se utiliza la propiedad .lenght,
        // y en los List se utiliza el .get y la propiedad size (objeto)


    }
}
