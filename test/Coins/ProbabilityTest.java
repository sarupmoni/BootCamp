package Coins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {

    @Test

    void isValid() {
      assertThrows(RuntimeException.class, () -> Probability.create(3.1));
      assertThrows(RuntimeException.class, () -> Probability.create(-3.1));
    }

    @Test
    void complement() {
        assertEquals(Probability.create(0.75), Probability.create(0.25).complement());
        assertEquals(Probability.create(0.5), Probability.create(0.5).complement());
        assertEquals(Probability.create(0.5), Probability.create(0.25).and(Probability.create(0.25)).complement());
    }

    @Test
    void and() {
        assertEquals(Probability.create(0.25), Probability.create(0.5).and(Probability.create(0.5)));
    }

    @Test
    void or() {
        assertEquals(Probability.create(0.75),Probability.create(0.5).or(Probability.create(0.5)));
    }
}