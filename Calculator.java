package Basic_Programs;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Select the operation you want to perform");
        System.out.println(" 1. For Addition");
        System.out.println("2. For Subtraction");
        System.out.println("3. For Multiplication");
        System.out.println("4. For Division");
        System.out.println("5. For Modulo Division");
        int operation = sc.nextInt();
        switch(operation){
            case 1 : 
        System.out.println("Additon is " + (num1+num2));
        break;
        case 2: 
        System.out.println("Subtraction is " + (num1-num2));
        break;
        case 3 :
        System.out.println("Multiplication is " + (num1*num2));
        break;
        case 4 :
        System.out.println("Division is " + (num1/num2));
        break;
        case 5 : 
        System.out.println("Modulo is " + (num1%num2));
        break;
        default : 
        System.out.println("Invalid Case");
        }
        sc.close();
    }
}
