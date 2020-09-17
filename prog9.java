import java.util.*;

class prog9

{
	public static void main(String args[])
	
	{
	Scanner sc=new Scanner(System.in);
	int m,year,week,month;
	System.out.println("Enter numbers od days ");
	m=sc.nextInt();
	year=m/365;
	m=m%365;
	System.out.println("Number of years = "+year);
	month=m/12;
	
	System.out.println("Number of months= "+month);
	month=m%12;
	week=m/7;
	System.out.println("Number of week = "+week);
	
	
	
	
		
	}
}