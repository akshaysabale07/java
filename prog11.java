import java.util.*;

class prog11

{
	public static void main(String args[])
	
	{
	Scanner sc=new Scanner(System.in);
      int x,y;
	  
	System.out.println("Enter x ");
	x=sc.nextInt();
	System.out.println("Enter y");
	y=sc.nextInt();
	

	System.out.println("before swapping  x is  "+x+" y is"+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("After  swapping  x is  "+x+" y is  "+y);
	

	
	
	
	
		
	}
}