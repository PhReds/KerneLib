package me.phredss.kernelib;

public class GeneralUtils {
    public static boolean isDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDouble(int input) {
        try {
            Double.parseDouble(String.valueOf(input));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
