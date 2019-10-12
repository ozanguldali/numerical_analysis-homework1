package model;

import static helper.PrinterHelper.print_Q9;
import static util.FunctionUtil.derivative_func_Q9;
import static util.FunctionUtil.func_Q9;

public class AitkensDeltaSquaredModel {

    public static void aitkensDeltaSquared(double x0, double epsilon, int iterationMax) {

        System.out.println( String.format( "\nAitken's Delta-Squared Process via Newton Raphson's Results with x0 = %.1f:\n", x0 ) );

        long startTime = System.currentTimeMillis();

        int i = 1;

        double x = x0;

        while ( Math.abs( func_Q9( x ) ) > epsilon && i <= iterationMax ) {

            double x1 = x - func_Q9( x ) / derivative_func_Q9( x );
            double x2 = x1 - func_Q9( x1 ) / derivative_func_Q9( x1 );

            x = x - ( x1 - x ) / ( x2 - 2 * x1 - x );

            i++;

        }

        if ( i > iterationMax )
            System.out.println( "Method Failed after: \n" + iterationMax );

        else {

            long endTime = System.currentTimeMillis();

            double valueApproximate = func_Q9( x );

            long CPUTime = endTime - startTime;

            print_Q9( valueApproximate, x, i, CPUTime );

        }

        System.gc();

    }

}
