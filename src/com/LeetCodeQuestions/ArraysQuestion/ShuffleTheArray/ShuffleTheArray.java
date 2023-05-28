package com.LeetCodeQuestions.ArraysQuestion.ShuffleTheArray;

import java.util.Arrays;

public class ShuffleTheArray {

    public static void main(String[] args) {

        int [] arr={1,3,4,6,7,19,2,45};
        System.out.println(Arrays.toString(shuffle(arr, arr.length - 1)));
    }



    //1470. Shuffle the Array
    public static int[] shuffle(int[] nums, int n) {
        int [] result=new int[2*n];
        for(int i=0;i<n;i++){
            result[2*i]=nums[i];
            result[2*i+1]=nums[n+i];

        }
        return result;
    }
}
