package interfaces;

public class Fish implements Prey, Preditor {
    
    @Override
    public void flee() {
        System.out.println("The fish is fleeing from a bigger fish");
    }

    public void hunt() {
        System.out.println("The fish is hunting for a smaller fish");
    }
}
