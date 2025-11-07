/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vp.ice3;

/**
 *
 * @author samuraishizuka
 */
import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class ICE3 {

     public static void main(String[] args) {
        Client peter = new Client("Peter");
        Client paula = new Client("Paula");
        Client eva = new Client("Eva");
        Client anna = new Client("Anna");
        Client ben = new Client("Ben");

        List<Client> clients = Arrays.asList(peter, paula, eva, anna, ben);
        
        LittleGirl girl = new LittleGirl(clients);
       
        Bakery bakery = new Bakery(girl);
        bakery.start();
    }
}
