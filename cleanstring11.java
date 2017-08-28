import java.util.Scanner;

public class cleanstring11 {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		String str;
		System.out.println("Enter the String");
		str=input.next();
		System.out.println(""+stringclean(str));
	}
		
		

		private static String  stringclean(String str) {
			int i;
			String st="";
			for(i=1;i<str.length();i++)
			{
				if(str.charAt(i)==str.charAt(i-1))
				{}
				else
				{
					st=st+str.charAt(i-1);
					
				}
				
	 }
			st=st+str.charAt(str.length()-1);
			return st;
			
		}
}
