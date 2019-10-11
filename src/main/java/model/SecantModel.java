package model;

import static helper.PrinterHelper.print_Q9;
import static util.FunctionUtil.func_Q9;

public class SecantModel {

    public static void secant(double x1, double x2, double epsilon) {

        System.out.println( String.format( "\nSecant Method with x0 = %.1f and x1 = %.1f:\n", x1, x2) );

        long startTime = System.currentTimeMillis();

        double x_n = 0, x0, checkValue;

        int  i = 1;
            
        do {

            x0 = ( x1 * func_Q9( x2 ) - x2 * func_Q9( x1 ) ) / ( func_Q9( x2 ) - func_Q9( x1 ) );

            checkValue = func_Q9( x1 ) * func_Q9( x0 );

            x1 = x2;
            x2 = x0;

            i++;

            if ( checkValue == 0 )
                break;

            x_n = (x1 * func_Q9( x2 ) - x2 * func_Q9( x1 ) ) / ( func_Q9( x2 ) - func_Q9( x1 ) );

        } while ( Math.abs( func_Q9( x_n ) ) > epsilon );

        long endTime = System.currentTimeMillis();

        double valueApproximate = func_Q9( x_n );

        long CPUTime = endTime - startTime;

        print_Q9( valueApproximate, x_n, i, CPUTime );

        System.gc();
    }
    
}
