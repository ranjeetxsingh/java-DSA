// Input a number and print all the factors of that number (use loops).

import java.util.*;

public class q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print(" Factors are : ");

        int i = 1;

        while (i <= n) {
            if (n % i == 0) {
                System.out.print(i + "  ");
            }
            i++;
        }
    }
}
