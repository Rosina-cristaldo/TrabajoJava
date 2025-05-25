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
            System.out.println("1. Agregar Producto");
            System.out.println("2. Mostrar los productos");
            System.out.println("3. Crear Pedido");
            System.out.println("4. Mostrar Pedidos Existentes");
            System.out.println("0. Finalizar APP");
            System.out.print("Elija la opción deseada: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    scanner.nextLine(); // limpiar buffer
                    System.out.print("Nombre del producto: ");
                    String name = scanner.nextLine();
                    System.out.print("Precio: ");
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
                        System.out.print("Ingresar ID del producto para agregar (-1 para finalizar): ");
                        int productId = scanner.nextInt();
                        if (productId == -1) break;

                        Product product = productManager.findProductById(productId);
                        if (product == null) {
                            System.out.println("Producto no encontrado.");
                            continue;
                        }

                        System.out.print("Cantidad: ");
                        int quantity = scanner.nextInt();

                        if (quantity <= 0 || quantity > product.getStock()) {
                            System.out.println("Cantidad inválida o stock insuficiente");
                            continue;
                        }

                        order.addItem(product, quantity);
                        product.setStock(product.getStock() - quantity);
                        System.out.println("Producto agregado al pedido.");
                    }
                    break;

                case 4:
                    orderManager.listOrders();
                    break;

                case 0:
                    System.out.println("Gracias por usar nuestra APP! Finalizando..");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (option != 0);

        scanner.close();
    }
}
