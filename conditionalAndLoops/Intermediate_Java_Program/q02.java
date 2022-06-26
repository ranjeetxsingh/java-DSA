// Armstrong Number In Java
// Armstrong number is a number that is equal to the sum of cubes of its digits. 
// For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.


import java.util.*;
public class q02 {
    public static boolean isArmstrong(int n) {
        int sum = 0, d = 0, m = n, cb;
        while (m != 0) {
            d = m % 10;
            m = m / 10;
            cb = cube(d);
            sum += cb;
        }
        if (sum == n) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static int cube(int a) {
        return (a * a * a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if (isArmstrong(n)) {
            System.out.println("it is a Armstrong number");
        }
        else {
            System.out.println("it is not Armstrong number");
        }
    }
}
