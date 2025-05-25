package TP.service;

import TP.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order> orders = new ArrayList<>();

    public Order createOrder() {
        Order order = new Order();
        orders.add(order);
        return order;
    }

    public void listOrders() {
        if (orders.isEmpty()) {
            System.out.println("No se encontraron pedidos.");
            return;
        }

        for (Order order : orders) {
            order.showDetails();
            System.out.println();
        }
    }
}
