// Write a function that returns the sum of first n natural numbers.

import java.util.*;

public class ques13 {

    public static long naturalSum(int n) {
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number: ");
        int n = sc.nextInt();

        System.out.println("Sum is : " + naturalSum(n));
    }
    
}
