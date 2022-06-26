//Area Of Triangle

import java.util.*;

public class q02 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Base of triangle : ");
        double base = sc.nextDouble();

        System.out.print("Enter Height of triangle : ");
        double height = sc.nextDouble();

        double area = (base * height) / 2.0;

        System.out.println("area of triangle is : " + area);
        
    }

}
