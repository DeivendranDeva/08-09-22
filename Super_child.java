package oops_concept;

public class Super_child extends Super_parent
{
 int currency = 20000;
 String property = "HOUSE";

 protected void Have()
 {
	System.out.println("Total amount is "+(currency + super.currency));
	System.out.println("Properties Gained are "+(property +" & "+super.property));
  	System.out.println("Farm"); 
  	super.Have();
 }
 
 
 public static void main(String args [])
 {
	 Super_child C1 = new Super_child();
	             C1.Have();  
 }
}
