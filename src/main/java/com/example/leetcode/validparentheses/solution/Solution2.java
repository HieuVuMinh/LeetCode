package com.example.leetcode.validparentheses.solution;

import java.util.Stack;

public class Solution2 {

    public static Boolean ValidParentheses(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '}') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else stack.push(c);
        }
        return stack.isEmpty();
    }
}
