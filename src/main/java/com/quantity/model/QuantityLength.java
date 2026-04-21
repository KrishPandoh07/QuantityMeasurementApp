package com.quantity.model;

public class QuantityLength {

    private final double value;
    private final LengthUnit unit;

    public QuantityLength(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public LengthUnit getUnit() {
        return unit;
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

        double feetValue =
                value * source.getConversionFactor();

        return feetValue /
                target.getConversionFactor();
    }

    public QuantityLength add(QuantityLength other) {
        return add(other, this.unit);
    }

    public QuantityLength add(QuantityLength other,
                              LengthUnit targetUnit) {

        if (other == null || targetUnit == null) {
            throw new IllegalArgumentException("Invalid input");
        }

        double sumFeet =
                this.toFeet() + other.toFeet();

        double result =
                sumFeet / targetUnit.getConversionFactor();

        return new QuantityLength(result, targetUnit);
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

    @Override
    public String toString() {
        return "Quantity(" + value + ", " + unit + ")";
    }
}