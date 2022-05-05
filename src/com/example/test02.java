package com.example;

// 짝수와 홀수
public class test02 {
    public String solution(int num) {
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
        test02 t2 = new test02();
        System.out.println(t2.solution(12));
    }
}
