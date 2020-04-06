/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstLastBarChart;
import java.util.Scanner;

/**
 *
 * @author Asia
 */
public class First_Last_BarChart1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // five players named Art, Bob, Cal, Dan , and Eli
    // accept the number of points scored
    // print out name and points as bar code
    int a,b,c,d,e;
    
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("Enter in Art's points:");
    a = userInput.nextInt();
    
    System.out.println("Enter in Bob's points:");
    b = userInput.nextInt();
    
    System.out.println("Enter in Cal's points:");
    c = userInput.nextInt();
    
    System.out.println("Enter in Dan's points:");
    d = userInput.nextInt();
    
    System.out.println("Enter in Eli's points:");
    e = userInput.nextInt();
    
   System.out.println("Points for the game.");
   System.out.println();
   
   System.out.print("Art:  ");
   
   for (int i=0; i < a; i++)
   {
       System.out.print("*");
   }
   
   System.out.println();
     System.out.print("Bob:  ");
   
   for (int i=0; i < b; i++)
   {
       System.out.print("*");
   }
   
       System.out.println();
     System.out.print("Cal:  ");
   
   for (int i=0; i < c; i++)
   {
       System.out.print("*");
   }
   
      System.out.println();
     System.out.print("Dan:  ");
   
   for (int i=0; i < d; i++)
   {
       System.out.print("*");
   }
   
      System.out.println();
     System.out.print("Eli:  ");
   
   for (int i=0; i < e; i++)
   {
       System.out.print("*");
   }
   
   
    }
    
}
