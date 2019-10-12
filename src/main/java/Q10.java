import static model.FixedPointModel.*;
import static model.NewtonRaphsonModel.*;

public class Q10 {


    private static final double EPSILON = 0.001;

    public static void main(String[] args) {

        double x0_1 = 1, x0_2 = 0, x0_3 = 5, x0_4 = 7.539822;

        System.out.println( "***Function 1***" );

        newtonRaphson_Q10_1(x0_1, EPSILON, 1000);

//        System.out.println( "---" );

//        fixedPointFuncError_Q10_1(x0_1, EPSILON, 1000);

        System.out.println( "***Function 2***" );

        newtonRaphson_Q10_2(0, EPSILON, 1000);
/*
        System.out.println( "---" );

        fixedPointFuncError_Q10_2(x0_2, EPSILON, 1000);

        System.out.println( "***Function 3***" );

        newtonRaphson_Q10_3(x0_3, EPSILON, 1000);

        System.out.println( "---" );

        fixedPointFuncError_Q10_3(x0_3, EPSILON, 1000);

        System.out.println( "***Function 4***" );

        newtonRaphson_Q10_4(x0_4, EPSILON, 1000);

        System.out.println( "---" );

        fixedPointFuncError_Q10_4(x0_4, EPSILON, 1000);*/

    }

}
