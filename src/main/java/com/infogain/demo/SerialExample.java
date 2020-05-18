package com.infogain.demo;

import java.io.Serializable;


/**
 * This class is to demo include example in serialized form
 * <p>
 * Also see <a href = "{@docRoot}/serialized-form.html" >Serialized form</a>
 * 
 * @author Namit Jain
 * @version 1.0.0
 * @since 1.0.0
 */
public class SerialExample {

    /**
     * @serial include
     */
    private static class WillInclude implements Serializable {
        private static final long serialVersionUID = -8742448824652078965L;

    }

    private static class WillNotInclude implements Serializable {
        private static final long serialVersionUID = -974248824652078965L;

    }
}
