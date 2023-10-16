package com.example.leetcode.palindromenumber.solution;

public class Solution1 {

    public static int palindromeNumber(int number) {

        int remainder = 0;
        int reverse = 0;

        while (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        return reverse;
    }
}
