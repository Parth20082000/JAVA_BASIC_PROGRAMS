package Basic_Programs;

import java.util.Scanner;

public class PrintGreetigs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter button 1 / 2 / 3");
        int button = sc.nextInt();
        // Using if-else

        // if(button == 1 ){
        //     System.out.println("Hello");
        // }
        // else if(button == 2){
        //     System.out.println("Namaste");
        // }
        // else if(button == 3){
        //     System.out.println("Bonjour");
        // }
        // else{
        //     System.out.println("Invalid Button");
        // }
        // sc.close();

        // Using Switch
        switch(button){
            case 1: System.out.println("HEllO");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid Button");
        }
         sc.close();
    }
}
