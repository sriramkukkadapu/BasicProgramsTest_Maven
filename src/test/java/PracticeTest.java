

import java.util.HashMap;
import java.util.Map;

public class PracticeTest {
public static void main(String args[])
{
	Map<Integer, String>tempMap = new HashMap<Integer,String>();
	tempMap.put(null,"java");
	tempMap.put(1, "Java EE");
	tempMap.put(1, "Advance java");
	
	System.out.println(tempMap.get(1));
}
}
