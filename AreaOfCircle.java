package Basic_Programs;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter radius of circle");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        System.out.println("Perimer=ter of the circle is " + (2 * 3.14 * radius));
        System.out.println("Area of the circle is " + (3.14 * radius * radius));
        sc.close();
        
    }
}
