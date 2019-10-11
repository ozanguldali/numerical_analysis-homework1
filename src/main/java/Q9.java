public class Q9 {

    private static final double EPSILON = 0.00001;


    public static void main(String[] args) {

        double a = 1, b = 2;

        double x0 = 1, x1 = 1.1;

        System.out.println( "\nBisection Method with a = 1 and b = 2:\n" );
        bisection( a, b );

    }

    private static void bisection(double a, double b) {

        long startTime = System.currentTimeMillis();

        int i = 1;

        if ( func( a ) * func( b ) >= 0) {

            System.out.println("You have not assumed right a and b");
            return;

        }

        double c = a;

        while ( Math.abs( func( c ) ) > EPSILON ) {

            c = ( a + b ) / 2;

            i++;

            if ( func( c ) == 0.0 )
                break;

            else if ( func( c ) * func( a ) < 0)
                b = c;

            else
                a = c;

        }

        long endTime = System.currentTimeMillis();

        double valueApproximate = func( c );

        long CPUTime = endTime - startTime;

        print( valueApproximate, c, i, CPUTime );

    }

    private static void print( double valueAppx, double rootAppx, int iteration, long CPUTime ) {

        System.out.printf( "The Convergence = %f | The Root = %f | Iteration Number: %d | CPU Time (ms) : %d%n\n" , valueAppx, rootAppx , iteration, CPUTime );

    }

    private static double func(double x) {

        return (Math.exp(-2 * x)) * x + x * Math.cos(x) - 4 * Math.sin(2 * x);

    }

}
