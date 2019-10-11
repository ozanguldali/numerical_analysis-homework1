package helper;

public class PrinterHelper {

    public static void print_Q9(double valueAppx, double rootAppx, int iteration, long CPUTime ) {

        System.out.printf( "The Convergence = %f | The Root = %f | Iteration Number: %d | CPU Time (ms) : %d%n\n" , valueAppx, rootAppx , iteration, CPUTime );

    }

    public static void print_Q8(double rootAppx, double epsilom, int iteration, long CPUTime ) {

        System.out.println( "The Approximate Value x is reached on " + iteration + " step depending on " + epsilom + " as = " + rootAppx + " in " + CPUTime + " ms\n" );

    }

}
