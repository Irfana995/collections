package Map;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample2 
{
	public static void main(String args[])
	{
		LinkedHashMap<Integer,String> hashmap=new LinkedHashMap<Integer,String>();
		hashmap.put(1,"ONE");
		hashmap.put(2,"TWO");
		hashmap.put(3,"THREE");
		hashmap.put(6,"SIX");
		hashmap.put(6,"SIX");
		for(Map.Entry m:hashmap.entrySet())
		{
		     System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
