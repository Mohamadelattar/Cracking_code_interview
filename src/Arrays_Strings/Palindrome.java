package Arrays_Strings;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        int [] char_count = new int[128];
        for (int i = 0; i < str.length(); i++) {
            char_count[str.charAt(i)]++;
        }
        int count = 0;
        for (int i = 0; i < 128; i++) {
            count += char_count[i] % 2;
        }
        return count<=1;
    }

    public static void main(String[] args) {
        String str = "Tact Coa";
        System.out.println(isPalindrome(str));
    }
}
