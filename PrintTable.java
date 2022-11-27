package Basic_Programs;
import java.util.Scanner;

public class PrintTable{
    public static void main(String[] args) {
        System.out.println("Whose table you want to print");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i<=10; i++){
        System.out.println(num + " * " + i + " = " + (num*i));
        }
        sc.close();
    }
}