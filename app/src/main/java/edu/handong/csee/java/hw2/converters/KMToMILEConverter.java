package edu.handong.csee.java.hw2.converters;

/**
 * This is a class of IntegratedConverter that implements Convertible.
 */
public class KMToMILEConverter implements Convertible {
    private double value;
    private double conv;

    /**
     * This is an instance of Convertible.
     */
    public void setFromValue(double fromValue) {
        value = fromValue;
    }

    /**
     * This is an instance of Convertible.
     */
    public double getConvertedValue(){
        return conv;
    }

    /**
     * This is an instance of Convertible.
     */
    public void convert(){
        conv = value / 1.6;
    }
}