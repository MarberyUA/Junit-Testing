import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Test
    public void isValidOperation() {
        calculator = new Calculator();
        calculator.setFirstValue(1);
        calculator.setSecondValue(2.32);
        calculator.setMathematicalOperation(" +- ");
        Assert.assertEquals(null, calculator.calculate());
    }

    @Test
    public void isTwoValuesSet() {
        calculator = new Calculator();
        calculator.setSecondValue(2323.11);
        try {
            Assert.assertEquals(null, calculator.calculate());
        } catch (NullPointerException e) {
            Assert.fail("The method calculate should not throw an exception");
        }
    }

    @Test
    public void isDivisionByZeroNotThrowAnError() {
        calculator = new Calculator();
        calculator.setFirstValue(225.1);
        calculator.setMathematicalOperation("/ ");
        calculator.setSecondValue(0);
        try {
            Assert.assertEquals(null, calculator.calculate());
        } catch (ArithmeticException e) {
            Assert.fail("The method calculate should not throw an exception");
        }
    }
}
