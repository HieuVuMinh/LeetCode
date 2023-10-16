package com.example.leetcode.longestsubstringwithoutrepeatingcharacters.solution;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {

    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int maxLength = 0;

        Set<Character> stringSet = new HashSet<>();

        while (j < s.length()) {
            if (!stringSet.contains(s.charAt(j))) {
                stringSet.add(s.charAt(j));
                maxLength = Math.max(stringSet.size(), maxLength);
                j++;
            } else {
                stringSet.remove(s.charAt(i));
                i++;
            }
        }
        return maxLength;
    }
}
