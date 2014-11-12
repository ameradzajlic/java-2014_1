package workingwithdates; 

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate; 
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
public class WorkingWithDates {
    public static void main(String[] args) throws ParseException {
        //show current milliseconds with Date object
        Date dt = new Date();
        System.out.println(dt.getTime()); 
        
        //show current milliseconds with System class
        
        //uncomment to see result
        //it will block the rest of application
        /*
        while(true) { 
            System.out.print(System.currentTimeMillis()+"\r");
        }
        */
        //Output formatting
        Date date = new Date();
        SimpleDateFormat sdf_out = new SimpleDateFormat("MM/dd/y HH:m:s");
        System.out.println(sdf_out.format(date));
        
        //Input formatting 
        SimpleDateFormat sdf_input = new SimpleDateFormat("yyyy MMM dd");
        String some_string_date = "2014 december 15";
        Date date_input = sdf_input.parse(some_string_date);
        System.out.println(date_input);
        
        //Calendar
        GregorianCalendar cal = new GregorianCalendar(); 
        cal.set(Calendar.YEAR, 2014);
        cal.set(Calendar.DATE, 15);
        cal.set(Calendar.MONTH,11);
        System.out.println(cal.getTime());
        System.out.println("The exact month is " + (cal.get(Calendar.MONTH)+1));
        
        //Calendar add time
        GregorianCalendar source_date = new GregorianCalendar(2014,10,8); 
        GregorianCalendar current_date = new GregorianCalendar();
        current_date.add(Calendar.HOUR, -24);
        System.out.println(current_date.before(source_date));
    }
}
