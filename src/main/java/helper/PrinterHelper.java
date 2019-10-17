package helper;

import java.util.HashMap;

import static helper.ReportHelper.*;

public class PrinterHelper {

    public static void print_Q9(double valueAppx, double rootAppx, int iteration, long CPUTime ) {

        System.out.printf( "The Convergence = %f | The Root = %f | Iteration Number: %d | CPU Time (ms) : %d%n\n" , valueAppx, rootAppx , iteration, CPUTime );

        setGlobalResultMap( valueAppx, rootAppx, iteration, CPUTime );

    }

    public static void print_Q8(double rootAppx, double epsilon, int iteration, long CPUTime ) {

        System.out.println( "The Approximate Value x is reached on " + iteration + " with error tolerance " + epsilon + " as [ " + rootAppx + " ] in " + CPUTime + " ms\n" );

    }

    public static void printReport_Q9() {

        System.out.println("| The Model           | The Convergence | The Root | Iteration Number | CPU Time (ms) |");

        for ( String model : compareTableQ9.keySet() ) {

            System.out.println( String.format( "| %-19s | %-15f | %-8f | %-16d | %-13f |", model
                                                                                    , ( Double ) compareTableQ9.get( model ).get( "convergence" )
                                                                                    , ( Double ) compareTableQ9.get( model ).get( "root" )
                                                                                    , ( ( Double ) compareTableQ9.get( model ).get("iteration") ).intValue()
                                                                                    , ( Double ) compareTableQ9.get( model ).get( "cpu" ) ) );

        }

        System.out.println();

    }

}
