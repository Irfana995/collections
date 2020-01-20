package set;
import java.util.*;
class setExample
{
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		int x;
		HashSet<Integer> l1=new HashSet<Integer>();
		for(int i=0;i<n;i++)
		{
			x=S.nextInt();
			l1.add(new Integer(x));
		}
		int m=S.nextInt();
		x=S.nextInt();
		HashSet<Integer>l2=new HashSet<Integer>();
		for(int j=0;j<m;j++)
		{
			x=S.nextInt();
			l2.add(new Integer(x));
		}
		HashSet<Integer>l3=new HashSet<Integer>(l1);
		l3.addAll(l2);//union
		HashSet<Integer>l4=new HashSet<Integer>(l2);
		l4.retainAll(l2);//intersection
		System.out.println(l3);
		System.out.println(l4);
		HashSet<Integer>l5=new HashSet<Integer>(l1);
		l4.removeAll(l2);//Symmetric difference
		System.out.println(l5);
	}
}
