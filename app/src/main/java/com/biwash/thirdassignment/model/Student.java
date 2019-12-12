package com.biwash.thirdassignment.model;

import java.io.Serializable;

public class Student implements Serializable {
    private String fullname;
    private String gender;
    private String age;
    private String address;

    public Student(String fullname, String gender, String age, String address) {
        this.fullname = fullname;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public String getFullname() {
        return fullname;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}
