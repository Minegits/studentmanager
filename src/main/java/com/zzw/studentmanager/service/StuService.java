package com.zzw.studentmanager.service;

import com.zzw.studentmanager.pojo.Student;

import java.util.List;

public interface StuService {

    public List<Student> getAllStu();
    public Student getStu(int no,String username,String password);
    public int insetStu(Student student);
    public int deleteStu(int no);
    public int updateStu(Student student);
}
