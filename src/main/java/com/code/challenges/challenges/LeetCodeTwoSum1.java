package com.code.challenges.challenges;

import java.util.*;

/* Link: https://leetcode.com/problems/two-sum/description/
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

*/
public class LeetCodeTwoSum1 {

    public static void main(String[] args) {
        Map<String, int[]> results = new HashMap<>();

        results.put("example1Solution1", solution1(new int[]{2,7,11,15},9));
        results.put("example2Solution1", solution1(new int[]{3,2,4},6));
        results.put("example3Solution1", solution1(new int[]{3,3},6));

        results.put("example1Solution2", solution1(new int[]{2,7,11,15},9));
        results.put("example2Solution2", solution1(new int[]{3,2,4},6));
        results.put("example3Solution2", solution1(new int[]{3,3},6));

        results.forEach((key,result) -> {
            System.out.print(key +": ");
            Arrays.stream(result).forEach(System.out::print);
            System.out.println();
        });
    }

    public static int[] solution1(int[] nums, int target){

        Map<Integer,Integer> aux = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(aux.containsKey(target - nums[i])){
                return new int[] {aux.get(target - nums[i]), i};
            }else{
                aux.put(nums[i],i);
            }
        }
        return null;

    }

    public static int[] solution2(int[] nums, int target){

         for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if (nums[i]+nums[j] == target)
                 return new int[]{i,j};
            }
         }
         return null;

    }

}
