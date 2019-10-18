package model;

import static helper.PrinterHelper.print_Q9;
import static helper.TimeHelper.getDate;
import static util.FunctionUtil.Q10.*;
import static util.FunctionUtil.Q9.derivativeFunc;
import static util.FunctionUtil.Q9.func;

public class NewtonRaphsonModel {

    public static void newtonRaphson_Q9(double x, double epsilon, int iterationMax) {

        System.out.println( String.format( "\nNewton Raphson Method with x0 = %.1f:\n", x ) );

//        long startTime = System.currentTimeMillis();
        long startTime = getDate();

        int i = 1;

        while ( Math.abs( func( x ) ) > epsilon && i <= iterationMax ) {

            x = x - func( x ) / derivativeFunc( x );

            i++;

        }

        // long endTime = System.currentTimeMillis();
        long endTime = getDate();

        double valueApproximate = func( x );

        long CPUTime = endTime - startTime;

        print_Q9( valueApproximate, x, i, CPUTime );

        System.gc();

    }

    public static void newtonRaphson_Q10_1(double x, double epsilon, int iterationMax) {

        System.out.println( String.format( "\nNewton Raphson Method with x0 = %.1f:\n", x ) );

//        long startTime = System.currentTimeMillis();
        long startTime = getDate();

        int i = 1;

        while ( Math.abs( func_1( x ) ) > epsilon && i <= iterationMax ) {

            x = x - func_1( x ) / derivativeFunc_1( x );

            i++;

        }

        if( i > iterationMax )
            System.out.println( "Method Failed after: " + iterationMax + " iterations.\n" );

        else {

//            long endTime = System.currentTimeMillis();
            long endTime = getDate();

            double valueApproximate = func_1( x );

            long CPUTime = endTime - startTime;

            print_Q9( valueApproximate, x, i, CPUTime );

        }

        System.gc();

    }

    public static void newtonRaphson_Q10_2(double x, double epsilon, int iterationMax) {

        System.out.println( String.format( "\nNewton Raphson Method with x0 = %.1f:\n", x ) );

//        long startTime = System.currentTimeMillis();
        long startTime = getDate();

        int i = 1;

        while ( Math.abs( func_2( x ) ) > epsilon && i <= iterationMax ) {

            x = x - func_2( x ) / derivativeFunc_2( x );

            i++;

        }

        if( i > iterationMax )
            System.out.println( "Method Failed after: " + iterationMax + " iterations.\n" );

        else {

//            long endTime = System.currentTimeMillis();
            long endTime = getDate();

            double valueApproximate = func_2( x );

            long CPUTime = endTime - startTime;

            print_Q9( valueApproximate, x, i, CPUTime );

        }

        System.gc();

    }

    public static void newtonRaphson_Q10_3(double x, double epsilon, int iterationMax) {

        System.out.println( String.format( "\nNewton Raphson Method with x0 = %.1f:\n", x ) );

//        long startTime = System.currentTimeMillis();
        long startTime = getDate();

        int i = 1;

        while ( Math.abs( func_3( x ) ) > epsilon && i <= iterationMax ) {

            x = x - func_3( x ) / derivativeFunc_3( x );

            i++;

        }

        if( i > iterationMax )
            System.out.println( "Method Failed after: " + iterationMax + " iterations.\n" );

        else {

//            long endTime = System.currentTimeMillis();
            long endTime = getDate();

            double valueApproximate = func_3( x );

            long CPUTime = endTime - startTime;

            print_Q9( valueApproximate, x, i, CPUTime );

        }

        System.gc();

    }

    public static void newtonRaphson_Q10_4(double x, double epsilon, int iterationMax) {

        System.out.println( String.format( "\nNewton Raphson Method with x0 = %.1f:\n", x ) );

//        long startTime = System.currentTimeMillis();
        long startTime = getDate();

        int i = 1;

        while ( Math.abs( func_4( x ) ) > epsilon && i <= iterationMax ) {

            x = x - func_4( x ) / derivativeFunc_4( x );

            i++;

        }

        if( i > iterationMax )
            System.out.println( "Method Failed after: " + iterationMax + " iterations.\n" );

        else {

//            long endTime = System.currentTimeMillis();
            long endTime = getDate();

            double valueApproximate = func_4( x );

            long CPUTime = endTime - startTime;

            print_Q9( valueApproximate, x, i, CPUTime );

        }

        System.gc();

    }

}
