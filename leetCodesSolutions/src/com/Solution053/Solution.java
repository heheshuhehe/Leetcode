package com.Solution053;

public class Solution {
    public int maxSubArray (int[] nums){
        int max=nums[0],i,currentSum=nums[0];
        for (i = 1; i< nums.length; i++){
//            System.out.print("max is "+ max+", currentSum is "+ currentSum +", nums["+i+"] is "+ nums[i]);
            currentSum=Math.max(currentSum+nums[i],nums[i]);
            max=Math.max(currentSum,max);
//            System.out.println(", max=Math.max(max+nums[i],nums[i])is "+ max);

        }
        return max;
    }
}
