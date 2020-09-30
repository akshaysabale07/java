import java.util.Scanner;
class prog30{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		//Take user ip
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter ele:");
				arr[i][j]=sc.nextInt();
			}
		}
	// show	
		for(int ar[]:arr)
		{
			for(int a:ar)
			{
			System.out.print(a+ " ");
			}
			System.out.println(" ");
	}
	// sum
	int sum=0;
	for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(j==i)
				{
					sum=sum+arr[i][j];
				}
			}
		}
	System.out.println(sum);
	
}
}