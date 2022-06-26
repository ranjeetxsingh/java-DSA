
// Print Fibonacci Series

import java.util.*;

public class q04 {

    public static void fibonacci(int n)
{

    long currentTerm = 0;
    long nextTerm = 1;
    for (long i = 1; i <= n; i++)
    {
        System.out.print(currentTerm + " ");
        long temp = currentTerm;
        currentTerm = nextTerm;
        nextTerm = nextTerm + temp;
    }
}

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("Enter a number to print fibonacci series till nth term : ");
    n = sc.nextInt();
    fibonacci(n);
}
    
}
