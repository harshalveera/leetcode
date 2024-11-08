package LengthOfLongestSubstring;

import java.util.HashMap;

/**
 * Given a string s, find the length of the longest
 * substring
 *  without repeating characters.
 *
 *
 *
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 *
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 *
 * Constraints:
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        HashMap<Character, Integer> charMap = new HashMap<>();
        int start = 0;
        for(int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(!charMap.containsKey(c) || charMap.get(c) < start) {
                maxLength = Math.max(i - start + 1, maxLength);
            } else {
                start = charMap.getOrDefault(c, -1) + 1;
            }
            charMap.put(c, i);
        }


        return maxLength;
    }
}