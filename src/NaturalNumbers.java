// Sum of N Natural numbers
public class NaturalNumbers {
    public static void main(String[] args) {
        int n=100;
        int sum=0;
        for (int i=1;i<=n;i++) {
            sum+=i;
            System.out.println("Sum of natural numbers from 1 to " + n + " = " + sum);

            if (sum % 2 == 0) {
                System.out.println("The result is Even");
            } else {
                System.out.println("The result is Odd");
        }
    }
    }
}

