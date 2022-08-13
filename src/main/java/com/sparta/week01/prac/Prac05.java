package com.sparta.week01.prac;

public class Prac05 {
    //클래스 객체 생성자 사용해보기
    public static void main(String[] args) {
//        String title = "웹개발 봄, Spring";
//        String tutor = "남병관";
//        int days = 35;
//        Course course = new Course(title, tutor, days);
//        System.out.println(course.title);
//        System.out.println(course.tutor);
//        System.out.println(course.days);
//
//        Course course2 = new Course();
//        course2.title = "프론트엔드의 꽃,React";
//        course2.tutor = "임민영";
//        System.out.println(course2.title);
//        System.out.println(course2.tutor);

        // getter, setter 사용해서 쓰기
        Course course3 = new Course();

        System.out.println(course3.getTitle());
        System.out.println(course3.getTutor());
        System.out.println(course3.getDays());

        course3.setTitle("웹개발의 봄 스프링");
        course3.setTutor("남병관");
        course3.setDays(35);

        System.out.println(course3.getTitle());
        System.out.println(course3.getTutor());
        System.out.println(course3.getDays());
    }
}
