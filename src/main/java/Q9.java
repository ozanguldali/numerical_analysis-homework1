import model.BisectionModel;
import model.FixedPointModel;

import static model.NewtonRaphsonModel.newtonRaphson;
import static model.RegulaFalsiModel.regulaFalsi;

public class Q9 {

    private static final double EPSILON = 0.00001;

    public static void main(String[] args) {

        double a = 1, b = 2;

        double x0 = 1, x1 = 1.1;

        BisectionModel.bisection( a, b, EPSILON );

        FixedPointModel.fixedPoint_funcError( x0, EPSILON, 1000);

        regulaFalsi(x0, x1, EPSILON, 1000);

        newtonRaphson(x0, EPSILON, 1000);

    }

}
