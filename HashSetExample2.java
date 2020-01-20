package set;
import java.util.*;
public class HashSetExample2 
{
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		HashSet<Integer> l1=new HashSet<Integer>();
		for(int i=0;i<n;i++)
		{
			int a=S.nextInt();
			l1.add(a);
		}
		System.out.println("numbers: "+l1);
		l1.remove(10);
		System.out.println("After remove(10): "+l1);
		Set<Integer> l2=new HashSet<Integer>();
		for(int i:l1)
		{
			for(int j=1;j<=i/2;j++)
			{
				if(j*j==i)
				{
					l2.add(i);
				}
			}
		}
		l1.removeAll(l2);
		System.out.println("After remove all(perfectSquares): "+l1);
		l1.clear();
		System.out.println("After clear(): "+l1);
	}
}
		