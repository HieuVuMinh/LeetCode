package com.example.leetcode.validparentheses.solution;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {

    public static Boolean ValidParentheses(String s) {

        int length = s.length();
        if (length % 2 == 0) {
            int j = 1;
            Map<Character, Integer> parenthesesMap = new HashMap<>();

            for (int i = 0; i < length; i++) {
                if (!parenthesesMap.containsKey(s.charAt(i))) {
                    parenthesesMap.put(s.charAt(i), getKeyCode(s.charAt(i)));
                    j++;
                }
            }

            for (int i = 0; i < length; i++) {
                if (parenthesesMap.containsKey(s.charAt(i))) {
                    var keyCode = parenthesesMap.get(s.charAt(i));
                    if (i + 1 != keyCode) {
                        return false;
                    }
                    if (i % 2 != 0) {
                        if (keyCode % 2 != 0) {
                            return false;
                        }
                    } else {
                        if (keyCode % 2 == 0) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    private static int getKeyCode(Character s) {
        switch (s.toString()) {
            case "(":
                return 1;
            case ")":
                return 2;
            case "[":
                return 3;
            case "]":
                return 4;
            case "{":
                return 5;
            case "}":
                return 6;
            default:
                return 0;
        }
    }
}
