/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpl2;

/**File name:QuartsToGallons.java
 *File purpose: display how many galons and quarts needed from pre determined 
 * amount
 * @author emret
 */
public class QuartsToGallons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int QuartsPerGalon = 4; //Constant since value does not change
        int QuartsNeeded = 18; //Amount of quarts needed is variable
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
