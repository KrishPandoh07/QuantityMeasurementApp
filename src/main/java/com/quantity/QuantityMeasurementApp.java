package com.quantity;

import com.quantity.model.Feet;
import com.quantity.service.EqualityService;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Feet value1 = new Feet(1.0);
        Feet value2 = new Feet(1.0);

        boolean result = EqualityService.areEqual(value1, value2);

        System.out.println("Equal: " + result);
    }
}