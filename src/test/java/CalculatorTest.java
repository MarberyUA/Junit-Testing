import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test(expected = ArithmeticException.class)
    public void ifNotValidOperationThrowsAnError() {
        calculator.calculate(1, "+-", 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ifNotTwoValuesSetThrowsAnError() {
        calculator.calculate(null, "+", 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isDivisionByZeroThrowsAnError() {
        calculator.calculate(1, "/", 0);
    }

    @Test
    public void isMethodReturnIntWithIntArguments() {
        Assert.assertEquals(Integer.valueOf(1), calculator.calculate(1, "*", 1));
    }

    @Test
    public void isMethodReturnDoubleWithDoubleArguments() {
        Assert.assertEquals(Double.valueOf(2.5), calculator.calculate(1.25, "+", 1.25));
    }

    @Test
    public void isMethodReturnsDoubleWithOneDoubleAndOneInt() {
        Assert.assertEquals(Double.valueOf(2.3), calculator.calculate(1, "+", 1.3));
    }

    @Test
    public void isDivisionOperationWorksFine() {
        Assert.assertEquals(5, calculator.calculate(25, "  / ", 5));
    }

    @Test
    public void isPlusOperationWorksFine() {
        Assert.assertEquals(21.2500, calculator.calculate(20.2500, "  + ", 1));
    }

    @Test
    public void isMinusOperationWorksFine() {
        Assert.assertEquals(4.0, calculator.calculate(25.123, "  - ", 21.123));
    }

    @Test
    public void isMultiplicationOperationWorksFine() {
        Assert.assertEquals(25, calculator.calculate(5, "  * ", 5));
    }
}
