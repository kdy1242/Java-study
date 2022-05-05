package com.example;

// 평균 구하기
public class test01 {
    public static double solution(int[] arr) {
        double answer = 0;
        double sum=0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        answer = sum/arr.length;
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{12, 2, 3, 5});
    }
}
