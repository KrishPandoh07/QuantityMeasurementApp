package com.quantity;

import com.quantity.model.LengthUnit;
import com.quantity.model.QuantityLength;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        QuantityLength feet =
                new QuantityLength(1.0, LengthUnit.FEET);

        QuantityLength inches =
                new QuantityLength(12.0, LengthUnit.INCHES);

        System.out.println("Feet Result : "
                + feet.add(inches, LengthUnit.FEET));

        System.out.println("Inches Result : "
                + feet.add(inches, LengthUnit.INCHES));

        System.out.println("Yards Result : "
                + feet.add(inches, LengthUnit.YARDS));

        System.out.println("CM Result : "
                + new QuantityLength(
                1.0,
                LengthUnit.INCHES)
                .add(
                new QuantityLength(
                        1.0,
                        LengthUnit.INCHES),
                LengthUnit.CENTIMETERS));
    }
}