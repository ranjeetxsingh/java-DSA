// Define a method that returns the product of two numbers entered by user.



import java.util.*;

public class ques05 {
    
    public static long product(int a, int b) {
        long prod;
        prod = a * b;

        return prod;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        System.out.println("The product of the two numbers is : " + product(a,b));

    }

}
