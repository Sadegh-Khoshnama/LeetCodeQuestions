package com.LeetCodeQuestions.ArraysQuestion.RichestCustomerWelth;

public class RichestCustomerWealth {

    public static void main(String[] args) {
        int [][] accounts={
                {2,8,7},
                {7,1,3},
                {9,1,5}
        };

        System.out.println(maximumWealth(accounts));

    }




    public static int maximumWealth(int[][] accounts) {
        int max=0;
        for (int i=0;i<accounts.length;i++){
            int sum=0;
            for (int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }

            if(sum>max){
                max=sum;
            }
        }

        return max;
    }
}
