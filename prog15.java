import java.util.*;
class prog15{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Gender");
		char gender = sc.next().charAt(0);
		System.out.println("Enter the Age");
		int age= sc.nextInt();
		if(((gender=='m') && (age >=21))||((gender=='f') && (age >=18)))
		{
			System.out.println("Person is eligible for marriage");
		}
		else
		{
			System.out.println("Person is Not eligible for marriage");
		}		
	}
}


