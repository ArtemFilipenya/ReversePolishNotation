import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePolishNotationCalculatorTest {

    public static ReversePolishNotationCalculator reversePolishNotationCalculator;

    @BeforeAll
    public static void beforeAll() {
        reversePolishNotationCalculator = new ReversePolishNotationCalculator();
    }

    @Test
    public void shouldSupportThePlusOperation() {
        assertEquals(7, reversePolishNotationCalculator.calculatePolishNotation("4 3 +"));
    }

    @Test
    public void shouldSupportTheMinusOperation() {
        assertEquals(1, reversePolishNotationCalculator.calculatePolishNotation("4 3 -"));
    }

    @Test
    public void shouldSupportTheMultiplicationOperation() {
        assertEquals(12, reversePolishNotationCalculator.calculatePolishNotation("4 3 *"));
    }

    @Test
    public void mustSupportCalculationsWithExtraSpaces() {
        assertEquals(7, reversePolishNotationCalculator.calculatePolishNotation("4 3    +"));
    }
}