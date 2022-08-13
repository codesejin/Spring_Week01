package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class Prac03 {
    public static void main(String[] args) {
        // 배열 반복문 연습하기
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
        System.out.println(fruits);
        // 매번 13개, 14개, 12개.. 개수 세어줘야 할까요? size사용
        for (int i=0; i<fruits.size(); i++) {
            String fruit = fruits.get(i);
            System.out.println(fruit);
        }

        List<String> celebs = new ArrayList<>();
        celebs.add("아이유");
        celebs.add("린다G");
        celebs.add("은비");
        celebs.add("금비");
        celebs.add("비");
        celebs.add("차은우");
        celebs.add("남주혁");
        celebs.add("수지");
        celebs.add("정우성");
        celebs.add("제니");
        celebs.add("정국");

        for (int idx = 0; idx < celebs.size(); idx++) {
            System.out.println(celebs.get(idx));
        }
    }
}
