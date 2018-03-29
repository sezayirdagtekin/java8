package com.time;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;

public class TimeExample {

  public static void main(String[] args) {

    Instant start= Instant.now();
    for (int i = 0; i < 1000000000; i++) {
   
     
    }
    Instant end= Instant.now();
    
    Duration elapsed= Duration.between(start, end);
    System.out.println(elapsed.toNanos());
    
    LocalDate now = LocalDate.now();
    LocalDate bd= LocalDate.of(1978, Month.MARCH, 21);
    
    System.out.println(bd);
    
    System.out.println(bd.until(now).getYears());
    
    
    LocalDate nextSunday= now.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
    
    System.out.println(nextSunday);
    
    LocalTime localnow= LocalTime.now();
    
    System.out.println(localnow);
    
    ZoneId zoneid= ZoneId.of("Europe/London");
    
    System.out.println(zoneid);
    
 
    
    

  }

}
