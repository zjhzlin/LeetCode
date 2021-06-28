package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    private static String[] dict = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        // corner case
        if (digits.length() == 0) return result;
        // depth first search
        backtrack(result, digits.toCharArray(), "");
        return result;
    }

    public static void backtrack(List<String> combos, char[] digits, String s) {
        // base case
        if (s.length() == digits.length) {
            combos.add(s);
            return;
        }
        // depth first search
        int i = s.length();
        int digit = digits[i] - '0';
        for (char letter : dict[digit].toCharArray()) {
            backtrack(combos, digits, s + Character.toString(letter));
        }
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> LC = letterCombinations(digits);
    }





    }
