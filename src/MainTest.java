import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void subtractionVerified() {
        int result = Main.subtraction(10, 5);
        assertEquals(5, result);
    }

    @Test
    void subtractionUnverified() {
        int result = Main.subtraction(10, 4);
        assertEquals(8, result);
    }

    @Test
    void multiplicationVerified() {
        int result = Main.multiplication(5, 2);
        assertEquals(10, result);
    }

    @Test
    void multiplicationUnverified() {
        int result = Main.multiplication(5, 3);
        assertEquals(10, result);
    }
}