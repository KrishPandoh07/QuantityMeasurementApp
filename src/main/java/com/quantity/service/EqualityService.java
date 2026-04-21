package com.quantity.service;

import com.quantity.model.Feet;

public class EqualityService {

    public static boolean areEqual(Feet value1, Feet value2) {
        return value1.getValue() == value2.getValue();
    }
}