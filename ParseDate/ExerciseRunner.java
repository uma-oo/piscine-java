
import java.time.LocalDate;

import java.lang.reflect.Method;


public class ExerciseRunner {
    public static void main(String[] args) {
       
        // Method[]  methods = LocalDate.class.getMethods(); 

        // for ( Method method : methods) {
        //     System.out.println(method);
        // }

         
        System.out.println(ParseDate.parseIsoFormat("2022-04-25T20:51:28.709039322"));
        System.out.println(ParseDate.parseFullTextFormat("monday 25 april 2022"));
        System.out.println(ParseDate.parseTimeFormat("09 hours in the evening, 07 minutes and 23 seconds"));
    }
}