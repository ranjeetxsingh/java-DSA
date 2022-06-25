// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.


import java.util.*;
import java.lang.*;

public class ques01 {
    
    public static int minm(int a, int b, int c) 
    {
        int min = Math.min(a, Math.min(b, c));

        return min;
    }

    public static int maxm(int a, int b, int c) 
    {
        int max = Math.max(a, Math.max(b, c));

        return max;
    }
    
    public static void main(String[] args) 
     {

        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("Enter First Number: ");
        a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        b = sc.nextInt();

        System.out.print("Enter Third Number: ");
        c = sc.nextInt();

        System.out.println("Minimum Number is : " + minm(a, b, c));
        System.out.println("Maximum Number is : " + maxm(a, b, c));
        
    }

}
