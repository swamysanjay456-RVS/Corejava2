// Grade Classifier

import java.util.Scanner;

public class Grade {
    static void main(String[] args) {
        int Marks=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks:");
        Marks=sc.nextInt();
        if(( Marks == 100) && (Marks >= 90))
        {
            System.out.println("Outstanding Marks:");
        }
else if (Marks >= 75 && Marks <= 89)
{
            System.out.println("Grade A  ");

    }  else if (Marks >= 60 && Marks <= 74) {
            System.out.println("Grade B");
        }
        else if (Marks >= 45 && Marks <= 59) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Fail");
        }

        sc.close();
    }
}