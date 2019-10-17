import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import static model.FixedPointModel.fixedPointRootError;

public class Q8 {

    private static final double EPSILON = 0.0000000001;

    public static void main(String[] args) {

        double rangeMin = 0;
        double rangeMax = 2;

        double x_Initial;
        int iterationMax;

        Random random = new Random();

        x_Initial = rangeMin + (rangeMax - rangeMin) * random.nextDouble();

        iterationMax = 1000;

        fixedPointRootError( x_Initial, EPSILON, iterationMax );

    }

}
