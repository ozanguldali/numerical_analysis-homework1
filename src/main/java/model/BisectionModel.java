package model;

import static helper.PrinterHelper.print_Q9;
import static helper.ReportHelper.globalResultMap;
import static helper.ReportHelper.setGlobalResultMap;
import static helper.TimeHelper.getDate;
import static util.FunctionUtil.Q9.func;

public class BisectionModel {

    public static void bisection(double a, double b, double epsilon, int iterationMax) {

        System.out.println( String.format( "\nBisection Method with a = %.1f and b = %.1f:\n", a, b ) );

//        long startTime = System.currentTimeMillis();
        long startTime = getDate();

        int i = 1;

        if ( func( a ) * func( b ) >= 0) {

            System.out.println("You have not assumed right a and b");
            return;

        }

        double c = a;

        while ( Math.abs( func( c ) ) > epsilon ) {

            c = ( a + b ) / 2;

            i++;

            if ( func( c ) == 0.0 )
                break;

            else if ( func( c ) * func( a ) < 0)
                b = c;

            else
                a = c;

        }

        if ( i > iterationMax )
            System.out.println( "Method Failed after: " + iterationMax + " iterations.\n" );

        else {

//            long endTime = System.currentTimeMillis();
            long endTime = getDate();

            double valueApproximate = func( c );

            long CPUTime = endTime - startTime;

            print_Q9( valueApproximate, c, i, CPUTime );

        }

        System.gc();

    }

}
