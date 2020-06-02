public class main {
    public static void main(String[] args) {
        System.out.println(pop(1, 1));
    }

    public static Number pop(Number one, Number two) {
        if (one.doubleValue() == one.intValue()) {
            return one.intValue() + two.intValue();
        }
        return null;
    }
}
