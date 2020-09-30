import java.util.Scanner;
class prog26{
   
   public static void main(String argc[])
   {
	   int a[]={10,15,33,46};
	   int b[]={55,67,25,39};
	   int c[]={9,10,11,12};
	   int d[]={3,4,5,6};
	   int e[]={17};
	   
		int size=5,sum=0;
		int arr[][]=new int[size][];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		arr[3]=d;
		arr[4]=e;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				sum=arr[i][j]+sum;
			}
			
		}
		System.out.println(sum);
		
   }
}