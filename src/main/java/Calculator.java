public class Calculator {

    public Number calculate(Number firstValue, String mathematicalOperation, Number secondValue) {
        if (firstValue == null || secondValue == null) {
            throw new IllegalArgumentException();
        }
        double doubleFirstValue = firstValue.doubleValue();
        double doubleSecondValue = secondValue.doubleValue();
        mathematicalOperation = mathematicalOperation.replaceAll(" ", "");
        if (mathematicalOperation.equals("/") && doubleSecondValue == 0) {
            throw new IllegalArgumentException();
        }
        switch (mathematicalOperation) {
            case ("*"):
                if (firstValue.intValue() == doubleFirstValue
                        && secondValue.intValue() == doubleSecondValue) {
                    return firstValue.intValue() * secondValue.intValue();
                }
                return doubleFirstValue * doubleSecondValue;
            case ("+"):
                if (firstValue.intValue() == doubleFirstValue
                        && secondValue.intValue() == doubleSecondValue) {
                    return firstValue.intValue() + secondValue.intValue();
                }
                return doubleFirstValue + doubleSecondValue;
            case ("-"):
                if (firstValue.intValue() == doubleFirstValue
                        && secondValue.intValue() == doubleSecondValue) {
                    return firstValue.intValue() - secondValue.intValue();
                }
                return doubleFirstValue - doubleSecondValue;
            case ("/"):
                if (firstValue.intValue() == doubleFirstValue
                        && secondValue.intValue() == doubleSecondValue) {
                    return firstValue.intValue() / secondValue.intValue();
                }
                return doubleFirstValue / doubleSecondValue;
            default:
                throw new ArithmeticException();
        }
    }
}
