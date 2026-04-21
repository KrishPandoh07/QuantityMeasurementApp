package com.quantity.service;

import com.quantity.model.Feet;
import com.quantity.model.Inches;

public class EqualityService {

    public static boolean areEqual(Feet value1, Feet value2) {
        return value1.getValue() == value2.getValue();
    }

    public static boolean areEqual(Inches value1, Inches value2) {
        return value1.getValue() == value2.getValue();
    }
}