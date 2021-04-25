

import java.util.Scanner;

public class DateDiffNoOfDays_Anusuya {
	public static void main(String[] args) {
		String day, month, year, day1, month1, year1;
		int difference, valTwo, valOne;
		
		/******User Input for First Date*******/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First date Input");
		day = sc.nextLine();
		month = sc.nextLine();
		year = sc.nextLine();

		String firstDate = day + "/" + month + "/" + year;
		System.out.println("First Date : " + firstDate);

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Second date Input");
		day1 = sc1.nextLine();
		month1 = sc1.nextLine();
		year1 = sc1.nextLine();

		String SecondDate = day1 + "/" + month1 + "/" + year1;
		System.out.println("Second Date : " + SecondDate);

		/****** Calculating the difference between the two dates *******/

		String[] FirstVal = firstDate.split("/");
		String[] SecondVal = SecondDate.split("/");
		for (int i = 0; i < FirstVal.length; i++) {
			String val1 = FirstVal[i];
			valOne = Integer.parseInt(val1);
			System.out.println("First Value is : " + valOne);
			for (int j = 0; j < SecondVal.length; j++) {
				String val2 = SecondVal[j];
				valTwo = Integer.parseInt(val2);
				System.out.println("Second Value is : " + valTwo);
				difference = valTwo - valOne;
				System.out.println("The difference between the two dates is : " + difference);
				break;

			}

			break;

		}

	}
}
