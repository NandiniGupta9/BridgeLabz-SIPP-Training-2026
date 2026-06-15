import java.util.*;
import java.time.*;

public class CalendarDisplay {

    static String getMonthName(int month){

        String[] months={
                "January","February","March","April",
                "May","June","July","August",
                "September","October","November","December"
        };

        return months[month-1];
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int month=sc.nextInt();
        int year=sc.nextInt();

        YearMonth ym=YearMonth.of(year,month);

        System.out.println("\n   "+getMonthName(month)+" "+year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int firstDay=LocalDate.of(year,month,1)
                .getDayOfWeek().getValue()%7;

        for(int i=0;i<firstDay;i++)
            System.out.print("   ");

        for(int day=1;day<=ym.lengthOfMonth();day++){

            System.out.printf("%2d ",day);

            if((day+firstDay)%7==0)
                System.out.println();
        }
    }
}