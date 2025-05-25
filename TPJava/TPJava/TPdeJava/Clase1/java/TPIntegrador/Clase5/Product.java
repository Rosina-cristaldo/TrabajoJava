package TalentLab.Clase5;

public class Product {

    private static int idSiguiente = 0;
     int id;
    private String name;
    private double price;

    //constructores
    public Product(){
        this.id = Product.idSiguiente;
        Product.idSiguiente++;

    }


    //getters
    // get + "nombreAtributo"
    public String getName(){
        return this.name;

    }
    //setters
    // set + "nombreAtributo"
    //por convencion, se usa un nombre que pueda ser facilmente identificado el metodo, en este caso, sabemos que con el
    //setName claramente seteamos el nombre
    public void setName(String name){
        this.name = name;

    }

    public double getPrice(){
        return this.price;
    }

}
