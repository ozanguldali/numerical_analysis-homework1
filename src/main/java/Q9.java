import static helper.PrinterHelper.printReport_Q9;
import static helper.ReportHelper.*;
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

        clearGlobalResultMap();
        bisection( a, b, EPSILON, 1000 );
        setCompareTableQ9( "bisection" );

        System.out.println( "---" );

        clearGlobalResultMap();
        regulaFalsi(x0, x1, EPSILON, 1000);
        setCompareTableQ9( "regulaFalsi" );

        System.out.println( "---" );

        clearGlobalResultMap();
        newtonRaphson_Q9(x0, EPSILON, 1000);
        setCompareTableQ9( "newtonRaphson" );

        System.out.println( "---" );

        clearGlobalResultMap();
        aitkensDeltaSquared(x0, EPSILON, 1000);
        setCompareTableQ9( "aitkensDeltaSquared" );

        System.out.println( "---" );

        clearGlobalResultMap();
        secant(x0, x1, EPSILON, 1000);
        setCompareTableQ9( "secant" );

        System.out.println( "---" );

        clearGlobalResultMap();
        fixedPointFuncError_Q9( x0, EPSILON, 1000);
        setCompareTableQ9( "fixedPoint" );

        printReport_Q9();

    }

}
