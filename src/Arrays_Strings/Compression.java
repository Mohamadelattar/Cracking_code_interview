package Arrays_Strings;

public class Compression {
    public static void main(String[] args) {
        String input = "aabcccccaaa";
        System.out.println(compress(input));
    }
    public static String compress(String input) {
        StringBuilder output = new StringBuilder();
        int count = 1;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                output.append(input.charAt(i));
                output.append(count);
                count = 1;
            }
        }
        return output.toString();
    }
}
