package com.quantity;

import com.quantity.model.LengthUnit;
import com.quantity.model.QuantityLength;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        QuantityLength feet =
                new QuantityLength(1.0, LengthUnit.FEET);

        QuantityLength inches =
                new QuantityLength(12.0, LengthUnit.INCHES);

        QuantityLength yards =
                new QuantityLength(1.0, LengthUnit.YARDS);

        System.out.println("1 Feet + 12 Inches = "
                + feet.add(inches));

        System.out.println("12 Inches + 1 Feet = "
                + inches.add(feet));

        System.out.println("1 Yard + 3 Feet = "
                + yards.add(
                new QuantityLength(
                        3.0,
                        LengthUnit.FEET)));
    }
}