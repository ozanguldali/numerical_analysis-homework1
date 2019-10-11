import java.util.Random;
import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double rangeMin = 0;
        double rangeMax = 2;

        double x_Approx = 0, x_Initial;
        int i = 1;
        int iterationMax;

        Random random = new Random();

        x_Initial = rangeMin + (rangeMax - rangeMin) * random.nextDouble();

        System.out.println( "Enter error tolerance: " );
        final double error_Tolerance = console.nextDouble();

        /*System.out.println( "Enter Maximum Iterations: " );
        iterationMax = console.nextInt();*/
        iterationMax = 1000;

        while( i < iterationMax ) {

            x_Approx = gFunc( x_Initial );

            if( Math.abs( x_Approx-x_Initial ) < error_Tolerance ){

                System.out.println("X: " + x_Approx);

                break;

            }

            System.out.println( "Iteration: Current Value = " + i + " " + x_Approx );

            i++;
            x_Initial = x_Approx;

            if( i > iterationMax ){
                System.out.println( "Method Failed after: " + iterationMax );
                System.out.println();
                System.exit( 0 );
            }

        }

        System.out.println( "The Approximate Value x is reached on " + i + " step depending on " + error_Tolerance + " as = " + x_Approx );

    }

    private static double gFunc(double x) {

        return Math.pow( x+2, .5 );

    }

}
