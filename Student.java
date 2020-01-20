package Arraylist;

import java.util.*;

public class Student 
{
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		ArrayList<Integer> obj=new ArrayList<Integer>();
		System.out.println("Enter the number of subjects:");
		int n=S.nextInt();
		System.out.println("Enter the marks");
		int m;
		for(int i=0;i<n;i++)
		{
			m=S.nextInt();
			obj.add(m);
		}
		System.out.println(obj);
		ArrayList<Integer> obj1=(ArrayList<Integer>)obj.clone();
		Collections.sort(obj1);
		System.out.print(obj1);
		S.close();
	}
}
