// Define a program to find out whether a given number is even or odd. create method.


import java.util.*;
public class ques002 {

    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if (isEven(a)) {
            System.out.println("it is an even number");
        }
        else {
            System.out.println("it is an odd number");
        }

    }
    
}
