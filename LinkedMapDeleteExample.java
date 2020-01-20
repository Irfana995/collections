package collections;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
public class LinkedMapDeleteExample 
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		LinkedHashMap<String,Integer> treemaplist  = new LinkedHashMap<String,Integer>();
		System.out.println("Enter the number of inputs");
		int n=Integer.parseInt(obj.readLine());
		System.out.println("Enter the items");
		for(int i=0;i<n;i++)
		{
		 
			String name=obj.readLine();
			int age=Integer.parseInt(obj.readLine());
			treemaplist.put(name, age);//adding values into the tree map
		}
		System.out.println(treemaplist); 
		System.out.println("Enter the index to be removed:");
		String index=obj.readLine();
		treemaplist.remove(index);//removing a user defined index value
		System.out.println("After the deletion");
		System.out.println(treemaplist); 
		System.out.println("Enter the index to be added:");
		String index1=obj.readLine();
		System.out.println("Enter the value to be added:");
		int age2=Integer.parseInt(obj.readLine());
		treemaplist.put(index1,age2);//adding the values into tree map
		System.out.println("After the deletion");
		System.out.println(treemaplist);
   }
}

