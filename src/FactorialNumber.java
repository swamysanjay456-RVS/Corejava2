//Factorial of a number

public class FactorialNumber {
    public static void main(String[] args) {
        int n=10;
        int result=1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            System.out.println("Factorial of " + i + " is " + result);
        }
    }
}
