package com.infogain.demo;

import java.io.Serializable;

/**
 * This class is to show multiple serial fields in serializable class.
 * <p>
 * Also see <a href = "{@docRoot}/serialized-form.html" >Serialized form</a>
 * 
 * @author Namit Jain
 * @version 1.0.0
 * @since 1.0.0
 */
public class SerialExample3 implements Serializable {

    private static final long serialVersionUID = 988017833171961716L;

    /**
     * length of Rectangle
     * 
     * @serial
     */
    private int length;
    
    /**
     * width of Rectangle
     * 
     * @serial
     */
    private int width;

}
