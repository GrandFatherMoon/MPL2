/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpl2;

/**File name:Circle.java
 *Purpose prompts the user to enter a radius of a circle to display its area and
 * Circumference
 * @author emret
 */
import java.util.Scanner;//import library for user input

public class Circle {
    public static void main(String[] args)
    {
        final double pi = Math.PI; // Simpler way to call pi
        double radius;//for user input
        double area;//initialized to hold equation
        double circum;//initialized to hold equation
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the radius for the circle");
        radius = scan.nextDouble();//user prompt
        area = pi*radius*radius;//equation declared
        circum = 2*pi*radius;//equation declared
        System.out.println("The area of the circle is " + area +
                " and the circumference is " + circum);
    }
    
}
