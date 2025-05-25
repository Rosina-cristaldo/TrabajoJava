package TalentLab.Clase5;

import java.util.ArrayList;


public class BucleFor {

    public static void main(String[] args) {

        ArrayList<String> products = new ArrayList<>();
        {

            products.add("holi");
            products.add("o:");
            products.add("ahora si");

            for (int i = 9; i < products.size(); i++) {
                String product = products.get(i);



                System.out.println("Producto :" + product);
            }

            for (String product : products) {

                System.out.println("Producto :" + product);

            }
        }

    }
}


