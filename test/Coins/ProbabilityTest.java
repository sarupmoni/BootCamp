package Coins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {

    @Test
    void isValid() {
      assertThrows(RuntimeException.class, () -> Probability.createProbability(3.1));
      assertThrows(RuntimeException.class, () -> Probability.createProbability(-3.1));
    }

    @Test
    void complement() {
        assertEquals(Probability.createProbability(0.75), Probability.createProbability(0.25).complement());
        assertEquals(Probability.createProbability(0.5), Probability.createProbability(0.5).complement());
        assertEquals(Probability.createProbability(0.5), Probability.createProbability(0.25).and(Probability.createProbability(0.25)).complement());
    }


    @Test
    void and() {
        assertEquals(Probability.createProbability(0.25), Probability.createProbability(0.5).and(Probability.createProbability(0.5)));
    }
}