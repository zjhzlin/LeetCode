package com.leetcode;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int exponent = digits.length;
        int digit = 0;
        boolean flag = true;
        for (int i = 0; i < exponent; i++) {
            digit += digits[i] * Math.pow(10, exponent-i-1);
            if(digits[i] != 9) flag = false;
        }
        digit += 1;
        int arrayLength = exponent;
        if (flag == true) arrayLength += 1;
        int[] result = new int[arrayLength];
        int i = 0;
        while (digit != 0) {
            result[arrayLength-1-i] = digit % 10;
            digit = digit / 10;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        // write your code here
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        int[] results = plusOne(digits);


    }

}
