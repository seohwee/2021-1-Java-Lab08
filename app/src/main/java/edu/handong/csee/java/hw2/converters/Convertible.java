package edu.handong.csee.java.hw2.converters;

/** 
 * This is an interface of Convertible.
 * @author Seohwee Park
 * @param double fromValue
 */
public interface Convertible {
    /**
     * This is a declaration of a setFromValue function in Convertible interface.
     * @param double fromValue
     */
    public void setFromValue(double fromValue);
    /**
     * This is a declaration of a getConvertedValue function in Convertible interface.
     * @return converted value
     */
    public double getConvertedValue();
    /**
     * This is a declaration of a convert function in Convertible interface.
     */
    public void convert();

}