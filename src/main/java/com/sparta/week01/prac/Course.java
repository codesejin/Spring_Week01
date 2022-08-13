package com.sparta.week01.prac;

public class Course {
    // title, tutor, days 가 Course 라는 맥락 아래에서 의도가 분명히 드러나죠!
    private String title;
    private String tutor;
    private int days;

    // 기본 생성자
    public Course(){

    }

    //생성자
    private Course(String title, String tutor, int days){
        this.title = title;
        this.tutor = tutor;
        this.days = days;
    }

    // Getter : 정보를 가져오는 것
    public String getTitle() {
        return this.title;
    }
    // Getter
    public String getTutor() {
        return this.tutor;
    }
    // Getter
    public int getDays() {
        return this.days;
    }

    // Setter : 정보를 바꾸는 것
    public void setTitle(String title) {
        this.title = title;
    }
    // Setter
    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
    // Setter
    public void setDays(int days) {
        this.days = days;
    }
}