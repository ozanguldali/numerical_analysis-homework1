import static helper.PrinterHelper.printReport_Q9;
import static helper.ReportHelper.clearGlobalResultMap;
import static helper.ReportHelper.setCompareTableQ9;
import static model.FixedPointModel.*;
import static model.NewtonRaphsonModel.*;

public class Q10 {


    private static final double EPSILON = 0.001;

    public static void main(String[] args) {

        System.out.println( "***Function 1***" );

        func1.main( args );

        System.out.println( "***Function 2***" );

        func2.main( args );

        System.out.println( "***Function 3***" );

        func3.main( args );

        System.out.println( "***Function 4***" );

        func4.main( args );

    }

    public static class func1 {

        public static void main(String[] args) {

            double x0_1 = 1;

            clearGlobalResultMap();
            newtonRaphson_Q10_1( x0_1, EPSILON, 1000 );
            setCompareTableQ9( "newtonRaphson" );

            System.out.println( "---" );

            clearGlobalResultMap();
            fixedPointFuncError_Q10_1( x0_1, EPSILON, 1000 );
            setCompareTableQ9( "fixedPoint" );

            printReport_Q9();

        }

    }

    public static class func2 {

        public static void main(String[] args) {

            double x0_2 = 0;

            clearGlobalResultMap();
            newtonRaphson_Q10_2( x0_2, EPSILON, 1000 );
            setCompareTableQ9( "newtonRaphson" );

            System.out.println( "---" );

            clearGlobalResultMap();
            fixedPointFuncError_Q10_2( x0_2, EPSILON, 1000 );
            setCompareTableQ9( "fixedPoint" );

            printReport_Q9();

        }

    }

    public static class func3 {

        public static void main(String[] args) {

            double x0_3 = 5;

            clearGlobalResultMap();
            newtonRaphson_Q10_3(x0_3, EPSILON, 1000);
            setCompareTableQ9( "newtonRaphson" );

            System.out.println( "---" );

            clearGlobalResultMap();
            fixedPointFuncError_Q10_3(x0_3, EPSILON, 1000);
            setCompareTableQ9( "fixedPoint" );

            printReport_Q9();

        }

    }

    public static class func4 {

        public static void main(String[] args) {

            double x0_4 = 7.539822;

            clearGlobalResultMap();
            newtonRaphson_Q10_4(x0_4, EPSILON, 1000);
            setCompareTableQ9( "newtonRaphson" );

            System.out.println( "---" );

            clearGlobalResultMap();
            fixedPointFuncError_Q10_4(x0_4, EPSILON, 1000);
            setCompareTableQ9( "fixedPoint" );

            printReport_Q9();

        }

    }

}
