//Bitwise even odd check

public class Bitwisecheck {
    static void main(String[] args) {
        int n=29,i=1;
        String Result=((n & 1)==0)? "even" : "odd";
        System.out.println(Result);
    }
}
