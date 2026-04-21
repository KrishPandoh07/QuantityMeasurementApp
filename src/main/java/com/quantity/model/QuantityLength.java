package com.quantity.model;

public class QuantityLength {

    private final double value;
    private final LengthUnit unit;

    public QuantityLength(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    private double toFeet() {
        return value * unit.getConversionFactor();
    }

    public static double convert(double value,
                                 LengthUnit source,
                                 LengthUnit target) {

        if (!Double.isFinite(value) ||
            source == null ||
            target == null) {
            throw new IllegalArgumentException("Invalid input");
        }

        double valueInFeet =
                value * source.getConversionFactor();

        return valueInFeet /
                target.getConversionFactor();
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null ||
            getClass() != obj.getClass())
            return false;

        QuantityLength other =
                (QuantityLength) obj;

        return Double.compare(
                this.toFeet(),
                other.toFeet()) == 0;
    }
}