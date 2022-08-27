package oops_concept;

public class Inheri_tance
{
	public static void main( String arg [])
	{
		//Inheri_tance obj =new Inheri_tance();
	Number_lcm heritance=new Number_lcm();
	           heritance.gcd_1();
	           heritance.trianle();
	           heritance.lcm_1();		             
	}
	//abstract void run();
	final int a=99;
	
final public void trianle()
	 {
	  int n=10;
	  for(int row=1;row<=n;row++)
	   {
	     for(int space=n;space>=row;space--)
	     {
		  System.out.print("  ");   
	     }
	     for(int star=1;star<=row;star++)
	     {
		    System.out.print("=   ");   
	     }
	    System.out.println();
	   }
     }
}
	


class Number_gcd extends Inheri_tance
{	
	public void gcd_1()
	  {
	   int a=3;
	   int b=9;
	   int c=21;
	   int gcd=0;
	   int small=1;
	   if(a>b && a>c) 
	   {
		small=b;   
	   }
	   else if(b>c && b>a)
	   {
		small=c;   
	   }
	   else
		   small=a;
	   
	   System.out.println(small+" is the smallest,out of given numbers");
	   
	   for(int i=2;i<=small;i++)  //(2<=3)
	   {
		 if(a%i==0 && b%i==0 && c%i==0) 
		 {
		  gcd=i;	 
		 }
	   }
	   System.out.println(gcd+" is the gcd for given numbers");
	  }
}




class Number_lcm extends Number_gcd
{
public void lcm_1()
{
	   int x=20;
	   int y=45;
	   int z=50;
	   int lcm=0;
	   int large=1;
	    if(x>y && x>z) 
	    {
		 large=x;    
	    }
	    else if(y>z && y>x)
	    {
	     large=y;	
	    }
	    else 
	    	large=z;
	    
	    System.out.println(large+" is the largest,out of given numbers");
	    
	    for(int i=large;true;i++)
	    {
	     if(i%x==0 && i%y==0 && i%z==0)	
	     {
	    	 lcm=i;
	    	 System.out.println(lcm+" is the lcm for given  numbers");
	    	 break;
	     }
	    }  
	  }
}

