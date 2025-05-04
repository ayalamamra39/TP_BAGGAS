public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero and it s impossible");
        return a / b;
    }

    public String reverseString(String input) {
        return org.apache.commons.lang3.StringUtils.reverse(input);
    }
}
