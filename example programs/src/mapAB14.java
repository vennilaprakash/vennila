import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapAB14 {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the number of elements to an string array");
		n=input.nextInt();
		String arr[]=new String[n];
		for(i=0;i<n;i++)
		  arr[i]=input.next();
		
		HashMap<String,String> hashmap1=new HashMap<String,String>();
		hashmap1=(HashMap<String, String>) mapAB(arr);
		for(Map.Entry m:hashmap1.entrySet())
		{
			System.out.print(m.getKey()+":"+m.getValue()+"   ");
		}
		
	  }

	private static Map mapAB(String[] arr) {
		HashMap<String,String> hashmap=new HashMap<String,String>();
		int ct=0,ct1=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals("b"))
			{
				hashmap.put(arr[i],"There");
				ct++;
			}
			else
			{
				hashmap.put(arr[i],"Hai");
				ct1++;
			}
			
		}
		if(ct==ct1)
			hashmap.put("ab","HiThere");
		
		return hashmap;
		
		
	}

}
