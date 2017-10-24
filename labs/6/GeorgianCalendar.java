import java.util.*;

public class GeorgianCalendar {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
      //set current date 
        System.out.printf("Today is  %d/%d/%d%n",
            calendar.get(Calendar.MONTH) + 1,
            calendar.get(Calendar.DAY_OF_MONTH),
            calendar.get(Calendar.YEAR));
    
        //set the current time 
        calendar.setTimeInMillis(1234567898765L);
        //state setting time
        System.out.printf("After setting time:  %d/%d/%d",
        		calendar.get(Calendar.MONTH) + 1,
        		calendar.get(Calendar.DAY_OF_MONTH),
            calendar.get(Calendar.YEAR));
        
    }
}