
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student
{
	String name=null;
	int cls=0;
	String section=null;
	int[] marks;
	String status="Passed";
	double avg=0.0F;
	String grade=null;
	int rollno=0;
	int total;
	
	Student(int noOfSubjects)
	{
		marks=new int[noOfSubjects];
	}
}

public class MarksReport {
public static void main(String args[])
{
	try
	{
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		String[] subjects= {"ENG","HIN","CHE","MAT","PHY"};
		int noOfSubjects=subjects.length;
	
		Student s=generateTestData();
		
		/*Student s=new Student(noOfSubjects);
			
		System.out.print("Enter Student name: ");
		s.name=br.readLine();
		System.out.print("Enter Class: ");
		s.cls=Integer.parseInt(br.readLine());
		System.out.print("Enter Section: ");
		s.section=br.readLine();
		System.out.print("Enter Roll No: ");
		s.rollno=Integer.parseInt(br.readLine());
		
		System.out.println("Enter marks of all subjects...");
		for(int i=0;i<subjects.length;i++)
		{
			System.out.print(subjects[i]+":");
			s.marks[i]=Integer.parseInt(br.readLine());
		}
		*/
		for(int i=0;i<subjects.length;i++)
		{
			if(s.marks[i]>100 || s.marks[i]<0)
			{	System.exit(0); System.out.println("Invalid data provided"); }
			s.total+=s.marks[i];
			if(s.marks[i]<35) s.status="Failed"; 
			
		}
		s.avg=(s.total)/subjects.length;
		if(s.avg>=70)s.grade="Distinction";
		else if(s.avg>=60) s.grade="First Class";
		else if(s.avg>=50) s.grade="Second Class";
		else if(s.avg>=35) s.grade="Third Class";
		else s.grade="Failed";
		
		if(s.status.equalsIgnoreCase("Failed"))
			s.grade="Failed";
		
		generateReport(s,subjects);
	}
	/*catch(IOException ioe)
	{
		System.out.println("Expection occured while reading input from user : "+ioe.toString());
	}
	*/
	catch(Exception e){System.out.println(e.toString());}
}

public static void generateReport(Student s,String[] subjects)
{
	
	System.out.println("_______________________________________________________");
	System.out.println("            	MARKS REPORT");
	System.out.println("_______________________________________________________");
	System.out.println("Name: "+s.name);
	System.out.println("Class: "+s.cls+"\tSection: "+s.section+"\tRoll No: "+s.rollno);
	System.out.println("_______________________________________________________");
	System.out.print("Subjects:\t");
	for(int i=0;i<subjects.length;i++)
		System.out.print(subjects[i]+"\t");
	System.out.println("");
	
	System.out.print("Marks:   \t");
	for(int i=0;i<subjects.length;i++)
		System.out.print(s.marks[i]+"\t");
	
	System.out.println("\n_______________________________________________________");
	System.out.print("Total Marks: "+s.total);
	System.out.println("\t\tAvg Marks: "+s.avg);
	System.out.print("Status: "+s.status);
	System.out.println("\t\t\tGrade: "+s.grade);
	
}

public static Student generateTestData()
{
	Student s=new Student(5); //considering 5 subjects
	
	s.name="Priya";
	s.cls=10;
	s.section="A";
	s.rollno=25;
	
	s.marks[0]=85; s.marks[1]=55;s.marks[2]=80;s.marks[3]=75;s.marks[4]=65;
	
	return s;
}
}



