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
}
