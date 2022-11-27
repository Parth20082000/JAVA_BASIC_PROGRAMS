package Basic_Programs;

import java.util.Scanner;

public class IfElse01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age ");
        int age = sc.nextInt();
        if(age > 18){
            System.out.println("Adult");

        }
        else{
            System.out.println("Not Adult");
        }
        sc.close();
    }
}
