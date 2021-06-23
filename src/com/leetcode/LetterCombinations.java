package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    public static List<String> letterCombinations(String digits) {
        String[] phoneLetters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ArrayList<String> combinations = new ArrayList<>();
        if(digits == null || digits.length() < 1) return combinations;
        return dfs(digits, phoneLetters, combinations);
    }

    private static List<String> dfs(String digits, String[] phoneLetters, List<String> combinations) {
        // base case
        if (digits.length() == 1) {
            int num = Integer.parseInt(String.valueOf(digits.charAt(0)));
            String letters = phoneLetters[num];
            combinations = combine(combinations, letters);
        }

        while (digits.length() > 1) {
            int num = Integer.parseInt(String.valueOf(digits.charAt(0)));
            String letters = phoneLetters[num];
            List<String> comb = dfs(digits.substring(1), phoneLetters, combinations);
            combinations = combine(comb, letters);
            digits = digits.substring(1);
        }
        return combinations;
    }

    private static List<String> combine(List<String> comb, String letters){
        ArrayList<String> combinations = new ArrayList<>();
        for (int i = 0; i < letters.length(); i++) {
            if(comb.size() == 0) {
                combinations.add(letters.substring(i,i+1));
            }
            for (String letter: comb) {
                String newLetter = letters.charAt(i) + letter;
                combinations.add(newLetter);
            }
        }
        return combinations;
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> LC = letterCombinations(digits);
    }





    }
