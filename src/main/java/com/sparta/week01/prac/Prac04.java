package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class Prac04 {
    public static int countFruit(String fruit) {
        // 배열 list 조건문, 반복문 사용해보기 (배열안에 있는 숫자 세기)
        List<String> fruits = new ArrayList<>();
        fruits.add("감");
        fruits.add("배");
        fruits.add("감");
        fruits.add("딸기");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("딸기");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("감");

        int cnt = 0;
        for (int i = 0; i < fruits.size(); i++) {
            String f = fruits.get(i);
            if ( f == fruit) {
                cnt ++;
            }
        }return cnt;
    }
    public static void main(String[] args) {
        int gam = countFruit("감");
        int subak = countFruit("수박");
        int straw = countFruit("딸기");
        System.out.println(gam);
        System.out.println(subak);
        System.out.println(straw);
    }
}
