package TalentLab.Clase4;

import java.util.ArrayList;

public class Product {
    //descripción, atributos
    String name;
    private double price;
    int stock;

    int cantidad;

    double discount;

    public Product(){}

    public Product(String nameProduct, double price) {
        this.name = nameProduct;
        this.price = price;
        this.stock = 20;
        this.cantidad = 1;
        this.discount = 0;
    }

    public void refreshPrice(double price){
        if (price >= 1 && price <= 10000){
            this.price = price;
        }else{
            System.out.println("ERROR");
        }
    }
    void print(){
        System.out.println("******************************");
        System.out.println("* Nombre: " + this.name);
        System.out.println("* Precio: " + this.price);
        System.out.println("* Stock: " + this.stock);
        System.out.println("******************************");
    }

    void printName(){System.out.println("Producto: " + this.name);}

    void addDiscount(double discount){
        this.discount = discount;
    }

    void agregarCantidad(int cantidad){this.cantidad += cantidad;}

    boolean matchNameProduct(String search){return this.name.contains(search);}

    public double calculatedTotalPrice(){
        double basePrice = this.price * this.cantidad;
        // se busca obtener un numero entre 0 y 1;
        double discount = 1 - (this.discount / 100);
        return basePrice * discount;
    }

    String nameCapitalize(){
        String textoMinuscula = name.toLowerCase();
        String textoSinEspacios = textoMinuscula.trim();
        // dividimos en palabras el texto
        String[] palabras = textoSinEspacios.split(" ");
        String resultado = "";

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];

            resultado += palabra.toUpperCase().charAt(0) + palabra.substring(1) + " ";
        }

        return resultado;
    }

    public double getPrice() {
        return this.price;
    }
}
