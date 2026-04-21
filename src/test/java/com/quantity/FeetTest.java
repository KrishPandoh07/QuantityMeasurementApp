package com.quantity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.quantity.model.LengthUnit;
import com.quantity.model.QuantityLength;

public class FeetTest {

    private static final double EPSILON = 0.01;

    @Test
    void testConvertToBaseUnit() {
        assertEquals(1.0,
                LengthUnit.INCHES
                        .convertToBaseUnit(12),
                EPSILON);
    }

    @Test
    void testConvertFromBaseUnit() {
        assertEquals(12.0,
                LengthUnit.INCHES
                        .convertFromBaseUnit(1),
                EPSILON);
    }

    @Test
    void testQuantityConvertTo() {
        QuantityLength q =
                new QuantityLength(
                        1,
                        LengthUnit.FEET)
                        .convertTo(
                        LengthUnit.INCHES);

        assertEquals(12.0,
                q.getValue(),
                EPSILON);
    }

    @Test
    void testEquality() {
        assertTrue(
                new QuantityLength(
                        36,
                        LengthUnit.INCHES)
                        .equals(
                        new QuantityLength(
                                1,
                                LengthUnit.YARDS)));
    }

    @Test
    void testAddition() {
        QuantityLength result =
                new QuantityLength(
                        1,
                        LengthUnit.FEET)
                        .add(
                        new QuantityLength(
                                12,
                                LengthUnit.INCHES),
                        LengthUnit.FEET);

        assertEquals(2.0,
                result.getValue(),
                EPSILON);
    }

    @Test
    void testInvalidInput() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuantityLength(
                        Double.NaN,
                        LengthUnit.FEET));
    }
}