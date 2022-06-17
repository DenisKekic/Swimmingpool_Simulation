public class Schwimmbad {
    private int maxLiegen;
    private int besetzteLiegen = 0;

    public Schwimmbad(int maxLiegen) {
        this.maxLiegen = maxLiegen;
        //this.besetzteLiegen = 0;
    }

    public synchronized boolean betreten (int id){
        if(besetzteLiegen < maxLiegen){
            besetzteLiegen++;
            System.out.println("Der Badegast: " + id + " hat das Schwimmbad betreten.");
            return true;
        }
        else{
            return false;
        }
    }

    public synchronized void verlassen(int id){
        System.out.println("Der Badegast: " + id + " hat das Schwimmbad verlassen.");
        besetzteLiegen--;
    }
}
