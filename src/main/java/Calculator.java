public class Calculator {
    private Double firstValue;
    private String mathematicalOperation;
    private Double secondValue;

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

    public void setFirstValue(Double firstValue) {
        this.firstValue = firstValue;
    }

    public String getMathematicalOperation() {
        return mathematicalOperation;
    }

    public void setMathematicalOperation(String mathematicalOperation) {
        this.mathematicalOperation = mathematicalOperation;
    }

    public Number getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(Double secondValue) {
        this.secondValue = secondValue;
    }

    public Double calculate() {
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
