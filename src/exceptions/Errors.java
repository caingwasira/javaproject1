package exceptions;
import java.util.Scanner;
public class Errors {
    public static void allExceptions() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter another number to divide by the previous number: ");
            int num2 = scanner.nextInt();
    
            System.out.println("The answer: "+ num1/num2);
        } catch (ArithmeticException e) {
            System.out.println("Oops you cant divide by zero");
        } catch (Exception e) {
            System.out.println("Oops type mismatch error occured");
        }
    }

    public static void main(String[] args) {
        allExceptions();
    }
}
