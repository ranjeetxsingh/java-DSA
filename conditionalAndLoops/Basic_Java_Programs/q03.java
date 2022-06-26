/* Area Of Circle Java Program --> pi*r*r
Area Of Triangle --> (1/2)*b*h
Area Of Rectangle Program --> l*b
Area Of Isosceles Triangle --> (1/2)*a*b
Area Of Parallelogram --> b*h
Area Of Rhombus --> p*q/2
Area Of Equilateral Triangle --> (rt3/4)*a*a
Perimeter Of Circle --> 2*pi*r
Perimeter Of Equilateral Triangle --> 3a
Perimeter Of Parallelogram --> 2(a+b)
Perimeter Of Rectangle --> 2*(l+w)
Perimeter Of Square --> 4*a
Perimeter Of Rhombus --> 4*a
Volume Of Cone  --> pi*r*r*(h/3)
Volume Of Prism --> b*h
Volume Of Cylinder --> pi*r*r*h
Volume Of Sphere --> (4/3)*pi*r*r*r
Volume Of Pyramid --> l*w*h/3
Curved Surface Area Of Cylinder --> 2*pi*r*h
Total Surface Area Of Cube --> 6*a*a
 */

import java.util.*;
import java.lang.*;

public class q03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("choose a number from the following : \n Press  1 to calculate Area Of Circle \n Press  2 to calculate Area Of Triangle \n Press  3 to calculate Area Of Rectangle Program \n Press  4 to calculate Area Of Isosceles Triangle \n Press  5 to calculate Area Of Parallelogram \n Press  6 to calculate Area Of Rhombus \n Press  7 to calculate Area Of Equilateral Triangle \n Press  8 to calculate Perimeter Of Circle \n Press  9 to calculate Perimeter Of Equilateral Triangle \n Press 10 to calculate Perimeter Of Parallelogram \n Press 11 to calculate Perimeter Of Rectangle \n Press 12 to calculate Perimeter Of Square \n Press 13 to calculate Perimeter Of Rhombus \n Press 14 to calculate Volume Of Cone \n Press 15 to calculate Volume Of Prism \n Press 16 to calculate Volume Of Cylinder \n Press 17 to calculate Volume Of Sphere \n Press 18 to calculate Volume Of Pyramid \n Press 19 to calculate Curved Surface Area Of Cylinder \n Press 20 to calculate Total Surface Area Of Cube ");
        
        
        /*
        Press  1 to calculate Area Of Circle
        Press  2 to calculate Area Of Triangle
        Press  3 to calculate Area Of Rectangle Program
        Press  4 to calculate Area Of Isosceles Triangle
        Press  5 to calculate Area Of Parallelogram
        Press  6 to calculate Area Of Rhombus
        Press  7 to calculate Area Of Equilateral Triangle
        Press  8 to calculate Perimeter Of Circle
        Press  9 to calculate Perimeter Of Equilateral Triangle
        Press 10 to calculate Perimeter Of Parallelogram
        Press 11 to calculate Perimeter Of Rectangle
        Press 12 to calculate Perimeter Of Square
        Press 13 to calculate Perimeter Of Rhombus
        Press 14 to calculate Volume Of Cone 
        Press 15 to calculate Volume Of Prism
        Press 16 to calculate Volume Of Cylinder
        Press 17 to calculate Volume Of Sphere
        Press 18 to calculate Volume Of Pyramid
        Press 19 to calculate Curved Surface Area Of Cylinder
        Press 20 to calculate Total Surface Area Of Cube
        "); 
        */

        int ch = sc.nextInt();

        double r, h, a, b, area, perimeter, volume, base, height;
        double pi = Math.PI;

        switch(ch){
            case 1:
                // Area Of Circle Java Program --> pi*r*r
                System.out.print("Enter radius of circle : ");
                r = sc.nextDouble();
                area =  pi*r*r;
                System.out.println("Area of circle is : "+ area);
                break;
            case 2:
                // Area Of Triangle --> (1/2)*b*h
                System.out.print("Enter Base of triangle : ");
                base = sc.nextDouble();
    
                System.out.print("Enter Height of triangle : ");
                height = sc.nextDouble();
    
                area = (base * height) / 2.0;
    
                System.out.println("area of triangle is : " + area);
                break;
            case 3:
                // Area Of Rectangle Program --> l*b
                System.out.print("Enter Length of rectangle : ");
                a = sc.nextDouble();
                System.out.print("Enter Breadth of rectangle : ");
                b = sc.nextDouble();

                area = a*b;

                System.out.println("Area of rectangle is : " + area);
                break;
            case 4:
                // Area Of Isosceles Triangle --> (1/2)*a*b
                System.out.print("Enter Base of isosceles triangle : ");
                base = sc.nextDouble();

                System.out.print("Enter Height of isosceles triangle : ");
                height = sc.nextDouble();

                area = (base * height) / 2.0;

                System.out.println("area of isosceles triangle is : " + area);
                break;
            case 5:
                //Area Of Parallelogram --> b*h
                System.out.print("Enter Base of parallelogram : ");
                base = sc.nextDouble();
                System.out.print("Enter Height of parallelogram : ");
                height = sc.nextDouble();

                area = base*height;

                System.out.println("area of parallelogram is : " + area);
                break;
            case 6:
                // Area Of Rhombus --> p*q/2
                System.out.print("Enter first diagonal of rhombus : ");
                a = sc.nextDouble();
                System.out.print("Enter second diagonal of rhombus : ");
                b = sc.nextDouble();

                area = a*b;

                System.out.println("Area of Rhombus is : " + area);
                break;
            case 7:
                // Area Of Equilateral Triangle --> (rt3/4)*a*a
                System.out.print("Enter Side of Equilateral Triangle : ");
                a = sc.nextDouble();

                area = (Math.sqrt(3)/4)*a*a;

                System.out.println("Area of Equilateral Triangle is : " + area);
                break;
            case 8:
                // Perimeter Of Circle --> 2*pi*r
                System.out.print("Enter Radius of circle : ");
                r = sc.nextDouble();

                perimeter = 2*pi*r;

                System.out.println("Perimeter of circle is : " + perimeter);
                break;
            case 9:
                // Perimeter Of Equilateral Triangle --> 3a
                System.out.print("Enter a Side of Equilateral triangle : ");
                a = sc.nextDouble();

                perimeter = 3*a;

                System.out.println("Perimeter of Equilateral Triangle is : " + perimeter);
                break;
            case 10:
                // Perimeter Of Parallelogram --> 2(a+b)
                System.out.print("Enter First Side of Parallelogram : ");
                a = sc.nextDouble();
                System.out.print("Enter Second Side of Parallelogram : ");
                b = sc.nextDouble();

                perimeter = 2*(a + b);

                System.out.println("Perimeter of Parallelogram is : " + perimeter);
                break;
            case 11:
                // Perimeter Of Rectangle --> 2*(l+w)
                System.out.print("Enter Length of Rectangle : ");
                a = sc.nextDouble();
                System.out.print("Enter Width of Rectangle : ");
                b = sc.nextDouble();

                perimeter = 2*(a + b);

                System.out.println("Perimeter of Rectangle is : " + perimeter);
                break;
            case 12:
                // Perimeter Of Square --> 4*a
                System.out.print("Enter a Side of Square : ");
                a = sc.nextDouble();

                perimeter = 4*a;

                System.out.println("Perimeter of Square is : " + perimeter);
                break;
            case 13:
                // Perimeter Of Rhombus --> 4*a
                System.out.print("Enter a Side of Rhombus : ");
                a = sc.nextDouble();

                perimeter = 4*a;

                System.out.println("Perimeter of Rhombus is : " + perimeter);
                break;
            case 14:
                // Volume Of Cone  --> pi*r*r*(h/3)
                System.out.print("Enter Radius of cone : ");
                r = sc.nextDouble();

                System.out.print("Enter Height of cone : ");
                h = sc.nextDouble();

                volume = pi*r*r*(h/3.0);

                System.out.println("Volume of cone is : " + volume);
                break;
            case 15:
                // Volume Of Prism --> b*h
                System.out.print("Enter Base of Prism : ");
                base = sc.nextDouble();
                System.out.print("Enter Height of Prism : ");
                height = sc.nextDouble();

                volume = base*height;

                System.out.println("Volume of Prism is : " + volume);
                break;
            case 16:
                // Volume Of Cylinder --> pi*r*r*h
                System.out.print("Enter Radius of Cylinder : ");
                r = sc.nextDouble();

                System.out.print("Enter Height of Cylinder : ");
                h = sc.nextDouble();

                volume = pi*r*r*h;

                System.out.println("Volume of Cylinder is : " + volume);
                break;
            case 17:
                // Volume Of Sphere --> (4/3)*pi*r*r*r
                System.out.print("Enter Radius of Sphere : ");
                r = sc.nextDouble();

                volume = (4.0/3.0)*pi*r*r*r;

                System.out.println("Volume of Sphere is : " + volume);
                break;
            case 18:
                // Volume Of Pyramid --> l*w*h/3
                System.out.print("Enter Height of Pyramid : ");
                h = sc.nextDouble();

                System.out.print("Enter length of Pyramid : ");
                a = sc.nextDouble();

                System.out.print("Enter width of Pyramid : ");
                b = sc.nextDouble();

                volume = a*b*h/3.0;

                System.out.println("Volume of Pyramid is : " + volume);
                break;
            case 19:
                // Curved Surface Area Of Cylinder --> 2*pi*r*h
                System.out.print("Enter Radius of Cylinder : ");
                r = sc.nextDouble();

                System.out.print("Enter Height of Cylinder : ");
                h = sc.nextDouble();

                area = 2*pi*r*h;

                System.out.println("Curved Surface Area of Cylinder is : " + area);
                break;
            case 20: 
                // Total Surface Area Of Cube --> 6*a*a
                System.out.print("Enter a side of Cube : ");
                a = sc.nextDouble();

                area = 6*a*a;

                System.out.println("Total Surface Area of Cube is : " + area);
                break;
            default:
                System.out.println("Please Enter Valid Number ! ")
        }

    }

}
