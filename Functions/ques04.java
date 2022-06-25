// Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.*;

public class ques04 {
    
    public static long add(int a, int b) {
        long sum = a + b;

        return sum;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        System.out.println("The sum of the two numbers is : " + add(a,b));

    }

}
