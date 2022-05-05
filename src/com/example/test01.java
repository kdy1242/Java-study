package com.example;

// 평균 구하기
public class test01 {
    public double solution(int[] arr) {
        double answer = 0;
        double sum=0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        answer = sum/arr.length;
        return answer;
    }

    public static void main(String[] args) {
        test01 t1 = new test01();
        System.out.println(t1.solution(new int[]{12, 2, 3, 5}));
    }
}
