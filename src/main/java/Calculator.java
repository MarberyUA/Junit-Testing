public class Calculator {

    public Double calculate(Number firstValue, String mathematicalOperation, Number secondValue) {
        if (firstValue == null || secondValue == null) {
            throw new IllegalArgumentException("");
        }
        Double doubleFirstValue = firstValue.doubleValue();
        Double doubleSecondValue = secondValue.doubleValue();
        mathematicalOperation = mathematicalOperation.replaceAll(" ", "");
        if (mathematicalOperation.equals("/") && doubleSecondValue == 0) {
            throw new IllegalArgumentException("");
        }
        switch (mathematicalOperation) {
            case ("*"):
                return doubleFirstValue * doubleSecondValue;
            case ("+"):
                return doubleFirstValue + doubleSecondValue;
            case ("-"):
                return doubleFirstValue - doubleSecondValue;
            case ("/"):
                return doubleFirstValue / doubleSecondValue;
            default:
                throw new ArithmeticException("");
        }
    }
}
