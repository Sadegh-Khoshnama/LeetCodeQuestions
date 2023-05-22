package com.LeetCodeQuestions.ArraysQuestion;

import java.util.Arrays;

public class RunningSum {


    public static void main(String[] args) {

        int [] arr={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }



    //1480. Running Sum of 1d Array
    public static int[] runningSum(int[] nums) {
        for (int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }

        return nums;
    }
}
