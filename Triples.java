import java.util.Scanner;

public class Triples {
	public static void main(String args[])
	{
		
		Scanner input=new Scanner(System.in);
		int choice,i;
		System.out.println("Enter the number of elements");
		choice=input.nextInt();
		int arr[]=new int[choice];
		for(i=0;i<choice;i++)
			arr[i]=input.nextInt();
		System.out.println(" "+noTriples(arr));
	}
		
		private static boolean noTriples(int[] arr) {
			int i,count=0,flag=0,temp=arr[0];
			for(i=0;i<arr.length-2;i++)
			{
				temp=arr[i];
				if(temp==arr[i+1]&&temp==arr[i+2])
				{
					flag=1;
					break;
				}
			}
			for(i=0;i<arr.length;i++)
			{
				temp=arr[i];
				for(int j=i;j<arr.length;j++)
				{
				  if(temp==arr[j])
				  {
					count++;
				  }
			  }
				if(count==3&&flag!=1)
					  flag=0;
				  
		
			}
			if(flag==1)
			   return false;
			else
				return true;
	        
		}
		
}


