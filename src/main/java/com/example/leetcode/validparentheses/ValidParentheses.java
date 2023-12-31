package com.example.leetcode.validparentheses;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

@Component
@RequiredArgsConstructor
public class ValidParentheses {

    public static void main(String[] args) {
        String propertyId = "abc d";
        System.out.println(propertyId);
    }

    public static Instant toInstant(String value) {
        try {
            LocalDateTime localDateTime = LocalDateTime.parse(value, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm"));
            return localDateTime.toInstant(ZoneOffset.UTC);
        } catch (Exception ex) {
            return null;
        }
    }
}
