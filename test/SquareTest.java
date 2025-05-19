import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void area() {
        Square square2 = new Square(1);
        Square square1 = new Square(2);

        assertEquals(4, square1.area());
        assertEquals(1, square2.area());
    }

    @Test
    void perimeter() {
        Square square1 = new Square(2);
        Square square2 = new Square(1);

        assertEquals(8,square1.perimeter());
        assertEquals(4,square2.perimeter());
    }
}