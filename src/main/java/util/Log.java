/**
 * <H2> Log </H2>
 *
 * @author Manan Sharma
 * @version 1
 * @since Tuesday, 04 of July, 2023; 05:13:06
 */

package util;

import static util.ConsoleColors.*;

public class Log {

    private static final boolean debug = true;

    public static void info(String message) {
        if (debug) {
            System.out.println(GREEN + message + GREEN);
            reset();
        }
    }

    public static void criticalInfo(String message) {
        if (debug) {
            System.out.print(GREEN_BACKGROUND);
            System.out.println(BLACK + message);
            System.out.print(GREEN_BACKGROUND);
            reset();
        }
    }

    public static void debug(String message) {
        if (debug) {
            System.out.println(YELLOW + message + YELLOW);
            reset();
        }
    }

    public static void error(String message) {
        if (debug) {
            System.out.println(RED + message + RED);
            reset();
        }
    }

    public static void exception(Exception exception) {
        exception(exception.getMessage());
        reset();
    }

    public static void exception(String message) {
        if (debug) {
            System.out.println(RED_BACKGROUND + message + RED_BACKGROUND);
            reset();
        }
    }

    public static void reset(){
        System.out.print(RESET);
    }
}