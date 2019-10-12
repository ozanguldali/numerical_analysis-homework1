package util;

public class FunctionUtil {

    public static class Q8 {

        public static double gFunc(double x) {

            return Math.pow( x+2, .5 );

        }
    }

    public static class Q9 {


        public static double func(double x) {

            return ( Math.exp( -2 * x ) ) * x + x * Math.cos( x ) - 4 * Math.sin( 2 * x );

        }

        public static double derivativeFunc(double x) {

            return ( -2 ) * ( Math.exp( -2 * x ) ) * x +  Math.exp( -2 * x ) - x * Math.sin( x ) + Math.cos( x ) - 8 * Math.cos( 2 * x );

        }

        public static double gFunc(double x) {

            return ( 4 * Math.sin( 2 * x ) ) / ( Math.exp( -2 * x ) + Math.cos( x ) );

        }

    }

    public static class Q10 {

        public static double func_1(double x) {

            return ( -1 ) * x * x * x + 2 * x * x - 2 ;

        }

        public static double derivativeFunc_1(double x) {

            return ( -3 ) * x * x + 4 * x;

        }

        public static double gFunc_1(double x) {

//            return Math.sqrt( x * x * x + 2 ) / 2 ;

//            return Math.pow( 2 * x * x - 2, ( double ) 1 / 3 );

//            return -2 / ( 2 * x - x * x );

//            return Math.sqrt( 2 / ( 2 - x ) );

//            return 2 - ( 2 / ( x * x ) );

            return ( -1 ) * x * x * x + 2 * x * x + x - 2 ;

        }

        public static double func_2(double x) {

            return x * x * x - 2 * x + 2;

        }

        public static double derivativeFunc_2(double x) {

            return 3 * x * x - 2;

        }

        public static double gFunc_2(double x) {

//            return ( x * x * x + 2 ) / 2;

//            return Math.pow( 2 * x - 2, ( double ) ( 1 / 3 ) );

//            return Math.sqrt( 2 - 2 / x );

//            return ( 2 * x - 2 ) / ( x * x );

//            return -2 / ( x * x - 2 );

//            return Math.sqrt( 2 + 2 / x );

//            return ( 2 * x + 2 ) / ( x * x );

            return x * x * x - x + 2;

        }

        public static double func_3(double x) {

            return ( x - 1 ) * ( x - 1 ) * ( x - 1 ) + 0.512;

        }

        public static double derivativeFunc_3(double x) {

            return 3 * ( x - 1 ) * ( x - 1 );

        }

        public static double gFunc_3(double x) {

//            return ( 3 * x * x - x * x * x + 0.488 ) / 3 ;

//            return ( x - 1 ) * ( x - 1 ) * ( x - 1 ) + x + 0.512;

//            return 3 * x * x - x * x * x - 2 * x + 0.488;

            return x * x * x - 3 * x * x + 4 * x - 0.488;

        }

        public static double func_4(double x) {

            return Math.sin( x );

        }

        public static double derivativeFunc_4(double x) {

            return Math.cos( x );

        }

        public static double gFunc_4(double x) {

            return Math.sin( x ) + x;

        }

    }

}
