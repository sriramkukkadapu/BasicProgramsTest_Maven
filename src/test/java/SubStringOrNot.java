

public class SubStringOrNot {
public static void main(String args[])
{
	String mainStr="public static void main";
	String subStr="sri";
	int i,j,k;
	int found=0;
	
	System.out.println("Given String : "+mainStr);
	System.out.println("Target : "+subStr);
	
	for(i=0;i<mainStr.length();i++)
	{
		found=1;
		//now repeat through 2nd str and check parllelly 1st string as well.
		for(k=i,j=0;j<subStr.length();j++,k++){
			//just compare both values if they are all same then break the loop and print found;
			if(!(subStr.charAt(j)==mainStr.charAt(k)))
			{found=0; break;}
		}
		
		if(found==1)
			break;
	}
	
	if(found==1)
		System.out.println("Found at position: "+i);
	else
		System.out.println("Not found");
}
}
