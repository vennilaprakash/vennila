import java.util.Scanner;

public class pairstair12 {
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
			for(i=0;i<str.length()-1;i++)
			{
				if(str.charAt(i)==str.charAt(i+1))
				{
					st=st+str.charAt(i)+"*";
				}
				else
				{
					st=st+str.charAt(i);
					
				}
				
	 }
			st=st+str.charAt(str.length()-1);
			return st;
			
		}

}
