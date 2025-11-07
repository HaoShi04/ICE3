package vp.ice3;
import java.util.Random;
public class Bakery extends Thread  {
    private LittleGirl girl;
    private Random random = new Random();

    public Bakery(LittleGirl girl) {
        this.girl = girl;
    }

    @Override
    public void run() {
        while (true) {
            try {
      
                int time = 1000 + random.nextInt(9000);
                Thread.sleep(time);
                System.out.println("Bread is ready!");
                girl.breadReady();
            } catch (InterruptedException e) {
                System.out.println("Bakery interrupted.");
            }
        }
    }
    
    
}