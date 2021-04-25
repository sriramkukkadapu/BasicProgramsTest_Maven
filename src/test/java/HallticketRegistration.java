

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HallticketRegistration {
public static void main(String args[])
{
	String s_actual="Application 1: Hi Amod. Your registration number is AX1234 and hallticket number is XC876 \nApplication 2:Hi Amod. Your hallticket is AX1234 and registration number is XC876 \nApplication 3:Hi Amod. Your hallticket and registration are AX1234 and XC876 \nApplication 4:Hi Amod. AX1234 and XC876 are Your hallticket and registration";
	//System.out.println(s_actual);
	
	String s[]=s_actual.split("\n");
	int i,k;
	for(k=0;k<s.length;k++)
	{
	
		String inputString = s[k];
	    Pattern p = Pattern.compile("[A-Z]{2}\\d+");
	    Matcher m = p.matcher(inputString);
	    String [] values = new String[2];
	    Map<String,String> map = new HashMap();
	    i=0;
	    while (m.find()) {
	        values[i++] = m.group();
	    } 
	    if(inputString.indexOf("registration")<inputString.indexOf("hallticket")){
	        map.put("registration", values[0]);
	        map.put("hallticket", values[1]);
	    }
	    else{
	        map.put("registration", values[1]);
	        map.put("hallticket", values[0]);
	    }
	    for(Entry e: map.entrySet()){
	        System.out.println(e.getKey() +" : "+e.getValue());
	    }
	}
}
}
