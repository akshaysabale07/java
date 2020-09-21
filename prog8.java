import java.util.*;

class prog8

{
	public static void main(String args[])
	
	{
	Scanner sc=new Scanner(System.in);
	double p,n,r,i;
	System.out.println("Enter values of principle,rate, Amount");
	p=sc.nextDouble();
	n=sc.nextDouble();
	r=sc.nextDouble();
	i=p*n*r/100;
	System.out.println("simple interest is  = "+i);
	
	
	
		
	}
}