import Units.Length;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void compare() {
        Length feet = Length.unit(1);
        Length inch = Length.inchToFeet(12);
        assert(feet.compare(inch));

        Length inch2 = Length.inchToFeet(13);
        assertFalse(feet.compare(inch2));

        Length cm = Length.cmToFeet(5);
        Length inch3 = Length.inchToFeet(2);
        assert(cm.compare(inch3));
        assertFalse(cm.compare(inch));

        Length mm = Length.mmToFeet(50);
        assert(mm.compare(cm));
    }

    @Test
    void add() {
        Length inch1 = Length.unit(12);
        Length inch2 = Length.unit(12);
        Length expectedInch = Length.unit(24);
        Length actualInch = inch1.add(inch2);

        assert(Length.unit(24).compare(inch1.add(inch2)));
        assertEquals(expectedInch,actualInch);
    }
}