import dao.ClientDAO;
import models.Client;

public class Main {
    public static void main(String[] args) {
        ClientDAO dao = new ClientDAO();
        Client client1 = new Client("Nelson Lacayo", "nplacayo@uamv.edu.ni","74423431","8/10/24");
        dao.save(client1);

    }
}
