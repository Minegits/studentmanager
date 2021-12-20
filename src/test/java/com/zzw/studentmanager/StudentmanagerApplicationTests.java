package com.zzw.studentmanager;

import com.zzw.studentmanager.pojo.Student;
import com.zzw.studentmanager.service.StuServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentmanagerApplicationTests {

    @Autowired
    StuServiceImpl stuService;
    @Test
    void contextLoads() {
        List<Student> allStu = stuService.getAllStu();
        for (Student student : allStu) {
            System.out.println(student);
        }
    }

    @Test
    void test01(){
        Student stu = stuService.getStu(0, "20190001","20190001");
        System.out.println(stu);
    }

}
