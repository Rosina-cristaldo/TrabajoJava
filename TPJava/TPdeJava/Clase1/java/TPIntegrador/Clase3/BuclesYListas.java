package TalentLab.Clase3;

import java.util.ArrayList;
import java.util.Arrays;

public class BuclesYListas {
    public static void main(String[] args) {
        String nombre = "talento tech";

        String[] letrasArray = {"t", "a", "l", "e", "n", "t", "o"};

        ArrayList<String> letras = new ArrayList<>();
        letras.addAll(Arrays.stream(letrasArray).toList());

        letras.add(" ");
        letras.add("t");
        letras.add("e");

        // bucle para String
        /* for (int i = 0; i < nombre.length(); i++){
            char caracter = nombre.charAt(i);
            System.out.println(caracter);
        }*/

        // bucle de Array
        /* for (int i = 0; i < letrasArray.length; i++){
            String caracter = letrasArray(i);
            System.out.println(caracter);
        }
        */

        // bucle de List
        for (int i = 0; i < letras.size() ; i++){
            String letra = letras.get(i);
            System.out.println(letra);
        }




    }

}
