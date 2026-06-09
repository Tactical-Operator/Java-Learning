import javax.print.DocFlavor.STRING;

class replaceall {

    public static String replaceAllSpaces(String input, String replacement) {
        if (input == null) {
            return null; // Handle null input gracefully
        }
        return input.replaceAll(" ", replacement);
    }

    public static String replaceMultipleSpaces(String input, String replacement) {
        if (input == null) {
            return null;
        }
        return input.replaceAll("\\s+", replacement);
    }

    public static String replaceLeadingAndTrailingSpaces(String input, String replacement) {
        if (input == null) {
            return null;
        }
        String s=input.replaceAll("[.]"," ");
        return s.trim().replaceAll("[ .]", replacement);
    }

    public static void main(String[] args) {
        String testString = "This is a test string with spaces.";
        String testMultipleSpaces = "This   is    a   test   with    multiple    spaces.";
        String testLeadingTrailingSpaces = "   This is a test string.   ";

        String replacement = "_"; // Example replacement character

        String replacedString = replaceAllSpaces(testString, replacement);
        System.out.println("Original: " + testString);
        System.out.println("Replaced: " + replacedString);

        String replacedMultipleSpacesString = replaceMultipleSpaces(testMultipleSpaces, replacement);
        System.out.println("Original Multiple Spaces: " + testMultipleSpaces);
        System.out.println("Replaced Multiple Spaces: " + replacedMultipleSpacesString);

        String replacedLeadingTrailingSpacesString = replaceLeadingAndTrailingSpaces(testLeadingTrailingSpaces,
                replacement);
        System.out.println("Original Leading/Trailing Spaces: " + testLeadingTrailingSpaces);
        System.out.println("Replaced Leading/Trailing Spaces: " + replacedLeadingTrailingSpacesString);
    }
}