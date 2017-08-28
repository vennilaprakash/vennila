import java.util.Scanner;

public class Pattern271 {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int choice,i;
		System.out.println("Enter the number of elements");
		choice=input.nextInt();
		int arr[]=new int[choice];
		for(i=0;i<choice;i++)
			arr[i]=input.nextInt();
		System.out.println(" "+pattern271(arr));
	}
		
		private static boolean pattern271(int[] arr) {
			int i,flag=0;
			for(i=0;i<arr.length-1;i++)
			{
				if((arr[i]==2 && arr[i+1]==7&&arr[i+2]==1))
				{
					flag=1;
				}
		
		     }
			if(flag==1)
				return true;
			else
				return false;
	}
		

	}

