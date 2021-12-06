package Task4;

public class LowLevel {
        public static void main(final String[] args) {

            final SimpleThread1 simpleThread1 = new SimpleThread1();
            final SimpleThread2 simpleThread2 = new SimpleThread2();
            final SimpleThread3 simpleThread3 = new SimpleThread3();
            final SimpleThread4 simpleThread4 = new SimpleThread4();


            simpleThread1.start();
            simpleThread2.start();
            simpleThread3.start();
            simpleThread4.start();
        }
        public static class SimpleThread1 extends Thread{
            @Override
            public void run() {
                CalculatorAction.calc1(5,5);
            }
        }
        public static class SimpleThread2 extends Thread{
            @Override
            public void run() {
                CalculatorAction.calc2(18,8);
            }
        }
        public static class SimpleThread3 extends Thread{
            @Override
            public void run() {
                CalculatorAction.calc3(2,5);
            }
        }
    public static class SimpleThread4 extends Thread{
        @Override
        public void run() {
            CalculatorAction.calc4(20,20);
        }
    }
    }

