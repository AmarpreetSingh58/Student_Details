package com.amarpreetsinghprojects.newprojectmail;

import java.util.Date;

/**
 * Created by kulvi on 06/20/17.
 */

public class Student {

    String name,course,date_of_birth;
    int age;

    public Student(String name, Integer age, String date_of_birth, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.date_of_birth = date_of_birth;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }
}
