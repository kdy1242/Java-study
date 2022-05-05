package com.example;

// 짝수와 홀수
public class test02 {
    public static String solution(int num) {
        String answer = "";
        if(num%2==0) {
            answer="Even";
        }
        else{
            answer="Odd";
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(12));
    }
}
