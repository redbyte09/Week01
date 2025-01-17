public class NullPointerExceptionDemo {

    // Method to generate the NullPointerException
    public static void generateException() {
        String text = null;  // Initialize the String to null
        System.out.println("Attempting to call length() on a null string:");
        int length = text.length();  // This will throw NullPointerException
        System.out.println("Length: " + length);
    }

    // Method to handle the NullPointerException
    public static void handleException() {
        try {
            String text = null;  // Initialize the String to null
            System.out.println("Attempting to call length() on a null string inside try block:");
            int length = text.length();  // This will throw NullPointerException
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a general exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call the method to generate the exception
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Exception caught during generateException: " + e.getMessage());
        }

        // Call the method to handle the exception
        handleException();
    }
}
