package dev.morphie.morphLib.utils;

public class StringUtils {

    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str; // Handle null or empty strings
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
