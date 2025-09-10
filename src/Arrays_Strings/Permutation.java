package Arrays_Strings;

public class Permutation {
    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        StringBuilder sb1 = new StringBuilder(s1);
        sb1.reverse();
        return s2.equals(sb1.toString());
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bba";
        System.out.println(isPermutation(s1, s2));
    }
}
