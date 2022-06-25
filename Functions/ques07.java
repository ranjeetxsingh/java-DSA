// Define a method to find out if a number is prime or not.


import java.util.*;

public class ques07 {
    
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

        System.out.print("Enter a number : ");
        int a = sc.nextInt();

        if (isPrime(a)) {
            System.out.println("It is a prime number");
        }
        else {
            System.out.println("It is not a prime number");
        }

    }
    
}
