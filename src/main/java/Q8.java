import java.util.Random;

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

        fixedPointRootError( 0, EPSILON, iterationMax );

    }

}
