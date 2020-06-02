import org.junit.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test(expected = ArithmeticException.class)
    public void NotValidOperationThrowsAnError() {
        calculator.calculate(1, "+-", 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void IfNotTwoValuesSetThrowsAnError() {
        calculator.calculate(1, "+", 1);
        calculator.calculate(null, "+", 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isDivisionByZeroThrowsAnError() {
        calculator.calculate(1, "/", 0);
    }
}
