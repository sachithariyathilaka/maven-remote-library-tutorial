package io.github.sachithariyathilaka;

import io.github.sachithariyathilaka.enums.Operation;

/**
 * Main class for the tutorial.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/04/27
 */
public class MavenRemoteLibraryTutorial
{

    /**
     * Calculate value of given two integers.
     * @param   operation the operation type
     * @param   a value one
     * @param   b value 2
     */
    public static void calculate(Operation operation, int a, int b) {
        switch (operation)
        {
            case ADD:
                System.out.println("Output is: " + (a+b));
                break;

            case DIVIDE:
                System.out.println("Output is: " + (a/b));
                break;

            case SUBSTRACT:
                System.out.println("Output is: " + (a-b));
                break;

            case MULTIPLY:
                System.out.println("Output is: " + (a*b));
                break;

            default:
                System.out.println("Output is: 0");
                break;
        }
    }
}
