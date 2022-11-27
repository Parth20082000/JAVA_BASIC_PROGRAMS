package Basic_Programs;

import java.util.Scanner;

public class TableOFNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose Table you want");
        int num = sc.nextInt();
        for(int i=1 ;i<=10 ;i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        sc.close();
    }
}
