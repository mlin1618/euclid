/**
 * Created by ml996 on 2/23/17.
 */
import java.util.*;

public class euclid {
    public static int recursively(int a, int b){
        if(a==0)
            return b;
        else if(a==1)
            return 1;
        return recursively(b%a, a);
    }
    public static int iteratively(int a, int b){
        int x = a;
        int y = b;
        while(x > 1){
            int temp = x;
            x = y%x;
            y = temp;
        }
        return (x==0)?y:1;
    }
    public static void main(String[] args){
        System.out.println("Welcome to the GCD Calculator!");
        loop1:while(true) {
            Scanner scan = new Scanner(System.in);
            int x; int y;
            loop0:while(true) {
                try {
                    System.out.println("Enter the first integer: ");
                    x = scan.nextInt();
                    System.out.println("Enter the second integer: ");
                    y = scan.nextInt();
                    break loop0;
                } catch (InputMismatchException e) {
                    System.out.println("Not an integer, try again.");
                    scan.nextLine();
                }
            }
            System.out.println("Recursive or iterative? (\"R\" for recursive, \"I\" for iterative)");
            scan.nextLine();
            String ri = scan.nextLine();
            loop2:while(true) {
                if (ri.equalsIgnoreCase("R")) {
                    System.out.println("The GCD of " + x + " and " + y + " is " + recursively(x, y));
                    break loop2;
                } else if (ri.equalsIgnoreCase("I")) {
                    System.out.println("The GCD of " + x + " and " + y + " is " + iteratively(x, y));
                    break loop2;
                } else {
                    System.out.println("Invalid. Please enter\"R\" for recursive, \"I\" for iterative");
                }
            }
            System.out.println("Would you like to enter another pair of integers? (\"N\" to exit, anything else to continue)");
            String N = scan.nextLine();
            if(N.equalsIgnoreCase("N")){
                break loop1;
            }
        }
    }
}