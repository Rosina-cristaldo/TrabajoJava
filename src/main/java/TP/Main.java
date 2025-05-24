package TP;

import TP.db.InMemoryDB;
import TP.model.Order;
import TP.model.Product;
import TP.service.OrderManager;
import TP.service.ProductManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InMemoryDB db = new InMemoryDB();
        ProductManager productManager = db.getProductManager();
        OrderManager orderManager = db.getOrderManager();

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Add Product");
            System.out.println("2. List Products");
            System.out.println("3. Create Order");
            System.out.println("4. List Orders");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    scanner.nextLine(); // clear buffer
                    System.out.print("Product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Stock: ");
                    int stock = scanner.nextInt();
                    productManager.addProduct(name, price, stock);
                    break;

                case 2:
                    productManager.listProducts();
                    break;

                case 3:
                    Order order = orderManager.createOrder();
                    while (true) {
                        productManager.listProducts();
                        System.out.print("Enter product ID to add (-1 to finish): ");
                        int productId = scanner.nextInt();
                        if (productId == -1) break;

                        Product product = productManager.findProductById(productId);
                        if (product == null) {
                            System.out.println("Product not found.");
                            continue;
                        }

                        System.out.print("Quantity: ");
                        int quantity = scanner.nextInt();

                        if (quantity <= 0 || quantity > product.getStock()) {
                            System.out.println("Invalid quantity or not enough stock.");
                            continue;
                        }

                        order.addItem(product, quantity);
                        product.setStock(product.getStock() - quantity);
                        System.out.println("Product added to order.");
                    }
                    break;

                case 4:
                    orderManager.listOrders();
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (option != 0);

        scanner.close();
    }
}
