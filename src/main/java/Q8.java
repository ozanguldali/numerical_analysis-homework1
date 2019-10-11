import java.util.Random;
import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double rangeMin = 0;
        double rangeMax = 2;

        double x_Approx = 0, x_Initial, error_Tolerance;
        int i = 1;
        int No;

        Random r = new Random();

        x_Initial = rangeMin + (rangeMax - rangeMin) * r.nextDouble();

        System.out.println( "Enter error tolerance: " );
        error_Tolerance = console.nextDouble();

        /*System.out.println( "Enter Maximum Iterations: " );
        No = console.nextInt();*/
        No = 1000;

        while( i < No ) {

            x_Approx = g( x_Initial );

            if( Math.abs( x_Approx-x_Initial ) < error_Tolerance ){

                System.out.println("X: " + x_Approx);

                break;

            }

            System.out.println( "Iteration: Current Value = " + i + " " + x_Approx );

            i++;
            x_Initial = x_Approx;

            if( i > No ){
                System.out.println( "Method Failed after: " + No );
                System.out.println();
                System.exit( 0 );
            }

        }

        System.out.println( "The Approximate Value x is reached on " + i + " step depending on " + error_Tolerance + " as = " + x_Approx );

    }

    private static double g(double x) {

        return Math.pow( x+2, .5 );

    }

}
