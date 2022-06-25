// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.*;
import java.lang.*;

public class ques06 {
    
    public static double area(double r) {

        double a = Math.PI * r * r;

        return a;
    }
    
    public static double circumference(double r) {

        double c = 2 * Math.PI * r;

        return c;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius : ");
        double r = sc.nextDouble();

        System.out.println("The circumference of the circle is : " + circumference(r));
        System.out.println("The area of the circle is : " + area(r));

    }




}
