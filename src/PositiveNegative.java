// Positive, Negative, or Zero Classifier with Count

public class PositiveNegative {
    public static void main(String[] args) {
        int n1= -5,n2=12,n3=0,n4=-3,n5=8,n6=0,n7=15,n8=-9,n9=4,n10=0;
int positivecount=0;
int negativecount=0;
int zerocount=0;
        for (int i = 1; i <= 10; i++) {
            int num=0;
            if(i==1) num=1;
            if(i==2) num=2;
            if(i==3) num=3;
            if(i==4) num=4;
            if(i==5) num=5;
            if(i==6) num=6;
            if(i==7) num=7;
            if(i==8) num=8;
            if(i==9) num=9;
            if(i==10) num=10;
            if(num>0) {
                System.out.println(num + " is Positive");
            positivecount++;
            }
            else if(num<0)
            {
                System.out.println(num + " is Negative");
            }
            else
            {
            zerocount++;
                System.out.println(num + " is zero");
        }
    }
}
}