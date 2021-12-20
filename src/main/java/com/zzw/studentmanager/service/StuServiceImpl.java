package com.zzw.studentmanager.service;

import com.zzw.studentmanager.mapper.StuMapper;
import com.zzw.studentmanager.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuServiceImpl implements StuService{
    @Autowired
    StuMapper stuMapper;
    @Override
    public List<Student> getAllStu() {
        return stuMapper.getAllStu();
    }

    @Override
    public Student getStu(int no,String username,String password) {
        return stuMapper.getStu(no,username,password);
    }

    @Override
    public int insetStu(Student student) {
        return stuMapper.insetStu(student);
    }

    @Override
    public int deleteStu(int no) {
        return stuMapper.deleteStu(no);
    }

    @Override
    public int updateStu(Student student) {
        return stuMapper.updateStu(student);
    }
}
