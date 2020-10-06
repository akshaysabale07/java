interface StudentFee 
{
    	 
    	void getFee();
	
}
     
    class Student implements StudentFee
    {
    	public void getFee()
    	{
    		Scanner scanner = new Scanner(System.in);
    		
    		String name = scanner.next();
    		
    		float fee = scanner.nextFloat();
    		
    		if(fee<0)
    		{
    			throw new ArithmeticException("Invalid FeeException");  
    		}
    		else
    		{
    			System.out.println("Fee is right = "+fee);
    		}
    	}
    }
     

public class ExceptionDemo5 {

	public static void main(String[] args) {

		
		 StudentFee s1 = new Student();
		 
		 s1.getFee();
		 
	}
}