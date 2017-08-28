import java.util.Arrays;
import java.util.Scanner;

public class ZeroFront8 {
public static void main(String args[])
{
	Scanner input=new Scanner(System.in);
	int choice,i;
	System.out.println("Enter the number of elements");
	choice=input.nextInt();
	int arr[]=new int[choice];
	for(i=0;i<choice;i++)
		arr[i]=input.nextInt();
	  int[] arr1=zerofront(arr);
	   for(i=0;i<arr1.length;i++)
		   System.out.print(arr1[i]+" ");
	
}
	
	private static int[] zerofront(int[] arr) {
		Arrays.sort(arr);
		int arr1[]=new int[arr.length];
		arr1=arr;
		return arr1;
	}
	
	    
	
}

