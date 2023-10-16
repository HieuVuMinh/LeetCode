package com.example.leetcode.palindromenumber;

import com.example.leetcode.palindromenumber.solution.Solution1;

public class PalindromeNumber {

    public static void main(String[] args) {

        int number = 0;
        System.out.println(checkPalindromeNumber(number));
    }

    private static Boolean checkPalindromeNumber(int number) {
        if (number < 0 || number == 0) {
            var reverseNumber = Solution1.palindromeNumber(number);
            return number == reverseNumber;
        }
        return false;
    }
}
