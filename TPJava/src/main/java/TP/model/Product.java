package TP.model;

public class Product {
    private static int idCounter = 1;

    private int id;
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.id = idCounter++;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s | Price: %.2f | Stock: %d", id, name, price, stock);
    }
}


