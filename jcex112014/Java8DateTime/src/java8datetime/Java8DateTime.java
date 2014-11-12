package java8datetime; 
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter; 
import java.time.temporal.ChronoUnit; 
public class Java8DateTime {
    public static void main(String[] args) {
        //LocalDate
        LocalDate now = LocalDate.now();
        System.out.println("Current date: " + now);
        System.out.println("Current month: " + now.getMonth() + " (" + now.getMonthValue() + ")");
        System.out.println("Current year: " + now.getYear());
        System.out.println("Current day: " + now.getDayOfMonth() + " (" + now.getDayOfWeek() + ")");
        
        //LocalTime
        LocalTime timeNow = LocalTime.now();
        System.out.println("Current hour: " + timeNow.getHour());
        System.out.println("Current minute: " + timeNow.getMinute());
        System.out.println("Current second: " + timeNow.getSecond());
        System.out.println("Current nanosecond: " + timeNow.getNano());
        System.out.println(timeNow);
        
        //User defined time 
        LocalTime userDefinedTime = LocalTime.of(14,10,25);
        System.out.println(userDefinedTime); 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H-m-s");
        System.out.println(formatter.format(timeNow));
        
        //Getting duration
        Duration d = Duration.between(userDefinedTime, timeNow);
        System.out.println(d);
        
        //Getting period
        Period p = Period.between(LocalDate.of(2014, Month.MARCH, 20), now);
        System.out.println(p);
        
        
        //fps example with Instant
        Instant start = Instant.now();
        Instant end,seconddiff = Instant.now();
        float etafps = 1000f/30f;
        int current_frame = 0, fps = 0;
        while(true){ 
            end = Instant.now(); 
            if(start.until(end, ChronoUnit.MILLIS)>=etafps){ 
                start = Instant.now();
                fps++;
            }
            if(seconddiff.until(end, ChronoUnit.MILLIS)>=1000){ 
                System.out.print(fps+"\r");
                fps=0;
                seconddiff = Instant.now();
            } 
        }  
    }
}
