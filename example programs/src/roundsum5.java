import java.util.Scanner;

public class roundsum5 {
	static int sum=0;
	public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	int i;
	int arr[]=new int[3];
	for(i=0;i<2;i++)
	   roundsum5(input.nextInt());
	System.out.println(roundsum5(input.nextInt()));
}
	
	private static int roundsum5(int val) {
		int rem,quotient;
		rem=val%10;
		quotient=val/10;
		if(rem>5)
			quotient=(quotient+1)*10;
		else if(rem<5)
			quotient=quotient*10;
		sum=sum+quotient;
		return sum;
		
		
		
 }
}
