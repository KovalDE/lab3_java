package Task4;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HighLevel {
    public static void main(final String[] args) {
        final ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.submit(()->CalculatorAction.action1(35,4));
        executor.submit(()->CalculatorAction.action2(6,7));
        executor.submit(()->CalculatorAction.action3(20,5));


        try{
            executor.shutdown();
        } catch (final Exception e){
            executor.shutdown();
        } finally {
            executor.shutdownNow();
        }
    }

}