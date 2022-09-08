package oops_concept;

public class This_key 
{
 int fees = 20000;
 String name = "Hasan";
 
 void pay(int bus_fee,int hostel_fee)
 {
	 int fees = 10000;
	 
	System.out.println (fees + this.fees + hostel_fee + bus_fee);
	
 }
 
 
   public static void main(String args [])
   {
	   This_key F1 = new This_key();
	            F1.pay(4000, 40000);
   }
}
