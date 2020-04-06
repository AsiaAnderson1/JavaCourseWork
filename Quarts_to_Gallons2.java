/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AMA_Quarts_to_Gallons2;
import java.util.Scanner;
/**
 *
 * @author Asia
 */
public class Quarts_to_Gallons2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               final int QUARTS_IN_GALLON = 4;
       int quartsNeeded;
       int gallonsNeeded;
       int extraquartNeeded;
       
       
       Scanner userInput = new Scanner(System.in);
       System.out.println("Enter quarts needed for the paint job. ");
        quartsNeeded = userInput.nextInt();
        gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
        extraquartNeeded = quartsNeeded % QUARTS_IN_GALLON;
        System.out.println("This paint job needs " + quartsNeeded + " quarts, which, requires " + gallonsNeeded +
" gallons plus " + extraquartNeeded + " quarts.");
}
}
    }
    
}
