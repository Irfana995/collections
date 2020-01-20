package collections;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.*;

public class CompareToMain 
{
	public static void main(String args[])
	{
		int n,i;
		String name;
		int age;
		Scanner S=new Scanner(System.in);
		n=S.nextInt();
		TreeSet<Employee> hashset=new TreeSet<Employee>();
		Employee[]emp=new Employee[n];
		for(i=0;i<n;i++)
		{
			name=S.next();
			age=S.nextInt();
			emp[i]=new Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			hashset.add(emp[i]);
		}
		for(Employee e:hashset)
		{
			System.out.println(e.getName()+" "+e.getAge());
		}
		S.close();
	}

}
