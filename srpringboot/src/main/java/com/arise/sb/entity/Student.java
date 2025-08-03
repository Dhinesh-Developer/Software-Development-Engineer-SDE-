package com.arise.sb.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rno;
    private String name;
    private String technology;

    public Student(int rno, String name, String technology) {
        this.rno = rno;
        this.name = name;
        this.technology = technology;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rno=" + rno +
                ", name='" + name + '\'' +
                ", technology='" + technology + '\'' +
                '}';
    }

    public Student() {
    }

    public Student(String name, String technology) {
        this.name = name;
        this.technology = technology;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
}
