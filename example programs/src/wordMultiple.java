import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class wordMultiple {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the number of elements");
		n=input.nextInt();
		String arr[]=new String[n];
		for(i=0;i<n;i++)
		  arr[i]=input.next();
		
		HashMap<String,Boolean> hashmap1=new HashMap<String,Boolean>();
		hashmap1=(HashMap<String, Boolean>) wordMultiple(arr);
		for(Map.Entry m:hashmap1.entrySet())
		{
			System.out.print(m.getKey()+":"+m.getValue()+"   ");
		}
		
	  }

	private static Map wordMultiple(String[] arr) {
		HashMap<String,Boolean> hashmap=new HashMap<String,Boolean>();
		for(int i=0;i<arr.length;i++)
		{
			if(hashmap.containsKey(arr[i]))
			{
				hashmap.put(arr[i],true);
				
			}
			else
			{
				hashmap.put(arr[i],false);
			}
			
		}
		
		return hashmap;
		
		
	}


}
