public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperator, int secondOperator, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperator+ secondOperator;
            case SUBTRACTION:
                return firstOperator- secondOperator;
            case MULTIPLICATION:
                return firstOperator* secondOperator;
            case DIVISION:
                if (secondOperator != 0)
                    return firstOperator/ secondOperator;
                else
                    throw new RuntimeException("Can not divide seconOperatory 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
