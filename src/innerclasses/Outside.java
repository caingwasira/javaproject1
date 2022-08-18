package innerclasses;

public class Outside {
    String x = "HELLO ";

    public class Inside {
        String y = "WORLD";

        public void Greeting() {
            System.out.println(x+y);
        }
    }
}
