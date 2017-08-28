import java.util.Scanner;

public class canBalance13 {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int choice,i;
		System.out.println("Enter the number of elements");
		choice=input.nextInt();
		int arr[]=new int[choice];
		for(i=0;i<choice;i++)
			arr[i]=input.nextInt();
		 System.out.println(""+canBalance(arr));
		
	}
		
	private static boolean  canBalance(int[] arr) {
			int i,sum=0,sum1=0;
			int len=arr.length/2;
			for(i=0;i<arr.length;i++)
			{
			  if(arr.length%2==0)
			  {
				  
			  if(i<len)
			  {
					sum=sum+arr[i];
			  }
			   else	  
			   {
					sum1=sum1+arr[i];
			   }
			  }
			else
			 {
				if(i<=len)
				{
					sum=sum+arr[i];
				}
			   else	
			   {
					sum1=sum1+arr[i];
			   }
			 }
			}
			if(sum==sum1)
				   return true;
			else
			    return false;
			
		}
}
