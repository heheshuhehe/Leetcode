package com.Solution015;

import com.DataStructure.ListNode;
import com.Solution021.Solution2;
import java.lang.Math.*;
import java.util.*;
import java.util.stream.IntStream;

public class Solution {
    public void start (String testCase){
        System.out.println(testCase);
        String[] stringArray = (testCase.split(","));
        int[] numArray = Arrays.stream(stringArray).mapToInt(Integer::parseInt).toArray();
        //trivial iterative solution
        List result = this.threeSum(numArray);
        System.out.println(result.toString());
    }

    //trivial iterative solution
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results =new ArrayList<>();
        nums = Arrays.stream(nums).sorted().toArray();
        System.out.println(Arrays.toString(nums));
        int k=0,pointer=nums.length-1;
        for (int i=0;i<=nums.length-3;i++){
            if (i>0 && nums[i]==nums[i-1] ) continue;
            for (int j=i+1;j<=nums.length-2;j++){
                if (  j!=i+1&&nums[j]==nums[j-1]) continue;
                for (k=pointer;k>j;k--){
                    if (k!=nums.length-1 && nums[k]==nums[k+1]) continue;
                    printInfo(i,j,k,nums);
                    if (nums[i]+nums[j]+nums[k] == 0 ){
                        List <Integer> pairs= new ArrayList<>();
                        pairs.add(nums[i]);
                        pairs.add(nums[j]);
                        pairs.add(nums[k]);
                        results.add(pairs);
                        pointer=k;
                        break;
                    }
                }
                pointer =nums.length-1;
            }
        }
        return results;
    }

    private void printInfo(int i, int j, int k, int[] nums) {
        System.out.println("i:"+i+", j:"+j+", k:"+k+
                        ", num[i]:"+nums[i]+", num[j]:"+nums[j]+", num[k]:"+nums[k]
//                        ", sum^3 is:"+(nums[i]*nums[i]*nums[i]+nums[j]*nums[j]*nums[j]+nums[k]*nums[k]*nums[k])
                        );
    }

}
