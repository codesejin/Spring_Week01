package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class Prac01 {
    public static void main(String[] args) {
        // 배열 list 사용해보기
        List<String> myList = new ArrayList<>();
        String course1 = "웹개발의 봄 Spring";
        String course2 = "프론트엔드의 꽃 Recact";
        myList.add(course1); // 데이터 넣어주기
        myList.add(course2);
        System.out.println(myList);
        System.out.println(myList.get(1)); // 데이터 가져오기
        myList.remove(1); //데이터 제거하기
        System.out.println(myList);

        List<String> courseList = new ArrayList<>();
        String course01 = "웹개발 종합반";
        String course02 = "앱개발 종합반";
        courseList.add(course01);
        courseList.add(course02);
        System.out.println(courseList);
    }
}
