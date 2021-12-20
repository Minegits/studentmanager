package com.zzw.studentmanager.service;

import com.zzw.studentmanager.pojo.Teacher;

import java.util.List;

public interface TeacherService {
    public List<Teacher> getAllTeacher();
    public Teacher getTeacher(int id,String name,String password);
    public int insetTeacher(Teacher teacher);
}
