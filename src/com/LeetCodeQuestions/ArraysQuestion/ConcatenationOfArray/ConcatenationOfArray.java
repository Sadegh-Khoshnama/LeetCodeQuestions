package com.LeetCodeQuestions.ArraysQuestion.ConcatenationOfArray;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {

        int [] arr={1,2,1};

        System.out.println(Arrays.toString(getConcatenation(arr)));
    }



    //LeetCode 1929. Concatenation of Array
    public static int[] getConcatenation(int[] arr) {

        int n=arr.length;
        int [] ans=new int[2*n];

        for (int i=0;i<n;i++){
            ans[i]=arr[i];
            ans[i+n]=arr[i];
        }


        return ans;

    }
}
