import java.util.Arrays;
import java.util.Scanner;

public class centeredavg10 {
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	int n, i;
	System.out.println("Enter the number of elements");
	n = input.nextInt();
	int arr[] = new int[n];
	for (i = 0; i < n; i++)
		arr[i] = input.nextInt();
	Arrays.sort(arr);
	centeredavg(arr);

}

private static void centeredavg(int[] arr) {

	int sum=0, i,count=0;
	for (i = 1; i < arr.length-1; i++) {
		sum=sum+arr[i];
		count++;
		
		}
	System.out.println("" + (sum/count));
	}
}

