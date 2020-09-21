import java.util.*;

class prog12

{
	public static void main(String args[])
	
	{
	Scanner sc=new Scanner(System.in);
      double sal,da,hra,da1,hra1,gsal;
	  
	System.out.println("Enter basic salary");
	sal=sc.nextDouble();
	System.out.println("Enter DA");
	da1=sc.nextDouble();
		System.out.println("Enter HRA");
	hra1=sc.nextDouble();
	
	da=(da1*sal)/100;
	hra=(hra1*sal)/100;
	
	gsal=sal+da+hra;
	
	

	System.out.println(" Gross Salary is   "+gsal);
	
	
		
	}
}