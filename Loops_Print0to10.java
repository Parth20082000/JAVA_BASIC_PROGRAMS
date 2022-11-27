package Basic_Programs;


public class Loops_Print0to10 {
    public static void main(String[] args) {
        int counter = 0;
        for(;counter <= 10;counter++){
            System.out.print(counter + " ");
        }
        System.out.println("\nAfter loop, the value of counter is " + counter);
    }
}
