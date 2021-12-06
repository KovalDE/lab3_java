package Task4;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HighLevel {
    public static void main(final String[] args) {
        final ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.submit(()->CalculatorAction.calc1(5,5));
        executor.submit(()->CalculatorAction.calc2(5,5));
        executor.submit(()->CalculatorAction.calc3(5,5));


        try{
            executor.shutdown();
        } catch (final Exception e){
            executor.shutdown();
        } finally {
            executor.shutdownNow();
        }
    }

}