package model;

import util.FunctionUtil;

import static helper.PrinterHelper.print_Q8;
import static helper.PrinterHelper.print_Q9;
import static util.FunctionUtil.Q10.*;
import static util.FunctionUtil.Q8.gFunc;
import static util.FunctionUtil.Q9.func;

public class FixedPointModel {

    public static void fixedPointRootError(double x_Initial, double epsilon, int iterationMax) {

        System.out.println( String.format( "\nFixed Point Iteration with x0 = %.1f:\n", x_Initial) );

        double x_Approx;

        long startTime = System.currentTimeMillis();

        int i = 1;

        while( i < iterationMax ) {

            x_Approx = FunctionUtil.Q8.gFunc( x_Initial );

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

            if( i > iterationMax )
                System.out.println( "Method Failed after: " + iterationMax + " iterations.\n" );


        }

    }

    public static void fixedPointFuncError_Q9(double x_Initial, double epsilon, int iterationMax) {

        System.out.println( String.format( "\nFixed Point Iteration with x0 = %.1f:\n", x_Initial) );

        double x_Approx;

        long startTime = System.currentTimeMillis();

        int i = 1;

        while( i < iterationMax ) {

            x_Approx = FunctionUtil.Q9.gFunc( x_Initial );

            if( Math.abs( func( x_Approx ) ) <= epsilon ){

                long endTime = System.currentTimeMillis();

                double f_Approx = func( x_Approx );

                long CPUTime = endTime - startTime;

                print_Q9(f_Approx, x_Approx, i, CPUTime);

                break;

            }

//            System.out.println( "Iteration: Current Value = " + i + " " + x_Approx );

            i++;
            x_Initial = x_Approx;

            if( i > iterationMax )
                System.out.println( "Method Failed after: " + iterationMax + " iterations.\n" );

        }

        System.gc();


    }

    public static void fixedPointFuncError_Q10_1(double x_Initial, double epsilon, int iterationMax) {

        System.out.println( String.format( "\nFixed Point Iteration with x0 = %.1f:\n", x_Initial) );

        double x_Approx;

        long startTime = System.currentTimeMillis();

        int i = 1;

        while( i <= iterationMax ) {

            x_Approx = gFunc_1( x_Initial );

            if( Math.abs( func_1( x_Approx ) ) <= epsilon ){

                long endTime = System.currentTimeMillis();

                double f_Approx = func_1( x_Approx );

                long CPUTime = endTime - startTime;

                print_Q9(f_Approx, x_Approx, i, CPUTime);

                break;

            }

//            System.out.println( "Iteration: Current Value = " + i + " " + x_Approx );

            i++;
            x_Initial = x_Approx;

        }

        if( i > iterationMax )
            System.out.println( "Method Failed after: " + iterationMax + " iterations.\n" );

        System.gc();


    }

    public static void fixedPointFuncError_Q10_2(double x_Initial, double epsilon, int iterationMax) {

        System.out.println( String.format( "\nFixed Point Iteration with x0 = %.1f:\n", x_Initial) );

        double x_Approx;

        long startTime = System.currentTimeMillis();

        int i = 1;

        while( i <= iterationMax ) {

            x_Approx = FunctionUtil.Q10.gFunc_2( x_Initial );

            if( Math.abs( func_2( x_Approx ) ) <= epsilon ){

                long endTime = System.currentTimeMillis();

                double f_Approx = func_2( x_Approx );

                long CPUTime = endTime - startTime;

                print_Q9(f_Approx, x_Approx, i, CPUTime);

                break;

            }

//            System.out.println( "Iteration: Current Value = " + i + " " + x_Approx );

            i++;
            x_Initial = x_Approx;

        }

        if( i > iterationMax )
            System.out.println( "Method Failed after: " + iterationMax + " iterations.\n" );

        System.gc();


    }

    public static void fixedPointFuncError_Q10_3(double x_Initial, double epsilon, int iterationMax) {

        System.out.println( String.format( "\nFixed Point Iteration with x0 = %.1f:\n", x_Initial) );

        double x_Approx;

        long startTime = System.currentTimeMillis();

        int i = 1;

        while( i <= iterationMax ) {

            x_Approx = FunctionUtil.Q10.gFunc_3( x_Initial );

            if( Math.abs( func_3( x_Approx ) ) <= epsilon ){

                long endTime = System.currentTimeMillis();

                double f_Approx = func_3( x_Approx );

                long CPUTime = endTime - startTime;

                print_Q9(f_Approx, x_Approx, i, CPUTime);

                break;

            }

//            System.out.println( "Iteration: Current Value = " + i + " " + x_Approx );

            i++;
            x_Initial = x_Approx;

        }

        if( i > iterationMax )
            System.out.println( "Method Failed after: " + iterationMax + " iterations.\n" );

        System.gc();

    }

    public static void fixedPointFuncError_Q10_4(double x_Initial, double epsilon, int iterationMax) {

        System.out.println( String.format( "\nFixed Point Iteration with x0 = %.1f:\n", x_Initial) );

        double x_Approx;

        long startTime = System.currentTimeMillis();

        int i = 1;

        while( i <= iterationMax ) {

            x_Approx = FunctionUtil.Q10.gFunc_4( x_Initial );

            if( Math.abs( func_4( x_Approx ) ) <= epsilon ){

                long endTime = System.currentTimeMillis();

                double f_Approx = func_4( x_Approx );

                long CPUTime = endTime - startTime;

                print_Q9(f_Approx, x_Approx, i, CPUTime);

                break;

            }

//            System.out.println( "Iteration: Current Value = " + i + " " + x_Approx );

            i++;
            x_Initial = x_Approx;

        }

        if( i > iterationMax )
            System.out.println( "Method Failed after: " + iterationMax + " iterations.\n" );

        System.gc();

    }

}
