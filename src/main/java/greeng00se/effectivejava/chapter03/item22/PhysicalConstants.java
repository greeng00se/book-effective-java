package greeng00se.effectivejava.chapter03.item22;

public enum PhysicalConstants {
    AVOGADROS_NUMBER(6.022_140_857e23),
    BOLTZMANN_CONSTANT(1.380_648_52e-23),
    ELECTRON_MASS(9.109_383_56e-31);

    private double value;

    PhysicalConstants(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
