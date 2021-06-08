package com.leetcode;

public class LongestSubstringWithoutRepeatingChar {

    public static int lengthOfLongestSubstring(String s) {
        // two pointers
        // one pointer i starting from beginning
        // another one start from i and continue along the string
        // if find the character that is already there break
        // update the max length
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int window = 0;      // window length
            for (int j = i + 1; j < s.length(); j++) {
                String subs = s.substring(i, j);
                int index = subs.indexOf(s.charAt(j));
                if(index != -1) {
                    window = j - i;
                    if (window > max) max = window;
                    break;
                }

            }
        }
        return max;

    }

    public static void main(String[] args) {
        String test = new String("bbbbb");
        int length = lengthOfLongestSubstring(test);
        System.out.println(length);

    }


}
