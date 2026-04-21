package com.quantity;

import com.quantity.model.LengthUnit;
import com.quantity.model.QuantityLength;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        System.out.println("1 Feet -> Inches : "
                + QuantityLength.convert(
                1.0,
                LengthUnit.FEET,
                LengthUnit.INCHES));

        System.out.println("3 Yards -> Feet : "
                + QuantityLength.convert(
                3.0,
                LengthUnit.YARDS,
                LengthUnit.FEET));

        System.out.println("36 Inches -> Yards : "
                + QuantityLength.convert(
                36.0,
                LengthUnit.INCHES,
                LengthUnit.YARDS));

        System.out.println("1 CM -> Inches : "
                + QuantityLength.convert(
                1.0,
                LengthUnit.CENTIMETERS,
                LengthUnit.INCHES));
    }
}