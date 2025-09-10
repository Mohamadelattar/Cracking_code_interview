package Arrays_Strings;

public class URlify {
    public static void main(String[] args) {
        String input= "Mr John Smith   ";
        System.out.println(urlify(input));
    }
    public static String urlify(String input) {
        StringBuilder output = new StringBuilder(input);
        for (int i = 0; i < input.length(); i++) {
            if(output.charAt(i) == ' ') {
                output.replace(i, i+1, "%20");
            }
        }
        return output.toString();
    }


}
