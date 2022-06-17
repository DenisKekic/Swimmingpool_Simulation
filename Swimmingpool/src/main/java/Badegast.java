import java.util.Random;

public class Badegast implements Runnable{

    private boolean istEingetreten = false;
    private Schwimmbad schwimmbad;
    private int id;

    public Badegast(Schwimmbad schwimmbad, int id) {
        //this.istEingetreten = istEingetreten;
        this.schwimmbad = schwimmbad;
        this.id = id;
    }

    @Override
    public void run() {
        while(!Thread.interrupted() && istEingetreten == false){
            if(schwimmbad.betreten(id) == true){
                istEingetreten = true;
            }
        }
        Random random = new Random();
        try {
            Thread.sleep(random.nextInt(100,1000));
            schwimmbad.verlassen(id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
