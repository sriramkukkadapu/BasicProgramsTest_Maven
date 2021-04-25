

import java.util.Scanner;

public class CalendarDate {

public static void main(String arg[])
    {
        
    int date,month,year,date2,month2,year2;
    
    date=18;
    month=12;
    year=1989;
    
    date2=25;
    month2=12;
    year2=1989;
    
    /*
    System.out.print("Enter DD MM YYYY : ");
    Scanner ip = new Scanner(System.in);

    date = ip.nextInt();
    month = ip.nextInt();
    year = ip.nextInt();
    
    System.out.print("Enter date 2 in DD MM YYYY:");
    Scanner ip2 = new Scanner(System.in);

    date2 = ip2.nextInt();
    month2 = ip2.nextInt();
    year2 = ip2.nextInt();
    */
    
    String from_date= date+"."+month+"."+year;

    
   int[] monthsday={31,28,31,30,31,30,31,31,30,31,30,31};
    int monthdays=monthsday[month-1];
    int number=0;
    if(year2<=year)
    {
        for (int i=date;i<=monthdays;i++ ) 
        {
            
        String to_date= i+"."+month+"."+year;
        if(from_date==to_date)
           System.out.println(number);
        else
            number++;
        }
        month++;
        if(month>12)
        {
            month=1;
            date=1;
            monthdays=monthsday[month-1];
            year++;
        }
        else
        {
            date=1;
            monthdays=monthsday[month-1];
            if(month==2)
            {
                if(year%4==0)
                {
                if(year%100==0)
                {
                monthdays++;
                }
                }
                
            }
        }
    }
}
}
