package com.quantity;

import com.quantity.model.LengthUnit;
import com.quantity.model.QuantityLength;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        QuantityLength oneFoot =
                new QuantityLength(1.0, LengthUnit.FEET);

        QuantityLength twelveInches =
                new QuantityLength(12.0, LengthUnit.INCHES);

        System.out.println("1 Foot -> Inches : "
                + oneFoot.convertTo(
                LengthUnit.INCHES));

        System.out.println("1 Foot + 12 Inches : "
                + oneFoot.add(
                twelveInches,
                LengthUnit.FEET));

        System.out.println("36 Inches == 1 Yard : "
                + new QuantityLength(
                36,
                LengthUnit.INCHES)
                .equals(
                new QuantityLength(
                        1,
                        LengthUnit.YARDS)));

        System.out.println("1 Yard + 3 Feet : "
                + new QuantityLength(
                1,
                LengthUnit.YARDS)
                .add(
                new QuantityLength(
                        3,
                        LengthUnit.FEET),
                LengthUnit.YARDS));
    }
}