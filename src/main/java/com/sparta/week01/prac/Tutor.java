package com.sparta.week01.prac;

public class Tutor {
    private String name;
    private int bio;


    //getter
    public String getName() {
        return this.name;
    }

    public int getBio() {
        return this.bio;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setBio(int bio) {
        this.bio = bio;
    }

    //기본 생성자
    public Tutor() {}

    // 매개변수받는 생성자
    public Tutor(String name, int bio) {
        this.name = name;
        this.bio = bio;
    }
}
