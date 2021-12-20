package com.zzw.studentmanager.mapper;

import com.zzw.studentmanager.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StuMapper {
    public List<Student> getAllStu();
    public Student getStu(int no,String username,String password);
    public int insetStu(Student student);
    public int deleteStu(int no);
    public int updateStu(Student student);
}
