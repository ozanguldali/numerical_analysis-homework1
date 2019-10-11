package model;

import static helper.PrinterHelper.print_Q8;
import static helper.PrinterHelper.print_Q9;
import static util.FunctionUtil.func_Q9;
import static util.FunctionUtil.gFunc_Q8;
import static util.FunctionUtil.gFunc_Q9;

public class FixedPointModel {

    public static void fixedPoint_rootError(double x_Initial, double epsilon, int iterationMax) {

        System.out.println( String.format( "\nFixed Point Iteration with x0 = %.1f:\n", x_Initial) );

        double x_Approx;

        long startTime = System.currentTimeMillis();

        int i = 1;

        while( i < iterationMax ) {

            x_Approx = gFunc_Q8( x_Initial );

            if( Math.abs( x_Approx-x_Initial ) < epsilon ){

                long endTime = System.currentTimeMillis();

                long CPUTime = endTime - startTime;

                print_Q8(x_Approx, epsilon, i, CPUTime);

                System.gc();

                break;

            }

//            System.out.println( "Iteration: Current Value = " + i + " " + x_Approx );

            i++;
            x_Initial = x_Approx;

            if( i > iterationMax ){
                System.out.println( "Method Failed after: " + iterationMax );
                System.out.println();
                System.exit( 0 );
            }

        }

    }

    public static void fixedPoint_funcError(double x_Initial, double epsilon, int iterationMax) {

        System.out.println( String.format( "\nFixed Point Iteration with x0 = %.1f:\n", x_Initial) );

        double x_Approx;

        long startTime = System.currentTimeMillis();

        int i = 1;

        while( i < iterationMax ) {

            x_Approx = gFunc_Q9( x_Initial );

            if( Math.abs( func_Q9( x_Approx ) ) <= epsilon ){

                long endTime = System.currentTimeMillis();

                double f_Approx = func_Q9( x_Approx );

                long CPUTime = endTime - startTime;

                print_Q9(f_Approx, x_Approx, i, CPUTime);

                break;

            }

//            System.out.println( "Iteration: Current Value = " + i + " " + x_Approx );

            i++;
            x_Initial = x_Approx;

            if( i > iterationMax ){
                System.out.println( "Method Failed after: " + iterationMax );
                System.out.println();
                System.exit( 0 );
            }

        }

        System.gc();


    }

}
