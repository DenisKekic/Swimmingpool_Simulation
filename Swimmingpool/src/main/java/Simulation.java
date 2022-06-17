import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Simulation {

    public static void main(String[] args) {
        Schwimmbad schwimmbad = new Schwimmbad(5);

        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i = 1; i <= 50; i++){
            Badegast badegast = new Badegast(schwimmbad, i);
            executorService.execute(badegast);
        }

        executorService.shutdown();
    }
}
