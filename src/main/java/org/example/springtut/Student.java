package org.example.springtut;

public class Student {
    String name;
    int age;
    public Student(){
        System.out.println("Student constructor");
    }
    public void studentSetters(String name,int age){
        this.name=name;
        this.age=age;
    }
    void disp()
    {
        System.out.println("displaying");
    }
}

