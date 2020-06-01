public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(2.3, " /  ", -2);
        System.out.printf("%.2f", calculator.calculate());
    }
}
