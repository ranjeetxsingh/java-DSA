// Write a function to find if a number is a palindrome or not. Take number as parameter.

import java.util.*;

public class ques10 {
    
    public static boolean isPalindrome(int n) {

        int k = n;
        int sum = 0, d = 0;
        while (k != 0) {
            d = k % 10;
            k = k / 10;
            sum = sum*10 + d;
        }

        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = sc.nextInt();

        if (isPalindrome(a)) {
            System.out.println("It is palindromic");
        }
        else {
            System.out.println("It is not palindromic");
        }

    }

}
