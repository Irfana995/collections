package Set1;
import java.util.*;
public class HashMapExample 
{
	
	public static void main(String args[])
	 {
	int n,i,key;
	String name;
	int age;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the no:of Employees");
	n=s.nextInt();
	HashMap<Integer,Employee> hashmap= new HashMap<Integer,Employee>();
	Employee[] emp=new Employee[n];
	System.out.println("Enter the name and age of Employees");

	for(i=0;i<n;i++)
	{  
	name=s.next();
	age=s.nextInt();
	emp[i]=new Employee();
	emp[i].setAge(age);
	emp[i].setName(name);
	hashmap.put(i,emp[i]);
	}

	for(Map.Entry<Integer,Employee>  m:hashmap.entrySet())
	{
	Employee e=m.getValue();
	System.out.println(m.getKey()+" "+e.getName()+" "+e.getAge());
	}
	s.close();

	 }
	}




