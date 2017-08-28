import java.util.Scanner;

public class moreonefour9 {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int choice,i;
		System.out.println("Enter the number of elements");
		choice=input.nextInt();
		int arr[]=new int[choice];
		for(i=0;i<choice;i++)
			arr[i]=input.nextInt();
		System.out.println(" "+more14(arr));
	}
		
		private static boolean more14(int[] arr) {
			int i,count=0,count1=0;
			for(i=0;i<arr.length;i++)
			{
				if(arr[i]==1)
					count++;
				else if(arr[i]==4)
					count1++;
		
		     }
			if(count>count1)
				return true;
			else
				return false;
	}
		

}
