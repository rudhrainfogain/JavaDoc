/*
 * Copyright (c) 2019 FedEx. All Rights Reserved.
 * Theme - FedEx Training Feature
 * Feature - Javadoc Demo
 */
package com.infogain.demo;

import java.io.Serializable;

/**
 * This class will perform car related operations
 * <p>
 * Car is implemented from {@link Vehicle}
 * 
 * @author Namit Jain
 * @author Rudhra Koul
 * @version 1.0.0
 * @since 1.0.0
 */
public class Car implements Vehicle, Serializable {

    private static final long serialVersionUID = 9200882126211391414L;
    
    /**
     * The value of this constant is {@value}.
     * 
     * @serial no. of tyres
     */
    private final int NO_OF_TYRES = 4;

    /**
     * Car {@inheritDoc}.
     * <ul>
     * <li>This is link {@link Vehicle#horn the overridden method}
     * <li>This is linkplain {@linkplain Vehicle#horn(int) the overridden method}
     * </ul>
     * 
     * @param noOfTimes no. of times need to be horned
     * @since 1.0.0
     */
    @Override
    public void horn(int noOfTimes) {
        for (int i = 0; i < noOfTimes; i++) {
            hornCar(i);
        }
    }

    /**
     * gets number of tyres in Car.
     * <p>
     * It uses {@value #NO_OF_TYRES}
     * 
     * @return number of tyres in Car
     * @since 1.0.0
     */
    @Override
    public int getNoOfTyres() {
        return NO_OF_TYRES;
    }

    /**
     * This method horns car
     * 
     * @param i no. of horn
     * @todo need to change implementation
     * @since 1.0.0
     */
    private void hornCar(int i) {
        System.out.println("Car horning..." + i);
    }

}
