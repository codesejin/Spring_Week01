package com.sparta.week01.prac;

public class Prac02 {
    // 메소드 활용하기
    // 파라미터 X, 반환값 X
    public static void simplePrint() {
        System.out.println("파라미터도 없고, 반환값도 없어요!");
    }

    // 파라미터 O, 반환값 X
    public static void simpleSum(int num1, int num2) {
        System.out.println("num1 :" + num1 + ", num2: " + num2);
    }

    // 파라미터 X, 반환값 O
    public static int simpleReturn() {
        return 3;
    }

    // 파라미터 O, 반환값 O
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int substract(int num1,int num2) {
        return num1 = num2;
    }

    public static void main(String[] args) {
        simplePrint();

        simpleSum(1,2);

        int ret = simpleReturn();
        System.out.println(ret);

        int ref = sum(10, 7);
        System.out.println(ref);

        int res = substract(1, 2);
        System.out.println(res);

    }
}


