package Units;

import java.util.Objects;

public class Length {
    private final double unit;

    private Length(double unit) {
        this.unit = unit;
    }

    public static Length unit(int value) {

        return new Length(value);
    }
//Unit.createFeet(12)
    public static Length inchToFeet(double value) {
        Length length = createLength(value, 12);

        return length;
    }

    public static Length cmToFeet(double value) {
        Length length = createLength( value , 30);

        return length;
    }

    public static Length mmToFeet(double value) {
        Length length = createLength( value, 300);

        return length;
    }

    private static Length createLength(double value, int divisor) {
        Length length = new Length(value / divisor);

        return length;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(unit, length.unit) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(unit);
    }

    public boolean compare(Length otherUnit) {
        return Objects.equals(unit, otherUnit.unit);
    }

    public Length add(Length otherUnit) {
        return new Length(unit + otherUnit.unit);
    }
}
