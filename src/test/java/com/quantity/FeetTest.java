package com.quantity;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.quantity.model.LengthUnit;
import com.quantity.model.QuantityLength;

public class FeetTest {

    @Test
    void testEquality_FeetToFeet_SameValue() {
        QuantityLength q1 =
                new QuantityLength(1.0, LengthUnit.FEET);

        QuantityLength q2 =
                new QuantityLength(1.0, LengthUnit.FEET);

        assertTrue(q1.equals(q2));
    }

    @Test
    void testEquality_InchToInch_SameValue() {
        QuantityLength q1 =
                new QuantityLength(1.0, LengthUnit.INCHES);

        QuantityLength q2 =
                new QuantityLength(1.0, LengthUnit.INCHES);

        assertTrue(q1.equals(q2));
    }

    @Test
    void testEquality_FeetToInch_Equivalent() {
        QuantityLength q1 =
                new QuantityLength(1.0, LengthUnit.FEET);

        QuantityLength q2 =
                new QuantityLength(12.0, LengthUnit.INCHES);

        assertTrue(q1.equals(q2));
    }

    @Test
    void testEquality_DifferentValues() {
        QuantityLength q1 =
                new QuantityLength(1.0, LengthUnit.FEET);

        QuantityLength q2 =
                new QuantityLength(2.0, LengthUnit.FEET);

        assertFalse(q1.equals(q2));
    }
}