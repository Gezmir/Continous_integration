import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(7, calculator.add(3,4));
        assertNotEquals(9,calculator.add(5,5));
    }

    @Test
    void subtraction() {
        assertEquals(2, calculator.subtract(3,1));
        assertNotEquals(9,calculator.subtract(5,5));
    }

    @Test
    void mult() {
        assertEquals(2, calculator.mult(2,1));
        assertNotEquals(9,calculator.mult(5,5));
    }

    @Test
    void div() {
        assertEquals(3, calculator.div(3,1));
        assertNotEquals(9,calculator.div(5,5));
        assertThrows(IllegalArgumentException.class, () -> calculator.div(12, 0));
    }



}