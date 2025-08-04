package task_2;

public class StringReversingMet2 {

    public static String reverseStringUsingForLoop(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));

        }
        return sb.toString();
    }

    public static void main(String[] args) {
    String original = "I'm going to go to school today morning.";
    String reversed = reverseStringUsingForLoop(original);
    System.out.println("Original: \"" + original + "\", Reversed: \"" + reversed + "\"");
    }
}