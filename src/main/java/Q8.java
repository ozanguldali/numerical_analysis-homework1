import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import static model.FixedPointModel.fixedPointRootError;

public class Q8 {

    public static void main(String[] args) {

        Scanner console = new Scanner( System.in ).useLocale( Locale.US );

        double rangeMin = 0;
        double rangeMax = 2;

        double x_Initial;
        int iterationMax;

        Random random = new Random();

        x_Initial = rangeMin + (rangeMax - rangeMin) * random.nextDouble();

        System.out.println( "Enter error tolerance: " );
        final double error_Tolerance = console.nextDouble();

        /*System.out.println( "Enter Maximum Iterations: " );
        iterationMax = console.nextInt();*/
        iterationMax = 1000;

        fixedPointRootError( x_Initial, error_Tolerance, iterationMax );


    }

}
