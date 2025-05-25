package TP;

public class Product {

        int id;
        String name;
        double price;
        int stock;
        double discount;
        int cantidad;

        public Product(){};

    public void refreshPrice(double price) {
        if (price >= 1 && price <= 10000) {
            this.price = price;
        } else {
            System.out.println("ERROR");
        }
    }

        void print () {
            System.out.println("******************************");
            System.out.println("* Nombre: " + this.name);
            System.out.println("* Precio: " + this.price);
            System.out.println("* Stock: " + this.stock);
            System.out.println("******************************");
        }

        void printName () {
            System.out.println("Producto: " + this.name);
        }

        void addDiscount ( double discount){
            this.discount = discount;
        }

        void agregarCantidad ( int cantidad){
            this.cantidad += cantidad;
        }

        boolean matchNameProduct (String search){
            return this.name.contains(search);
        }

        public double calculatedTotalPrice () {
            double basePrice = this.price * this.cantidad;
            // se busca obtener un numero entre 0 y 1;
            double discount = 1 - (this.discount / 100);
            return basePrice * discount;


        }
        public double getPrice() {
            return this.price;
        }
    }

