/*A person is eligible to vote if his/her age is greater than or equal to 18. 
Define a method to find out if he/she is eligible to vote.
*/

import java.util.*;
public class ques03 {
    
    public static boolean isEligible(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (isEligible(age)) {
            System.out.println("You are Eligible to vote! ");
        }
        else {
            System.out.println("Sorry! You are not eligible to vote!");
        }

    }

}
