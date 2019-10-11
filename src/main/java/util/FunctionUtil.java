package util;

public class FunctionUtil {

    public static double func_Q9(double x) {

        return ( Math.exp( -2 * x ) ) * x + x * Math.cos( x ) - 4 * Math.sin( 2 * x );

    }

    public static double gFunc_Q8(double x) {

        return Math.pow( x+2, .5 );

    }

    public static double gFunc_Q9(double x) {

        return ( 4 * Math.sin( 2 * x ) ) / ( Math.exp( -2 * x ) + Math.cos( x ) );

    }

}
