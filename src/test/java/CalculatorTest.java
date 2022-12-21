import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class CalculatorTest {
        Calculator calculator = new Calculator();

        @Test
        void add() {
            assertEquals(3, calculator.add(2, 1));
        }

        @Test
        void dif() {
            assertEquals(4, calculator.dif(6, 2));
        }

        @Test
        void div() {
            assertEquals(3, calculator.div(6, 2));
        }

        @Test
        void times() {
            assertEquals(4, calculator.times(2, 2));
        }
    }

