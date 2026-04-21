package com.quantity;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.quantity.model.Feet;
import com.quantity.service.EqualityService;

public class FeetTest {

    @Test
    void testEquality_SameValue() {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);

        assertTrue(EqualityService.areEqual(f1, f2));
    }

    @Test
    void testEquality_DifferentValue() {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(2.0);

        assertFalse(EqualityService.areEqual(f1, f2));
    }

    @Test
    void testEquality_SameReference() {
        Feet f1 = new Feet(1.0);

        assertTrue(EqualityService.areEqual(f1, f1));
    }
}