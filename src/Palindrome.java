//Palinrome number check

public class Palindrome {
    static void main(String[] args) {
        int n=1221;
        int reverse=0;
        int original=n;
        for(;n>0;n/=10){
            int temp=n%10;
            reverse=reverse*10+temp;

        }
        System.out.println("original="+original);
        System.out.println("reverse="+reverse);
        if(original==reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
