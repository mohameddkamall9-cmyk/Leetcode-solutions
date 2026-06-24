package Medium.Longest_Substring;
import java.util.HashSet;

public class LongestSubString {

    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println("Longest substring length: " + result); // الناتج المتوقع: 3
    }

    // find the length of the longest substring without repeating characters in a given string s.
    //time complexity: O(n) where n is the length of the string s.
    //space complexity: O(min(n, m)) where n is the length of the string s and m is the size of the character set.
    public static int lengthOfLongestSubstring(String s) {
        int leftPointer = 0;
        int rightPointer = 0;
        int maxLength = 0;
        HashSet<Character> container = new HashSet<>();

        while (rightPointer < s.length()) {
            if (!container.contains(s.charAt(rightPointer))) {
                container.add(s.charAt(rightPointer));

                maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);
                rightPointer++; 
            } else {
                container.remove(s.charAt(leftPointer));
                leftPointer++;
            }
        }
        return maxLength;
    }
}