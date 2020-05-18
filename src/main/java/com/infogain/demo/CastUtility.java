package com.infogain.demo;

/**
 * This utility class helps to cast an object to desired class
 * 
 * @author Namit Jain
 * @version 1.0.1
 * @since 1.0.1
 */
public class CastUtility {

    /**
     * converts the object to provided class {@code type}
     * 
     * @param string the object to be converted
     * @param type the type to convert the object to
     * @param <T> the type of the element
     * @return converted object
     * @throws IllegalArgumentException if any argument provided is invalid or null
     * @since 1.0.1
     */
    public static <T> T convert(Object string, Class<T> type) {
        if (type == null || string == null) {
            throw new IllegalArgumentException();
        }
        return type.cast(string);
    }
}
