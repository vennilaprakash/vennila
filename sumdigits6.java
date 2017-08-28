import java.util.Scanner;

public class sumdigits6 {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		String str;
		System.out.println("Enter the String");
		str=input.next();
		System.out.println(" "+sumdigits(str));
	}
		
		

		private static int sumdigits(String str) {
			int i,flag=0,sum=0;
			char s[]=str.toCharArray();
			for(i=0;i<str.length();i++)
			{
				if(Character.isDigit(s[i]))
				{
					String s1=s[i]+"";
					int val=Integer.parseInt(s1);
					sum=sum+val;
				}
		     }
			if(sum==0)
				return 0;
			else
				return sum;
	}
		

}
