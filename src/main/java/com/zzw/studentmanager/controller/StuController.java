package com.zzw.studentmanager.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.zzw.studentmanager.mapper.StuMapper;
import com.zzw.studentmanager.pojo.Student;
import com.zzw.studentmanager.pojo.Teacher;
import com.zzw.studentmanager.service.StuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Random;

@Controller
public class StuController {
    @Autowired
    StuServiceImpl stuService;
    @GetMapping("/update/{no}")
    public String update(@PathVariable("no") int no, Model model){
        Student stu = stuService.getStu(no, null, null);
        model.addAttribute("student",stu);
        return "update";
    }

    @PostMapping("/updateStu")
    public String updateStu(Student student, Model model, HttpServletRequest request){
        stuService.updateStu(student);
        model.addAttribute("stuList",stuService.getAllStu());
        model.addAttribute("teacher",(Teacher)request.getSession().getAttribute("teacher"));
        return "main";
    }

    @GetMapping("/insert")
    public String insert(){
        return "insert";
    }

    @RequestMapping("/insertStu")
    public String insertStu(Student student, Model model){
        int newno = 20192019 + new Random().nextInt(1000);
        Student stu = stuService.getStu(newno, null, null);
        if(stu == null){
            student.setNo(newno);
        }
        stuService.insetStu(student);
        model.addAttribute("stuList",stuService.getAllStu());
        return "main";
    }
}
