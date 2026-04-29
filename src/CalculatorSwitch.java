//Simple calculator using swich

public class CalculatorSwitch {
    static void main(String[] args) {
        int num1=20,num2=5;
        char operator='/';
        switch (operator) {
            case '+':
                num1=num1+num2;
                break;
                case '-':
                    num1=num1-num2;
                    break;
                 case '^':
                 num1=num1^num2;
                   break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result = " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                    System.out.println("Invalid Operator");
        }
    }
}
