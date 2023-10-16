package com.example.leetcode.validparentheses.solution;

public enum Operator {
    EQUAL_TO, NOT_EQUAL, GREATER_THAN, LESS_THAN, GREATER_THAN_OR_EQUAL_TO, LESS_THAN_OR_EQUAL_TO;

    public static boolean isValid(String value) {
        return Operator.valueOf(value) != null;
    }
}
