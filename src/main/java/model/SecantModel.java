package model;

import static helper.PrinterHelper.print_Q9;
import static util.FunctionUtil.Q9.func;

public class SecantModel {

    public static void secant(double x1, double x2, double epsilon, int iterationMax) {

        System.out.println( String.format( "\nSecant Method with x0 = %.1f and x1 = %.1f:\n", x1, x2) );

        long startTime = System.currentTimeMillis();

        double x_n = 0, x0, checkValue;

        int  i = 0;
            
        do {

            x0 = ( x1 * func( x2 ) - x2 * func( x1 ) ) / ( func( x2 ) - func( x1 ) );

            checkValue = func( x1 ) * func( x0 );

            x1 = x2;
            x2 = x0;

            i++;

            if ( checkValue == 0 )
                break;

            x_n = (x1 * func( x2 ) - x2 * func( x1 ) ) / ( func( x2 ) - func( x1 ) );

        } while ( Math.abs( func( x_n ) ) > epsilon && i <= iterationMax );

        long endTime = System.currentTimeMillis();

        double valueApproximate = func( x_n );

        long CPUTime = endTime - startTime;

        print_Q9( valueApproximate, x_n, i, CPUTime );

        System.gc();
    }
    
}
