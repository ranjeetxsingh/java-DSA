// Subtract the Product and Sum of Digits of an Integer

import java.util.*;
import java.lang.*;

public class q05 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int product = 1, sum = 0, d = 0;

        while (n != 0) {
            d = n % 10;
            sum += d;
            product *= d;
            n = n / 10;
        }

        int s = Math.abs(product - sum);

        System.out.println(" Solution is : " + s);
        

    }
    
}
