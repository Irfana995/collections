package linkedList;
import java.util.*;
public class LinkedListExample2 
{
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);	
		int n=S.nextInt();
		LinkedList<String> list=new LinkedList<String>();
		for(int i=0;i<n;i++)
		{
			String str=S.next();
			list.add(str);
		}
		int m=S.nextInt();
		ArrayList<String >list1=new ArrayList<String>();
		for(int j=0;j<m;j++)
		{
			String str1=S.next();
			list1.add(str1);
		}
		System.out.println("Actual LinkedList: "+list);
		list.addAll(list1);
		System.out.println("After Copy: "+list);
		
	}
}
