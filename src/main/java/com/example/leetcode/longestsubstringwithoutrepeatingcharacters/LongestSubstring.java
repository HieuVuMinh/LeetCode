package com.example.leetcode.longestsubstringwithoutrepeatingcharacters;

import com.example.leetcode.longestsubstringwithoutrepeatingcharacters.solution.Solution1;
import com.example.leetcode.longestsubstringwithoutrepeatingcharacters.solution.Solution2;

public class LongestSubstring {

    public static void main(String[] args) {
        String subString = "abcabcbb";
//        System.out.println(Solution1.lengthOfLongestSubstring(subString));
        System.out.println(Solution2.lengthOfLongestSubstring(subString));
    }
}
