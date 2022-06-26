// Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.*;

public class q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1, largest = 0;

        while (n != 0) {
            System.out.print("Enter a number : ");
            n = sc.nextInt();

            if (largest < n)
                largest = n;

        }
        
        System.out.println("Largest number from all is : " + largest);
    }    
}
