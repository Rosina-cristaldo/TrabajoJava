package TalentLab.Clase5;

import TalentLab.Clase4.Product;

import java.util.ArrayList;

public class Order {
    private ArrayList<Product> products;

    public Order(){
        products = new ArrayList<>();

    }

    public void addProducts(Product product){

        this.products.add(product);
    }

    public double calculatedTotalOrder (){
        double total = 0;
        for(Product product : this.products){
            total += product.getPrice();

        }

        return total;

    }

}
