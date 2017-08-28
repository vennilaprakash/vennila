import java.util.Scanner;

public class array667 {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int choice,i;
		System.out.println("Enter the number of elements");
		choice=input.nextInt();
		int arr[]=new int[choice];
		for(i=0;i<choice;i++)
			arr[i]=input.nextInt();
		System.out.println(" "+calculatearr667(arr));
	}
		
		private static int calculatearr667(int[] arr) {
			int i,count=0;
			for(i=0;i<arr.length-1;i++)
			{
				if((arr[i]==6 && arr[i+1]==6)||(arr[i]==6 && arr[i+1]==7))
				{
					count++;
				}
		
		     }
			return count;
	}
		

}
