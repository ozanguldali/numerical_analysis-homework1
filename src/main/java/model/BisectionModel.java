package model;

import static helper.PrinterHelper.print_Q9;
import static util.FunctionUtil.func_Q9;

public class BisectionModel {

    public static void bisection(double a, double b, double epsilon) {

        System.out.println( String.format( "\nBisection Method with a = %.1f and b = %.1f:\n", a, b ) );

        long startTime = System.currentTimeMillis();

        int i = 1;

        if ( func_Q9( a ) * func_Q9( b ) >= 0) {

            System.out.println("You have not assumed right a and b");
            return;

        }

        double c = a;

        while ( Math.abs( func_Q9( c ) ) > epsilon ) {

            c = ( a + b ) / 2;

            i++;

            if ( func_Q9( c ) == 0.0 )
                break;

            else if ( func_Q9( c ) * func_Q9( a ) < 0)
                b = c;

            else
                a = c;

        }

        long endTime = System.currentTimeMillis();

        double valueApproximate = func_Q9( c );

        long CPUTime = endTime - startTime;

        print_Q9( valueApproximate, c, i, CPUTime );

        System.gc();

    }

}
