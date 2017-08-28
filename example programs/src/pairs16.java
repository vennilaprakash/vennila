import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class pairs16 {
public static void main(String args[])
{
	Scanner input=new Scanner(System.in);
	int n,i;
	System.out.println("Enter the number of elements");
	n=input.nextInt();
	String arr[]=new String[n];
	for(i=0;i<n;i++)
	  arr[i]=input.next();
	
	HashMap<String,String> hashmap1=new HashMap<String,String>();
	hashmap1=(HashMap<String, String>) pairs(arr);
	for(Map.Entry m:hashmap1.entrySet())
	{
		System.out.print(m.getKey()+":"+m.getValue()+"   ");
	}
	
  }

private static Map pairs(String[] arr) {
	HashMap<String,String> hashmap=new HashMap<String,String>();
	for(int i=0;i<arr.length;i++)
	{
		
	   hashmap.put(String.valueOf(arr[i].charAt(0)),String.valueOf(arr[i].charAt(arr[i].length()-1)));
	}
	
	return hashmap;
}
	
}
