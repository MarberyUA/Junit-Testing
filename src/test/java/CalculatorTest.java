import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test(expected = ArithmeticException.class)
    public void NotValidOperationThrowsAnError() {
        calculator.calculate(1, "+-", 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void IfNotTwoValuesSetThrowsAnError() {
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
}
