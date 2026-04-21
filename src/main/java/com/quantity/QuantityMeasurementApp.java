package com.quantity;

import com.quantity.model.LengthUnit;
import com.quantity.model.QuantityLength;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        QuantityLength value1 =
                new QuantityLength(1.0, LengthUnit.FEET);

        QuantityLength value2 =
                new QuantityLength(12.0, LengthUnit.INCHES);

        QuantityLength value3 =
                new QuantityLength(1.0, LengthUnit.INCHES);

        QuantityLength value4 =
                new QuantityLength(1.0, LengthUnit.INCHES);

        System.out.println("1 Feet == 12 Inches : "
                + value1.equals(value2));

        System.out.println("1 Inch == 1 Inch : "
                + value3.equals(value4));
    }
}