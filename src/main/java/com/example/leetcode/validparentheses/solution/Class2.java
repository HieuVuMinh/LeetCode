package com.example.leetcode.validparentheses.solution;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Class2 implements BaseInterface{
    @Override
    public String convertor(String s) {
        return s + " Use class2";
    }
}
