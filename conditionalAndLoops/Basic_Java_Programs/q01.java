// Area Of Circle Java Program

import java.util.*;
import java.lang.*;

public class q01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius of the circle: ");
        double r = sc.nextDouble();

        double area = Math.PI * r * r;

        System.out.println("Area of circle is : " + area);

    }
    
}
