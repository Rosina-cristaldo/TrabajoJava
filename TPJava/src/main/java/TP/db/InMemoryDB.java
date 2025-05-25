package TP.db;

import TP.service.ProductManager;
import TP.service.OrderManager;

public class InMemoryDB {
    private ProductManager productManager;
    private OrderManager orderManager;

    public InMemoryDB() {
        productManager = new ProductManager();
        orderManager = new OrderManager();
    }

    public ProductManager getProductManager() {
        return productManager;
    }

    public OrderManager getOrderManager() {
        return orderManager;
    }
}
