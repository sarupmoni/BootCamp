import org.junit.jupiter.api.Test;
import shapes.Rectangle;

import static org.junit.jupiter.api.Assertions.*;
class RectangleTest {
    @Test
    void area() {
        Rectangle rectangle1 = new Rectangle(2,3);
        Rectangle rectangle2 = new Rectangle(0,3);

        assertEquals(6, rectangle1.area());
        assertEquals(0, rectangle2.area());
    }

    @Test
    void perimeter() {
        Rectangle rectangle1 = new Rectangle(2,3);
        Rectangle rectangle2 = new Rectangle(0,3);

        assertEquals(10, rectangle1.perimeter());
        assertEquals(6, rectangle2.perimeter());
    }
}