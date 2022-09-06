package oops_concept;

public class Interface_child implements Interface_mother, Interface_parent{

	
	
	@Override
	public void run() {
		System.out.println("run");// TODO Auto-generated method stub
		
	}

	@Override
	public void walk() {
		System.out.println("walk");// TODO Auto-generated method stub
		
	}

	@Override
	public void jog() {
		System.out.println("jog");// TODO Auto-generated method stub
		
	}

	@Override
	public void drive() 
	{
	System.out.println("drive");	// TODO Auto-generated method stub
		
	}

	@Override
	public void cgg() {
		System.out.println("cgg");// TODO Auto-generated method stub
		
	}

	public static void main(String args [])
	{
		Interface_child C1 = new Interface_child();
		                C1.walk();
		                C1.run();
		                C1.jog();
		                C1.cgg();
		                C1.drive();
	}
 
}
