import static model.AitkensDeltaSquaredModel.aitkensDeltaSquared;
import static model.BisectionModel.bisection;
import static model.FixedPointModel.fixedPointFuncError_Q9;
import static model.NewtonRaphsonModel.newtonRaphson_Q9;
import static model.RegulaFalsiModel.regulaFalsi;
import static model.SecantModel.secant;

public class Q9 {

    private static final double EPSILON = 0.00001;

    public static void main(String[] args) {

        double a = 1, b = 2;

        double x0 = 1, x1 = 1.1;

        bisection( a, b, EPSILON, 1000 );

        System.out.println( "---" );

        regulaFalsi(x0, x1, EPSILON, 1000);

        System.out.println( "---" );

        newtonRaphson_Q9(x0, EPSILON, 1000);

        System.out.println( "---" );

        aitkensDeltaSquared(x0, EPSILON, 1000);

        System.out.println( "---" );

        secant(x0, x1, EPSILON, 1000);

        System.out.println( "---" );

        fixedPointFuncError_Q9( x0, EPSILON, 1000);

    }

}
