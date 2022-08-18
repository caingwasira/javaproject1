package lambda;

import java.text.NumberFormat.Style;

// A shorter way to write anonymous classes
public class Main {
    public static void main(String[] args) {
        int age = 25;
        float mark = 87.77f;

        MyInterface myInterface = (x, y) -> {
            System.out.println("hello cain");
            System.out.println("Your age is: "+age+" and your mark is: "+mark);
        };

        //myInterface.message(age, mark);
        new MyFrame();
    }
}
