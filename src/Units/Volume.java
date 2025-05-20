package Units;

import java.util.Objects;

public class Volume {
    public static final double conversionFactor = 3.78;
    private final double unit;

    public Volume(double unit) {
        this.unit = unit;
    }

    public static Volume gallonToLiter(double value) {
        Volume volume = createVolume(value);

        return volume;
    }

    private static Volume createVolume(double value) {
        Volume volume = new Volume(value * conversionFactor);

        return volume;
    }

    public static Volume liter(double value) {
        return new Volume(value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume quantity = (Volume) o;
        return Double.compare(unit, quantity.unit) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(unit);
    }

    public boolean compare(Volume otherUnit) {
        return Objects.equals(unit, otherUnit.unit);
    }
}
