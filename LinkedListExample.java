package linkedList;
import java.util.*;
public class LinkedListExample
{
	public static void main(String args[])
	{
		LinkedList word=new LinkedList();
		word.add("Competition");
		word.add("Be positive");
		word.add("Happy Day");
		Iterator itr=word.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
