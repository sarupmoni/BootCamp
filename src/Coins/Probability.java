package Coins;

import java.util.Objects;

public class Probability {
    private final double value;

    private Probability(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(value, that.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    static Probability create(double value) throws RuntimeException {
        if (value >= 0 && value <= 1 ) {
            return new Probability(value);
        }

        throw new RuntimeException("Invalid probability");
    }


    public Probability complement() {
        return new  Probability(1 - this.value);
    }

    public Probability and(Probability o) {
        double probability  = o.value * value;
        return  new Probability(probability);
    }

    public Probability or(Probability o) {
//        double probability = 1 - (o.value * value);
        double probability = 1 - and(o).value;
        return  new Probability(probability);
    }
}
