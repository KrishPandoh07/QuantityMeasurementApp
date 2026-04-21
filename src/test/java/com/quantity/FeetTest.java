package com.quantity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import com.quantity.model.LengthUnit;
import com.quantity.model.QuantityLength;

public class FeetTest {

    private static final double EPSILON = 0.001;

    @Test
    void testTargetFeet() {
        QuantityLength result =
                new QuantityLength(1, LengthUnit.FEET)
                .add(
                new QuantityLength(12, LengthUnit.INCHES),
                LengthUnit.FEET);

        assertEquals(2.0,
                result.getValue(),
                EPSILON);
    }

    @Test
    void testTargetInches() {
        QuantityLength result =
                new QuantityLength(1, LengthUnit.FEET)
                .add(
                new QuantityLength(12, LengthUnit.INCHES),
                LengthUnit.INCHES);

        assertEquals(24.0,
                result.getValue(),
                EPSILON);
    }

    @Test
    void testTargetYards() {
        QuantityLength result =
                new QuantityLength(1, LengthUnit.FEET)
                .add(
                new QuantityLength(12, LengthUnit.INCHES),
                LengthUnit.YARDS);

        assertEquals(0.666,
                result.getValue(),
                0.01);
    }

    @Test
    void testTargetCentimeters() {
        QuantityLength result =
                new QuantityLength(1, LengthUnit.INCHES)
                .add(
                new QuantityLength(1, LengthUnit.INCHES),
                LengthUnit.CENTIMETERS);

        assertEquals(5.08,
                result.getValue(),
                0.05);
    }

    @Test
    void testCommutative() {

        QuantityLength a =
                new QuantityLength(1, LengthUnit.FEET)
                .add(
                new QuantityLength(12, LengthUnit.INCHES),
                LengthUnit.YARDS);

        QuantityLength b =
                new QuantityLength(12, LengthUnit.INCHES)
                .add(
                new QuantityLength(1, LengthUnit.FEET),
                LengthUnit.YARDS);

        assertEquals(
                a.getValue(),
                b.getValue(),
                EPSILON);
    }

    @Test
    void testNullTarget() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuantityLength(
                        1,
                        LengthUnit.FEET)
                        .add(
                        new QuantityLength(
                                1,
                                LengthUnit.FEET),
                        null));
    }
}