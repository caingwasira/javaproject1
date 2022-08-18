package interfaces;

public final class App {
    private App() {
    }
    
    public static void main(String[] args) {
        Rabbit r = new Rabbit();
        r.flee();
        Fish f = new Fish();
        f.flee();
        f.hunt();
    }
}
