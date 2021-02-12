package com.Solution053;

public class Solution {
    public int maxSubArray (int[] nums){
        int max=nums[0],i,currentSum=nums[0];
        for (i = 1; i< nums.length; i++){
            currentSum=Math.max(currentSum+nums[i],nums[i]);
            max=Math.max(currentSum,max);
        }
        return max;
    }
}
