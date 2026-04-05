public class uc4 {

    public static void main(String[] args) {

        String result;

        // Check if arguments exist
        if (args.length > 0) {
            // Join all names with comma and space
            result = String.join(", ", args);
        } else {
            // Default value
            result = "World";
        }

        // Output
        System.out.println("Hello, " + result + "!");
    }
}