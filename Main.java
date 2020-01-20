package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		ArrayList<Contacts> contacts=new ArrayList<Contacts>();
		Contacts firstContact=new Contacts("tom","345656756");
		Contacts secondContact=new Contacts("jerry","654345667");
		contacts.add(firstContact);
		contacts.add(secondContact);
		for(int i=0;i<contacts.size();i++)
		{
			System.out.println(contacts.get(i).getName());
			System.out.println(contacts.get(i).getphonenumber());
		}
	}
}
class Contacts
{
	private String name;
	private String phonenumber;
	public Contacts(String name,String phonenumber)
	{
		this.name=name;
		this.phonenumber=phonenumber;
	}
	public String getName()
	{
		return name;
	}
	public String getphonenumber()
	{
		return phonenumber;
	}
}

