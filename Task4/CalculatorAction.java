package Task4;

import Task1.MyException;

public class CalculatorAction {
    public static void calc1(final double a, final double b){
        System.out.println("calc1 started");
        System.out.println(a+b + " calc1 finished");
    }

    public static void calc2(final double a, final double b){
        System.out.println("calc2 started");
        System.out.println(a-b + " calc2 finished");
    }

    public static void calc3(final double a, final double b){
        System.out.println("calc3 started");
        System.out.println(a*b + " calc3 finished");
    }

}
