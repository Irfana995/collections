package set;
import java.util.*;
public class TreeSet
{
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		HashSet<Integer> list=new HashSet<Integer>();
		for(int i=0;i<n;i++)
		{
			int a=S.nextInt();
			list.add(a);
		}
		HashSet<Integer> list1=new HashSet<Integer>();
		list1.addAll(list);
		System.out.println(list1);
	}
		
}
