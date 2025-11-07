package vp.ice3;

import java.util.List;

public class LittleGirl {
    private List<Client> clients;
    private int nextClientIndex = 0; 

    public LittleGirl(List<Client> clients) {
        this.clients = clients;
    }

    public void breadReady() {
        if (clients.isEmpty()) return;
        Client client = clients.get(nextClientIndex);
        System.out.println("Little girl delivered bread to " + client.getName());
        client.breadReady();
          // Move to the next client in order 
        nextClientIndex = (nextClientIndex + 1) % clients.size();
    }
}
