package set;
import java.util.*;
public class HashSetExample
{
	public static void main(String args[])
	{
		HashSet<String> popularCities=new HashSet<String>();
		System.out.println("Is popularCities set empty?: "+popularCities.isEmpty());
		popularCities.add("London");
		popularCities.add("NewYork");
		popularCities.add("Paris");
		popularCities.add("Dubai");
		System.out.println("Number of cities in the HashSet: "+popularCities.size());
		if(popularCities.contains("Paris"))
		{
			System.out.println("Paris is in the popularCities set.");
		}
		
	}
}
