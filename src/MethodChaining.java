public class MethodChaining {
    public static void main(String[] args) {
        String name = "   Cain";
        name = name.concat(" Gwasira").toLowerCase().trim();

        System.out.println(name);
    }
}
