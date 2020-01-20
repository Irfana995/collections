package comparator;


public class Employee
{
	private String name;
	private int age;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int compareTo(Employee e)
	{
		if(age>e.getAge())
		{
			return 1;
		}
		else if(age<e.getAge())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}
