/* 
    Write a function to check if a given triplet is a Pythagorean triplet or not.
    (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
*/

import java.util.*;
import java.lang.*;

public class ques11 {

    public static boolean isTriplet(int a, int b, int c) {

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int mid = a + b + c - max - min;

        long maxsq = max * max;
        long hyp = min * min + mid * mid;

        if (maxsq == hyp) {
            return true;
        } else {
            return false;
        }

    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first number: ");
        int a = sc.nextInt();

        System.out.print("enter second number: ");
        int b = sc.nextInt();

        System.out.print("enter third number: ");
        int c = sc.nextInt();

        if (isTriplet(a, b, c)) {
            System.out.println("It is a triplet : " + a + " , " + b + " , " + c);
        }
        else {
            System.out.println("It is not a triplet");
        }

    }


    
}
