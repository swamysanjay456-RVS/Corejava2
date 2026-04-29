//Electricity bill calculator

public class BillCalculator {
    static void main(String[] args) {
       int units=250;
       double bill=0;
       if(units<=100)
       {
bill=units*1.50;
           System.out.println(units+" "+bill);
       }  else if (units <=101 && units >= 200 ) {
           bill = (100 * 1.50) + ((units - 100) * 2.50);
           System.out.println(units+" "+bill);
        } else if (units <=201 && units >=300) {

           bill = (100 * 1.50) + (100 * 2.50) + ((units - 200) * 4.0);
       }else if (units >300){
           bill = (100 * 1.50) + (100 * 2.50) + (100 * 4.0) + ((units - 300) * 6.0);
       }
        System.out.println("Total Bill Amount: "+bill);
        System.out.println("Total Units: "+units);
    }
}
