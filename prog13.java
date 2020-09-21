import java.util.*;

class prog13

{
	public static void main(String args[])
	
	{
	Scanner sc=new Scanner(System.in);
      int a,b,c;
	  
	System.out.println("Enter A ");
	a=sc.nextInt();
	
	System.out.println("Enter B");
	b=sc.nextInt();
	System.out.println("Enter C ");
	c=sc.nextInt();
	
	if(a>b && a>c)
	{
	System.out.println("A is greater "+a);
	}
	
	String r=(b>a && b>c) ? " b is greater":"c is greater";
	System.out.println(r);
	
	
	

	
	
		
	}
}