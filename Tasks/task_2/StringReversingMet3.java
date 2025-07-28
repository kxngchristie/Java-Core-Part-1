package task_2;

public class StringReversingMet3 {

    public static String reverseStringUsingCharArray(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        String original = "I'm going to go to school today morning.";
        String reversed = reverseStringUsingCharArray(original);
        System.out.println("Original: \"" + original + "\", Reversed: \"" + reversed + "\"");
    }
}
