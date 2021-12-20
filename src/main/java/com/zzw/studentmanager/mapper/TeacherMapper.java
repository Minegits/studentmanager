package com.zzw.studentmanager.mapper;

import com.zzw.studentmanager.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TeacherMapper {
    public List<Teacher> getAllTeacher();
    public Teacher getTeacher(int id,String name,String password);
    public int insetTeacher(Teacher teacher);
}
