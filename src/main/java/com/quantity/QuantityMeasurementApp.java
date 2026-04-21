package com.quantity;

import com.quantity.model.Feet;
import com.quantity.model.Inches;
import com.quantity.service.EqualityService;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(1.0);

        Inches inch1 = new Inches(1.0);
        Inches inch2 = new Inches(1.0);

        System.out.println("Feet Equal: " +
                EqualityService.areEqual(feet1, feet2));

        System.out.println("Inches Equal: " +
                EqualityService.areEqual(inch1, inch2));
    }
}