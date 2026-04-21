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

        if (other == null) {
            throw new IllegalArgumentException("Null operand");
        }

        double sumInFeet =
                this.toFeet() + other.toFeet();

        double resultValue =
                sumInFeet / this.unit.getConversionFactor();

        return new QuantityLength(resultValue, this.unit);
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