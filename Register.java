package collections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.text.html.HTMLDocument.Iterator;
class Student
{  	  
	String name;
	String address;
	int contactno;
	String emailid;
	Student(String name,String address,int contactno,String emailid)
	{
		this.name=name;
		this. address= address;
		this.contactno=contactno;
		this.emailid=emailid;
	}
}
public class Register 
{
	public static void main(String args[]) throws IOException 
	{
		String name;
		String address;
		int contactno;
		String emailid;
		String proof;
		String proofid;
		String a;
		String d;
		ArrayList<Student> al=new ArrayList<Student>();//creating array list
		do
		{
		Scanner s=new Scanner(System.in);
		System.out.println("     REGISTRATION");
		System.out.print("Enter your name:");
		name=s.next();
		System.out.print("Enter your address:");
		address=s.next();
		System.out.print("Enter your Contact Number:");
	    	contactno=s.nextInt();
		System.out.print("Enter your E-Mail ID:");
		emailid=s.next();
		Student s1=new Student(name,address,contactno,emailid);
		al.add(s1);//adding object in array list
		System.out.print("Do you want to Countinue:Y/N?");
		a=s.next();
		}while(a.equals("Y"));
		System.out.println("\t\tDETAILS ARE ");	
		java.util.Iterator<Student> itr=al.iterator();//traversing list through iterator
		while(itr.hasNext())
		{
		    Student st=(Student)itr.next();
		    System.out.println(st.name+" "+st.address+" "+st.contactno+" "+st.emailid);
		}  		
	}
}
  
