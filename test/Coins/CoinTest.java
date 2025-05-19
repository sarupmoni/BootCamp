package Coins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTest {
    @Test
    void getTails() {
        Coin coin = new Coin();
        assertEquals(0.5, coin.probabilityOfTails());
    }

    @Test
    void notGettingTails() {
        Coin coin = new Coin();
        assertEquals(0.5, coin.probabilityOfNoTails());
    }
}