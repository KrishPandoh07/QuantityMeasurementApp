package com.quantity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import com.quantity.model.LengthUnit;
import com.quantity.model.QuantityLength;

public class FeetTest {

    private static final double EPSILON = 0.0001;

    @Test
    void testFeetToInches() {
        assertEquals(12.0,
                QuantityLength.convert(
                        1.0,
                        LengthUnit.FEET,
                        LengthUnit.INCHES),
                EPSILON);
    }

    @Test
    void testInchesToFeet() {
        assertEquals(2.0,
                QuantityLength.convert(
                        24.0,
                        LengthUnit.INCHES,
                        LengthUnit.FEET),
                EPSILON);
    }

    @Test
    void testYardsToFeet() {
        assertEquals(3.0,
                QuantityLength.convert(
                        1.0,
                        LengthUnit.YARDS,
                        LengthUnit.FEET),
                EPSILON);
    }

    @Test
    void testCentimeterToInches() {
        assertEquals(0.393701,
                QuantityLength.convert(
                        1.0,
                        LengthUnit.CENTIMETERS,
                        LengthUnit.INCHES),
                EPSILON);
    }

    @Test
    void testSameUnit() {
        assertEquals(5.0,
                QuantityLength.convert(
                        5.0,
                        LengthUnit.FEET,
                        LengthUnit.FEET),
                EPSILON);
    }

    @Test
    void testInvalidInput() {
        assertThrows(
                IllegalArgumentException.class,
                () -> QuantityLength.convert(
                        Double.NaN,
                        LengthUnit.FEET,
                        LengthUnit.INCHES));
    }
}