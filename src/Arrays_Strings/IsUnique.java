package Arrays_Strings;

import java.util.HashMap;
import java.util.Map;

public class IsUnique {


    public static boolean isUnique(String test) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < test.length(); i++) {
            if(map.containsKey(test.charAt(i))){
                return false;
            } else {
                map.put(test.charAt(i), 1);
            }
        }
        return true;
    }
    public static boolean isUnique2(String test) {
        return test.chars().distinct().count() == test.length();
    }
    public static void main(String[] args) {
        String test = "abbbbbc";
        System.out.println(isUnique(test));
        System.out.println(isUnique2(test));
    }

}
