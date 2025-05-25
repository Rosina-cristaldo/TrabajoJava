package TP.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int idCounter = 1;

    private int id;
    private List<OrderItem> items;

    public Order() {
        this.id = idCounter++;
        this.items = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void addItem(Product product, int quantity) {
        items.add(new OrderItem(product, quantity));
    }

    public double getTotal() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void showDetails() {
        System.out.println("Pedido ID# " + id);
        for (OrderItem item : items) {
            System.out.println("  " + item);
        }
        System.out.printf("Total: %.2f%n", getTotal());
    }
}
