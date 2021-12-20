package com.zzw.studentmanager.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer no; //学号
    private String username; //姓名
    private String college; //学院
    private String specialty; //专业
    private String grade; //年级
    private String classes; //班级
    private Integer age; //年龄

    public Student(String username, String college, String specialty, String grade, String classes,int age) {
        this.username = username;
        this.college = college;
        this.specialty = specialty;
        this.grade = grade;
        this.classes = classes;
        this.age = age;
    }
}
