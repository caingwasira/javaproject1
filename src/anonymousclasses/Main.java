package anonymousclasses;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void Welcome() {
                System.out.println("Yoo cain");
            }
        };
        //greeting.Welcome();

        new MyFrame();
    }
}
