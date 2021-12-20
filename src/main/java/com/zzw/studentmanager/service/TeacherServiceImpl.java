package com.zzw.studentmanager.service;

import com.zzw.studentmanager.mapper.TeacherMapper;
import com.zzw.studentmanager.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherMapper teacherMapper;
    @Override
    public List<Teacher> getAllTeacher() {
        return teacherMapper.getAllTeacher();
    }

    @Override
    public Teacher getTeacher(int id,String name, String password) {
        return teacherMapper.getTeacher(id,name,password);
    }

    @Override
    public int insetTeacher(Teacher teacher) {
        return teacherMapper.insetTeacher(teacher);
    }
}
