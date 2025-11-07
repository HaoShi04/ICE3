package vp.ice3;
import java.util.Random;
public class Client {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public void breadReady() {
        System.out.println(name + " received their bread.");
    }

    public String getName() {
        return name;
    }

	
	

}