import java.util.*;

class prog7

{
	public static void main(String args[])
	
	{
	Scanner sc=new Scanner(System.in);
	double a,b,c,d,e,sum,avg;
	System.out.println("Enter marks of 5 subject ");
	a=sc.nextDouble();
	b=sc.nextDouble();
	c=sc.nextDouble();
	d=sc.nextDouble();
	e=sc.nextDouble();
	sum= a+b+c+d+e;
	
	//System.out.println("sum of 5 is = "+sum);
	avg=sum/5;
	System.out.println("Average of 5 is = "+avg+"sum "+sum);
	
	
	
		
	}
}