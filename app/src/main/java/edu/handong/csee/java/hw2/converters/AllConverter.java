package edu.handong.csee.java.hw2.converters;
import edu.handong.csee.java.hw2.converters.*;

/**
 * This is a class of AllConverter
 */
public class AllConverter {
    private double fromValue = 0;
    private String originalMeasure;

    /**
     * This is an instance of AllConverter class.
     * @param double fromValue
     */
    public AllConverter setFromValue(double fromValue){
        this.fromValue = fromValue;
        return this;
    }

    /**
     * This is an instance of AllConverter class.
     * @param String originalMeasure
     */
    public AllConverter setOriginalMeasure(String originalMeasure){
        this.originalMeasure = originalMeasure;
        return this;
    }

    /**
     * This is an instance of AllConverter class.
     */
    public AllConverter convertAndPrintOut(){
        if(originalMeasure.equals("KM")) {
            KMToMConverter myConverter = new KMToMConverter();
            KMToMILEConverter myConverter2 = new KMToMILEConverter();
            myConverter.setFromValue(fromValue);
            myConverter.convert();
            System.out.println(fromValue + " " + originalMeasure + " to " + myConverter.getConvertedValue() + " M");

            myConverter2.setFromValue(fromValue);
            myConverter2.convert();
            System.out.println(fromValue + " " + originalMeasure + " to " + myConverter2.getConvertedValue() + " MILE");
        }
        else if(originalMeasure.equals("TON")) {
            TONToKGConverter myConverter3 = new TONToKGConverter();
            TONToGConverter myConverter4 = new TONToGConverter();
            myConverter3.setFromValue(fromValue);
            myConverter3.convert();
            System.out.println(fromValue + " " + originalMeasure + " to " + myConverter3.getConvertedValue() + " KG");

            myConverter4.setFromValue(fromValue);
            myConverter4.convert();
            System.out.println(fromValue + " " + originalMeasure + " to " + myConverter4.getConvertedValue() + " G");
        }
        else {
            System.out.println("AllConverter cannot support the measure!");
        }
        return this;
    }
}