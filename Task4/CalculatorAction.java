package Task4;

import Task1.MyException;

public class CalculatorAction {
    public static void calc1(final double a, final double b){
        System.out.println("calc1 started");
        System.out.println(a+b + " calc1 finished");
        //System.out.println("calc1 finished");
    }

    public static void calc2(final double a, final double b){
        System.out.println("calc2 started");
        System.out.println(a-b + " calc2 finished");
    }

    public static void calc3(final double a, final double b){
        System.out.println("calc3 started");
        System.out.println(a*b + " calc3 finished");
    }

    public static void calc4(final double a, final double b){
        if (b==0)  {
            throw new MyException("You can not divide by 0");
        }
        System.out.println("calc4 started");
        System.out.println(a/b + " calc4 finished");
    }
}
