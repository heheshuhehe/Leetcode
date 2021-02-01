package com.Solution053;

public class Solution {
    public int maxSubArray (int[] nums){
        int max=nums[0], i=0, j=0, sum=max;
        for (i = 0; i< nums.length; i++){
            j=i+1;
            while (j< nums.length){
                sum+=nums[j];
            }
        }
        return max;
    }
}
