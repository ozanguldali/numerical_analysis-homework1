package model;

import static helper.PrinterHelper.print_Q9;
import static util.FunctionUtil.derivative_func_Q9;
import static util.FunctionUtil.func_Q9;

public class NewtonRaphsonModel {

    public static void newtonRaphson(double x, double epsilon, int iterationMax) {

        System.out.println( String.format( "\nNewton Raphson Method with x0 = %.1f:\n", x ) );

        long startTime = System.currentTimeMillis();

        int i = 1;

        while (Math.abs( func_Q9( x ) ) > epsilon && i <= iterationMax ) {

            x = x - func_Q9(x) / derivative_func_Q9(x);

            i++;

        }

        long endTime = System.currentTimeMillis();

        double valueApproximate = func_Q9( x );

        long CPUTime = endTime - startTime;

        print_Q9( valueApproximate, x, i, CPUTime );

        System.gc();

    }

}
