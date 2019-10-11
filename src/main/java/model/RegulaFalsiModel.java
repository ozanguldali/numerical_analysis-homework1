package model;

import static helper.PrinterHelper.print_Q9;
import static util.FunctionUtil.func_Q9;

public class RegulaFalsiModel {

    public static void regulaFalsi(double x0, double x1, double epsilon, int iterationMax) {

        System.out.println( String.format( "\nBisection Method with x0 = %.1f and x1 = %.1f:\n", x0, x1 ) );

        int i = 1;
        double f0, f1, f2;
        double x2;

        long startTime = System.currentTimeMillis();

        do {

            f0 = func_Q9( x0 );
            f1 = func_Q9( x1 );
            
            x2 = x1 - f1 * ( x0 - x1 ) / ( f0 - f1 );
            
            f2 = func_Q9( x2 );

            if ( ( f2 > 0 && f0 < 0 ) || ( f2 < 0 && f0 > 0 ) )
                x1 = x2;

            else
                x0 = x2;
            
            i++;

        } while ( Math.abs( f2 ) > epsilon && i <= iterationMax );


        long endTime = System.currentTimeMillis();
        
        long CPUTime = endTime - startTime;

        print_Q9( f2, x2, i, CPUTime );

        System.gc();
        
    }

}
