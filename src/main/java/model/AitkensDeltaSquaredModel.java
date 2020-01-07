package model;

import static helper.PrinterHelper.print_Q9;
import static helper.TimeHelper.getDate;
import static util.FunctionUtil.Q9.derivativeFunc;
import static util.FunctionUtil.Q9.func;

public class AitkensDeltaSquaredModel {

    public static void aitkensDeltaSquared(double x0, double epsilon, int iterationMax) {

        System.out.println( String.format( "\nAitken's Delta-Squared Process via Newton Raphson's Results with x0 = %.1f:\n", x0 ) );

//        long startTime = System.currentTimeMillis();
        long startTime = getDate();

        int i = 1;

        double x = x0;

        System.out.println( (i-1) + " th step: " + x );

        while ( Math.abs( func( x ) ) > epsilon && i <= iterationMax ) {

            double x1 = x - func( x ) / derivativeFunc( x );
            double x2 = x1 - func( x1 ) / derivativeFunc( x1 );

            x = x - ( ( x1 - x ) * ( x1 - x ) ) / ( x2 - 2 * x1 + x );

            System.out.println( (i) + " th step: " + x );

            i++;

        }

        if ( i > iterationMax )
            System.out.println( "Method Failed after: " + iterationMax + " iterations.\n" );

        else {

//            long endTime = System.currentTimeMillis();
            long endTime = getDate();

            double valueApproximate = func( x );

            long CPUTime = endTime - startTime;

            print_Q9( valueApproximate, x, i, CPUTime );

        }

        System.gc();

    }

}
