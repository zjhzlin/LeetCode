package com.leetcode;

/* Given two integers dividend and divisor, divide two integers without
 * using multiplication, division, and mod operator.
 *
 * Lynn Zhang
 * 2021-05-05
 *
 */

public class DivideTwoIntegers {

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) return 0;
        if (dividend == 0) return 0;

        // sign positive or negative
        int sign = 1;
        if ( (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0) ) sign = -1;
        if (divisor == 1 || divisor == -1) {
            if (dividend == Math.pow(-2,31)) {
                return (int) (sign * (Math.pow(2,31) -1));
            }
        }

        // make dividend and divisor absolute value and subtract
        int quotient = 0;

        if (dividend == Math.pow(-2,31)) {
            if (divisor < 0) {
                while (dividend <= divisor && quotient <= Math.pow(2,31) -1 ) {
                    dividend -= divisor;
                    quotient ++;
                    System.out.println(quotient);
                }
            }
            else {
                while (dividend <= - divisor && quotient <= Math.pow(2,31) -1 ) {
                    dividend += divisor;
                    quotient ++;
                }
            }
        }
        else {
            dividend = Math.abs(dividend);
            divisor = Math.abs(divisor);
            while (dividend >= divisor && quotient <= Math.pow(2, 31) - 1) {
                dividend -= divisor;
                quotient++;
            }
        }
        return sign * quotient;
    }

    public static void main(String[] args) {
        // write your code here

        int dividend = -2147483648;
        int divisor = -1;
        int quotient = divide(dividend, divisor);
        System.out.println(quotient);
    }


}
