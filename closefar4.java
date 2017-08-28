import java.util.Scanner;

public class closefar4 {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the number of elements");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		if((Math.abs(a-b)==1||Math.abs(a-c)==1)&&(Math.abs(b-c)==1))
		{
			System.out.println("false");
		}
		else
			System.out.println("true");
		
		
	}
		
}
