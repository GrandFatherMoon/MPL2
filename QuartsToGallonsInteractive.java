/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpl2;

/**File name:QuartsToGalonsInteractive.java
 *Purpose Display how many gallons and quarts of paint needed from user input
 * @author emret
 */
import java.util.Scanner;

public class QuartsToGallonsInteractive {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        final int QuartsPerGalon = 4; //Constant since value does not change
        int QuartsNeeded; //Amount of quarts needed is variable and user input
        System.out.println("Please enter how many quarts" + 
                " of paint is needed for the job"); //User prompt
        QuartsNeeded = scan.nextInt();
        System.out.println("To complete the paint job, " + 
                QuartsNeeded/QuartsPerGalon + " galons and " +
                QuartsNeeded % QuartsPerGalon + " quarts of paint is needed");
        /*Above output has 2 expressions. The first is ottainable due to ints
        divided with other ints only gives whole numbers. which is perfect for
        finding how many whole galons is needed.The second expression is to find
        the remainder which gives us how many quarts is left needed
        */
    }
}
