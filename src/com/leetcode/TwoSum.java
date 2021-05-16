package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> numPair = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numPair.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numPair.containsKey(complement) && numPair.get(complement) != i) {
                result[0] = i;
                result[1] = numPair.get(complement);
            }

        }
        return result;
    }
    }

}
