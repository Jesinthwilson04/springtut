package org.example.springtut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringtutApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringtutApplication.class, args);
        ApplicationContext context= new ClassPathXmlApplicationContext("springConfig.xml");
        Student student= (Student)context.getBean("std2");
        student.disp();
        Teacher teacher=context.getBean(Teacher.class);
        System.out.println(teacher.getTeacherName());

    }

}
