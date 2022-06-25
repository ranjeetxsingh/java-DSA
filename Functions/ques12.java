// Write a function that returns all prime numbers between two given numbers.

import java.util.*;
import java.lang.*;

public class ques12 {
    
    public static void printPrime(int s, int e) {

        for (int i = s; i <= e; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }
    
    public static boolean isPrime(int n) {

        int c = 0;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                c++;
            }
        }

        if (c == 0) {
            return true;
        } else {
            return false;
        }

    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter start range : ");
        int s = sc.nextInt();

        System.out.print("enter end range : ");
        int e = sc.nextInt();

        printPrime(s, e);

    }
    
}
