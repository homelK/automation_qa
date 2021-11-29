public class CommonTools {

    public static int findNumericalSequence(String text) {

        StringBuilder sb = new StringBuilder();
        char[] arr = text.toCharArray();
        int length = text.length();

        for (int i = 0; i < length; i++) {
            if (Character.isDigit(arr[i])) {
                sb.append(String.valueOf(arr[i]));
                continue;
            }

            if (sb.toString() != "") {
                break;
            }
        }

        return Integer.parseInt(sb.toString());
    }
}
