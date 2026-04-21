package com.quantity;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.quantity.model.LengthUnit;
import com.quantity.model.QuantityLength;

public class FeetTest {

    @Test
    void testFeetToFeet() {
        assertTrue(
            new QuantityLength(1, LengthUnit.FEET)
            .equals(new QuantityLength(1, LengthUnit.FEET))
        );
    }

    @Test
    void testFeetToInches() {
        assertTrue(
            new QuantityLength(1, LengthUnit.FEET)
            .equals(new QuantityLength(12, LengthUnit.INCHES))
        );
    }

    @Test
    void testYardToFeet() {
        assertTrue(
            new QuantityLength(1, LengthUnit.YARDS)
            .equals(new QuantityLength(3, LengthUnit.FEET))
        );
    }

    @Test
    void testYardToInches() {
        assertTrue(
            new QuantityLength(1, LengthUnit.YARDS)
            .equals(new QuantityLength(36, LengthUnit.INCHES))
        );
    }

    @Test
    void testCentimeterToInches() {
        assertTrue(
            new QuantityLength(1, LengthUnit.CENTIMETERS)
            .equals(new QuantityLength(0.393701, LengthUnit.INCHES))
        );
    }

    @Test
    void testDifferentValues() {
        assertFalse(
            new QuantityLength(1, LengthUnit.YARDS)
            .equals(new QuantityLength(2, LengthUnit.FEET))
        );
    }
}