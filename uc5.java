public class uc5 {

    public static void main(String[] args) {

        String result;

        // Check if no arguments
        if (args.length == 0) {
            result = "World";
        } else {
            StringBuilder sb = new StringBuilder();

            // Enhanced for loop
            for (String name : args) {
                sb.append(name).append(", ");
            }

            // Remove trailing comma and space
            sb.setLength(sb.length() - 2);

            result = sb.toString();
        }

        // Output
        System.out.println("Hello, " + result + "!");
    }
}