public class uc7 {

    public static void main(String[] args) {

        String result;

        // Check if no arguments
        if (args.length == 0) {
            result = "World";
        } else {
            // Join all names with ", "
            result = String.join(", ", args);
        }

        // Output
        System.out.println("Hello, " + result + "!");
    }
}