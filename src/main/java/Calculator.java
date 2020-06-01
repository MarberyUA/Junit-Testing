public class Calculator {
    private Double firstValue;
    private String mathematicalOperation;
    private Double secondValue ;

    public Calculator() {

    }

    public Calculator(Number firstValue, String mathematicalOperation, Number secondValue) {
        this.firstValue = firstValue.doubleValue();
        this.mathematicalOperation = mathematicalOperation.replaceAll(" ", "");
        this.secondValue = secondValue.doubleValue();
    }

    public Number getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(Number firstValue) {
        this.firstValue = firstValue.doubleValue();
    }

    public String getMathematicalOperation() {
        return mathematicalOperation;
    }

    public void setMathematicalOperation(String mathematicalOperation) {
        this.mathematicalOperation = mathematicalOperation.replaceAll(" ", "");
    }

    public Number getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(Number secondValue) {
        this.secondValue = secondValue.doubleValue();
    }

    public Double calculate() {
        if (firstValue == null || (secondValue == null || secondValue == 0)) {
            return null;
        }
        switch (mathematicalOperation) {
            case ("*"):
                return firstValue * secondValue;
            case ("+"):
                return firstValue + secondValue;
            case ("-"):
                return firstValue - secondValue;
            case ("/"):
                return firstValue / secondValue;
            default:
                return null;
        }
    }
}
