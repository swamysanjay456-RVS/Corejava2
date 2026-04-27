// Variable swap without temp
public class Swap {
   public static void main(String[] args)
   {
int a=45,b=78;



System.out.println("Before swaping:");
       System.out.println("a=" +a);
       System.out.println("b=" +b);
       // Swap values without temp
       a= a + b; // 123
       b= a - b; // 123-78 = 45
       a= a - b;  // 123-45 = 78
       System.out.println("After swaping:");
       System.out.println("a=" +a);
       System.out.println("b=" +b);

   }
}