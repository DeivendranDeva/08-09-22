package oops_concept;

public class Abstract_child extends Abstarct_parent
{

	@Override
	protected void abs()
	{
		System.out.println("implement");// TODO Auto-generated method stub
		
	}
	public static void main(String args [])
	{
		Abstract_child o1 = new Abstract_child();
		               o1.tool();
		               o1.abs();
	}
	

}
