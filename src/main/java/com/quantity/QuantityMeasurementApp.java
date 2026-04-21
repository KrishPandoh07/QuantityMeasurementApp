package com.quantity;

import com.quantity.model.LengthUnit;
import com.quantity.model.QuantityLength;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        QuantityLength yard =
                new QuantityLength(1.0, LengthUnit.YARDS);

        QuantityLength feet =
                new QuantityLength(3.0, LengthUnit.FEET);

        QuantityLength inches =
                new QuantityLength(36.0, LengthUnit.INCHES);

        QuantityLength cm =
                new QuantityLength(1.0, LengthUnit.CENTIMETERS);

        QuantityLength inchValue =
                new QuantityLength(0.393701, LengthUnit.INCHES);

        System.out.println("1 Yard == 3 Feet : "
                + yard.equals(feet));

        System.out.println("1 Yard == 36 Inches : "
                + yard.equals(inches));

        System.out.println("1 CM == 0.393701 Inches : "
                + cm.equals(inchValue));
    }
}