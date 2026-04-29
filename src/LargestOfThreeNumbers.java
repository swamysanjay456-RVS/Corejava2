// Largest of three numbers

public class LargestOfThreeNumbers {
    static void main(String[] args) {
        int a=54, b=89, c=73;
        if (a>b && a>c) {
            System.out.println("largest number" +a);
        }
            else if(b>c && b>a) {
                System.out.println("largest number" +b);
        }
                else {
                    System.out.println("largest number" +c);
            }
        }
    }

