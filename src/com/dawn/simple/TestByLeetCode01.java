package com.dawn.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ltm
 */
public class TestByLeetCode01 {

    public static void main(String[] args) {

        int[] nums = new int[]{4,7,2,15,9,3};
        int target = 22;
        int[] result = twoSum(nums,target);
        System.out.println(result[0]+","+result[1]);

    }

    public static int[] twoSum(int[] nums, int target){

        Map<Integer, Integer> hashtable = new HashMap<Integer,Integer>(0);

        for (int i = 0; i<nums.length; i++){
            if (hashtable.containsKey(target - nums[i])) {
//            if(hashtable.get(target-nums[i]) != null){
                return new int[]{hashtable.get(target-nums[i]), i};
            }
            hashtable.put(nums[i],i);
        }

        return new int[0];

    }

}
