/*
 * Copyright (c) 2019 FedEx. All Rights Reserved.
 * Theme - FedEx Training Feature
 * Feature - Javadoc Demo
 */
package com.infogain.demo;

/**
 * This interface is to perform vehicle related operations like horn, etc.
 * 
 * @author Namit Jain
 * @version 1.0.0
 * @since 1.0.0
 */
public interface Vehicle {

    /**
     * horns the number of times specified by {@code noOfTimes}
     * 
     * @param noOfTimes times vehicle will horn
     */
    void horn(int noOfTimes);

    /**
     * gets number of tyres in Vehicle.
     * 
     * @return number of tyres in Vehicle
     */
    int getNoOfTyres();

}
