package exceptions;
// Exception - an event that occurs after program execution, that disrupts the normal flow of 
//program execution e.g DuplicateEmailException, InvalidCreditException, AgeException

import java.util.Scanner;

public class Custom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("A problem occured: "+e);
        }
    }

    static void checkAge(int age) throws AgeException {
        if(age<18) {
            throw new AgeException("\n"+"You must be 18 years older to sign up");
        } else {
            System.out.println("You are signed up!");
        }
    }
}
