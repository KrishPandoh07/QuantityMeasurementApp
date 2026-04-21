package com.quantity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import com.quantity.model.LengthUnit;
import com.quantity.model.QuantityLength;

public class FeetTest {

    private static final double EPSILON = 0.0001;

    @Test
    void testFeetPlusFeet() {
        QuantityLength result =
                new QuantityLength(1, LengthUnit.FEET)
                .add(new QuantityLength(2, LengthUnit.FEET));

        assertEquals(3.0,
                result.getValue(),
                EPSILON);
    }

    @Test
    void testFeetPlusInches() {
        QuantityLength result =
                new QuantityLength(1, LengthUnit.FEET)
                .add(new QuantityLength(12, LengthUnit.INCHES));

        assertEquals(2.0,
                result.getValue(),
                EPSILON);
    }

    @Test
    void testInchesPlusFeet() {
        QuantityLength result =
                new QuantityLength(12, LengthUnit.INCHES)
                .add(new QuantityLength(1, LengthUnit.FEET));

        assertEquals(24.0,
                result.getValue(),
                EPSILON);
    }

    @Test
    void testYardPlusFeet() {
        QuantityLength result =
                new QuantityLength(1, LengthUnit.YARDS)
                .add(new QuantityLength(3, LengthUnit.FEET));

        assertEquals(2.0,
                result.getValue(),
                EPSILON);
    }

    @Test
    void testWithZero() {
        QuantityLength result =
                new QuantityLength(5, LengthUnit.FEET)
                .add(new QuantityLength(0, LengthUnit.INCHES));

        assertEquals(5.0,
                result.getValue(),
                EPSILON);
    }

    @Test
    void testNullOperand() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuantityLength(
                        1,
                        LengthUnit.FEET).add(null));
    }
}