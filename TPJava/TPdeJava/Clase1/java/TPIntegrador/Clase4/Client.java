package TalentLab.Clase4;

public class Client {
    String name;
    String email;

    //Constructores
    public Client(String name, String email) {

        this.name = name;
        this.email = email;


    }

        void showData() {

            System.out.printf("El cliente %3 tiene registrado como email la siguiente dirección: %3 ", this.name, this.email);

        }

        Client client1 = new Client("Juan", "juan@gmail.com");
        Client client2 = new Client("Rosi", "rosi@gmail.com");
        Client client3 = new Client("Pato", "pato@gmail.com");
    }

