package testy1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
        // System.out.println("przed testem");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("po teście");
    }

    @Disabled // wyłączamy test
    @Test
    public void testAddMethod() {
        int a = 5;
        int b = 6;

        int result = calculator.add(a, b);
        assertEquals(11, result);
        //System.out.println("odpalam test 1");
    }

    @Test
    public void testAddWithBigNumbers() {
        int a = 2147483647;
        int b = 5;

        int result = calculator.add(a, b);
        assertNotEquals(11, result);
    }

    @Test
    public void shouldThrowExceptionWhenOverflow() {
        int a = 2147483647;
        int b = 5;

        try {
            int result = calculator.add(a, b);
        } catch (ArithmeticException e) {
            assertEquals("integer overflow", e.getMessage());
            return;
        }

        fail();
    }

    @Test
    public void shouldThrowExceptionWhenOverflowWithUnitAssertion() {
        int a = 2147483647;
        int b = 5;

        assertThrows(ArithmeticException.class,
                () -> calculator.add(a, b), "integer overflow");
    }

}
