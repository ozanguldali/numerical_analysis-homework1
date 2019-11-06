package helper;

import static helper.ReportHelper.*;

public class PrinterHelper {

    public static void print_Q9(double valueAppx, double rootAppx, int iteration, long CPUTime ) {

        System.out.println("The Convergence = " + valueAppx + " | The Root = " + rootAppx + " | Iteration Number: " + iteration + " | CPU Time (ms) : " + CPUTime + " \n");

        setGlobalResultMap( valueAppx, rootAppx, iteration, CPUTime );

    }

    public static void print_Q8(double rootAppx, double epsilon, int iteration, long CPUTime ) {

        System.out.println( "The Approximate Value x is reached on " + iteration + " with error tolerance " + epsilon + " as [ " + rootAppx + " ] in " + CPUTime + " ms\n" );

    }

    public static void printReport_Q9() {

        System.out.println("________________________________________________________________________________________");
        System.out.println("| The Model           | The Convergence | The Root  | Iteration Number | CPU Time (ms) |");
        System.out.println("|---------------------|-----------------|-----------|------------------|---------------|");

        for ( String model : compareTableQ9.keySet() ) {

            Double naN = Double.POSITIVE_INFINITY - Double.POSITIVE_INFINITY;

            System.out.println( String.format( "| %-19s | %-15f | %-9f | %-16d | %-13d |", model
                                                                                    , compareTableQ9.get( model ).get( "convergence" ) == null ? naN : ( Double ) compareTableQ9.get( model ).get( "convergence" )
                                                                                    , compareTableQ9.get( model ).get( "root" ) == null ? naN : ( Double ) compareTableQ9.get( model ).get( "root" )
                                                                                    , compareTableQ9.get( model ).get("iteration") == null ? naN.intValue() : ( ( Double ) compareTableQ9.get( model ).get("iteration") ).intValue()
                                                                                    , compareTableQ9.get( model ).get( "cpu" ) == null ? naN.intValue() : ( ( Double ) compareTableQ9.get( model ).get( "cpu" ) ).intValue() )
            );

        }

        System.out.println("________________________________________________________________________________________");

        System.out.println();

    }

}
