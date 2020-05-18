package com.infogain.demo;

import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * Utility class which has static methods which can be called without instantiating.
 * <p>
 * <img src="{@docRoot}/copyright.png" alt="copyright"> Fedex
 * 
 * @author Namit Jain
 * @version 1.0.0
 * @since 1.0.0
 * @see CastUtility
 */
public class Utility {

    /**
     * converts the object to provided class {@code type}
     * 
     * @param string the object to be converted
     * @param type the type to convert the object to
     * @param <T> the type of the element
     * @return converted object
     * @deprecated As of version 1.0.1, replaced by {@link CastUtility#convert(Object, Class) new convert method}
     */
    @Deprecated
    public static <T> T convert(Object string, Class<T> type) {
        return type.cast(string);
    }

    /**
     * return random integer value
     * 
     * @param range the range upto which number will be returned
     * @return a random integer number where range is 0 to {@code range}
     * @since 1.0.0
     */
    public static int randomValue(int range) {
        return new Random().nextInt(range);
    }

    /**
     * prints object
     * 
     * @param obj object to be printed
     * @since 1.0.0
     * @deprecated No Replacement.
     *             <p>
     *             It is not required anymore, as it is a useless method
     */
    @Deprecated
    public static void sysout(Object obj) {
        System.out.println(obj);
    }

    /**
     * Gets data inside the node as string
     * 
     * @param xmlNode node which can be {@literal <html>} or {@literal <xml>}
     * @return data inside the Node
     * @since 1.0.0
     */
    public String getValueFromNode(Object xmlNode) {
        return null;
    }

    /**
     * gets canonical path from the path specified for a file
     * 
     * @param path full path
     * @return canonical path
     * @throws IOException if any input or output error occurs
     * @since 1.0.0
     */
    public String openFile(String path) throws IOException {
        return new File(path).getCanonicalPath();
    }
}
