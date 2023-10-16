package com.example.leetcode.longestsubstringwithoutrepeatingcharacters.solution;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution1 {

    public static int lengthOfLongestSubstring(String s) {

        var length = s.length();

        char[] newString = new char[length];
        var longestString = new ArrayList<>();

        for (int i = 1; i < length; i++) {
            for (int j = i; j < length; j++) {
                s.getChars(i, j, newString, j);
                if (checkDuplicate(i, j, newString)) {
                    longestString.add(Arrays.toString(newString));
                    newString = new char[length];
                }
            }
        }
        return getLongestLength(longestString);
    }

    private static int getLongestLength(ArrayList<Object> longestString) {
        int length = 0;
        for (Object o : longestString) {
            var stringLength = o.toString().length();
            if (stringLength > length){
                length = stringLength;
            }
        }
        return length;
    }

    private static Boolean checkDuplicate(int start, int end, char[] string) {
        if (string.length > 1) {
            for (int i = 1; i < string.length; i++) {
                for (int j = i + 1; j < string.length; j++) {
                    var iString = string[i];
                    var jString = string[j];
                    if (iString == jString) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
