/* IT--2650 Java Programming, Spring 2020
* Instructor: David Goff
* Student Name: Asia Anderson
* Homework Assignment: Chap 5, Problem 5.2
* Purpose of Assignment: Prompt user to insert month,day,year and compare it to current date.
*/
package com.mycompany.ama_first_last_present2;
import java.util.Scanner;
import java.time.LocalDate;

/**
 *
 * @author Asia
 */
public class AMA_First_Last_Present2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
     LocalDate today = LocalDate.now();
        int month;
        int year;
        int day;
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Give me the year, month, and day.");
        year = userInput.nextInt();
        month = userInput.nextInt();
        day = userInput.nextInt();
        
      LocalDate inputDate=null;
try
{
inputDate = LocalDate.of(year,month,day);
}
catch(Exception ex)
{
System.out.println("Invalid entries. Re-enter"); //if users enters wrong it says this message.
System.exit(0);
} 
        
        if( inputDate.isBefore(today) )
        {
            System.out.println("That date is in the past.");
        }
        if ( inputDate.isAfter(today))
        {
            System.out.println("That date is in the future.");
        }
        if ( inputDate.equals(today))
        {
            System.out.println("That date is the current date.");
        }
        
}
}