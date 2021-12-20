package com.zzw.studentmanager.controller;

import com.zzw.studentmanager.pojo.Student;
import com.zzw.studentmanager.pojo.Teacher;
import com.zzw.studentmanager.service.StuServiceImpl;
import com.zzw.studentmanager.service.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class TeacherController {

    @Autowired
    StuServiceImpl stuService;
    @Autowired
    TeacherServiceImpl teacherService;

    @GetMapping("/delete/{no}")
    public String delete(@PathVariable("no") int no,Model model){
        stuService.deleteStu(no);
        model.addAttribute("stuList",stuService.getAllStu());
        return "main";
    }

    @PostMapping("/deletenos")
    public String deletenos(int[] nos,Model model){
        for (int no : nos) {
            stuService.deleteStu(no);
        }
        model.addAttribute("stuList",stuService.getAllStu());
        return "main";
    }
}
