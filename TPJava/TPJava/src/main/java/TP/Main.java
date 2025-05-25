package TP;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            ArrayList<Product> cart = obtenerProductos();

            calcularTotalProductos(cart);
            //busqueda de productos
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese el nombre del producto");
            String search = entrada.nextLine();

            ArrayList<Product> matchProduct = new ArrayList<>();
            for (Product product : cart) {
                if (product.matchNameProduct(search)) {
                    matchProduct.add(product);
                }
            }
            if (matchProduct.isEmpty()) {
                System.out.printf("No encontramos productos que coincidan con <%s>", search);
            } else {
                System.out.println("PRODUCTOS ENCONTRADOS: ");
                for (Product product : matchProduct) {
                    product.print();
                }
            }

        }
        public static ArrayList<Product> obtenerProductos() {
            ArrayList<Product> cart = new ArrayList<>();



            return cart;
        }

        public static void calcularTotalProductos(ArrayList<Product> cart){
            double totalCost = 0;
            for (Product product : cart) {
                product.print();
                totalCost += product.calculatedTotalPrice();
            }
            System.out.println("Costo total del carrito: " + totalCost);
        }

    }
