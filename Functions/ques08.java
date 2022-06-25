/*
 Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

 
    Marks        Grade 
    91-100         AA 
    81-90          AB 
    71-80          BB 
    61-70          BC 
    51-60          CD 
    41-50          DD 
    <=40          Fail 
 */



import java.util.*;

public class ques08 {

    public static String grade(int n) {

        if (n > 90 && n <= 100) {
            return "AA";
        } else if (n > 80 && n <= 90) {
            return "AB";
        } else if (n > 70 && n <= 80) {
            return "BB";
        } else if (n > 60 && n <= 70) {
            return "BC";
        } else if (n > 50 && n <= 60) {
            return "CD";
        } else if (n > 40 && n <= 50) {
            return "DD";
        } else {
            return "FAIL";
        }

    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks (out of 100) : ");
        int m = sc.nextInt();

        System.out.println("Your Grade is : " + grade(m));

    }
    
}
