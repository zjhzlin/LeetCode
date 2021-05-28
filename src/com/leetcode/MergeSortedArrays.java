package com.leetcode;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // use two pointers
        if (n == 0) return;
        int i = 0;
        int j = 0;
        int[] nums3 = new int[nums1.length];
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                nums3[i+j] = nums1[i++];
            }
            else if (nums1[i] > nums2[j]) {
                nums3[i+j] = nums2[j++];
            }
        }
        if (i == m) {  //add all the rest elements in nums2
            while (j < n) {
                nums3[i+j] = nums2[j++];
            }
        }
        else if (j == n) {  //add all the rest elements in nums1
            while (i < m) {
                nums3[i+j] = nums1[i++];
            }
        }
//        nums1 = Arrays.copyOf(nums3, nums3.length);  // will not mutate the original array!
        for (int k = 0; k < m+n; k++) {
            nums1[k] = nums3[k];
        }
    }

    // better version:
//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        if (n == 0)
//            return;
//
//        int i = nums1.length - 1;
//        int a = m - 1;
//        int b = n - 1;
//        while (a >= 0 && b >= 0) {
//            if (nums1[a] > nums2[b]) {
//                nums1[i--] = nums1[a--];
//            } else {
//                nums1[i--] = nums2[b--];
//            }
//        }
//
//        while (b >= 0) {
//            nums1[i--] = nums2[b--];
//        }
//    }


    public static void main(String[] args) {
        // write your code here
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
    }

}
