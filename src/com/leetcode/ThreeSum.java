package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();

        if(nums == null || nums.length < 3) {
            return res;
        }

        Arrays.sort(nums);

        for(int i = 0; i <= nums.length - 3; i++) {
            if(i != 0 && nums[i] == nums[i-1]) ;
            else {
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right && right > i && left < nums.length) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum == 0) {
                        List<Integer> ans = new ArrayList<>();
                        ans.add(nums[i]);
                        ans.add(nums[left]);
                        ans.add(nums[right]);
                        if(!res.contains(ans)) res.add(ans);
                        left++;
                        right--;
                    }
                    else if (sum > 0) {
                        right--;
                        if (right + 1 < nums.length && nums[right] == nums[right+1]) right--;
                    }

                    else {
                        left++;
                        if (left - 1 > i && nums[left] == nums[left-1]) left++;
                    }
                }
            }

        }

        return res;
    }

    public static void main(String[] args) {
        // write your code here

        int[] nums = {34,55,79,28,46,33,2,48,31,-3,84,71,52,-3,93,15,21,-43,57,-6,86,56,94,74,83,-14,28,-66,46,-49,62,-11,43,65,77,12,47,61,26,1,13,29,55,-82,76,26,15,-29,36,-29,10,-70,69,17,49};

        List<List<Integer>> res = new LinkedList<>();
        res = threeSum(nums);


    }



}
