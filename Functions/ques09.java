/*
 Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. 
 
 E.g.-
    4! = 1 * 2 * 3 * 4 = 24 
    3! = 3 * 2 * 1 = 6 
    2! = 2 * 1 = 2 
    Also, 
    1! = 1 
    0! = 1
 */

import java.util.*;

public class ques09 {
    
    public static long fact(int n) {
        long f = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        return f;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = sc.nextInt();

        System.out.println("Factorial is : " + fact(a));

    }

    
}
