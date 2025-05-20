package Units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {
    @Test
    void compare() {
        Volume gallon = Volume.gallonToLiter(1);
        Volume liter = Volume.liter(3.78);
        Volume liter2 = Volume.liter(3);

        assert(gallon.compare(liter));
        assertFalse(gallon.compare(liter2));
    }
}