public class uc3 {

    public static void main(String[] args) {

        // Assign name using ternary operator
        String name = (args.length > 0) ? args[0] : "World";

        // Output
        System.out.println("Hello, " + name + "!");
    }
}