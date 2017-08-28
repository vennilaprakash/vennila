import java.util.Scanner;

public class mirrorends7 {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		String str;
		System.out.println("Enter the String");
		str=input.next();
		System.out.println(""+mirrorends(str));
	}
		
		

		private static String  mirrorends(String str) {
			int i,j;
			String st="";
			int len=str.length();
			StringBuilder val=new StringBuilder(str);
			String rev=val.reverse().toString();
			if(str.equals(rev))
				return str;
			else
			{
			for(i=0,j=len-1;i<len/2;i++,j--)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					st=st+str.charAt(i);
				}
		 }
			}
			return st;
			
		}

}
