// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.*;

public class q07 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int sum = 0, n = -1;

        while (n != 0) {
            System.out.print("Enter Number : ");
            n = sc.nextInt();
            sum += n;
        }

        System.out.println("Sum of all numbers entered is : " + sum);

    }
    
}
