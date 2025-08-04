package task_2;

public class StringReversingMet1 {

    public static String reverseStringUsingStringBuilder(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        String original = "I'm going to go to school today morning.";
        String reversed = reverseStringUsingStringBuilder(original);
        System.out.println("Original: \"" + original + "\", Reversed: \"" + reversed + "\"");
    }
}