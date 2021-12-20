package com.zzw.studentmanager.controller;


import com.zzw.studentmanager.pojo.Student;
import com.zzw.studentmanager.pojo.Teacher;
import com.zzw.studentmanager.service.StuServiceImpl;
import com.zzw.studentmanager.service.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @Autowired
    StuServiceImpl stuService;
    @Autowired
    TeacherServiceImpl teacherService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/login")
    public String login(Teacher t, Model model, HttpSession session){
        Teacher teacher = teacherService.getTeacher(0,t.getName(), t.getPassword());
        if(teacher != null){

            model.addAttribute("stuList",stuService.getAllStu());
            session.setAttribute("teacher",teacher);
            session.removeAttribute("msg");
            return "main";
        }
        model.addAttribute("msg","登录失败，账号或密码错误");
        return "index";
    }

    @PostMapping("/registerTeacher")
    public String register(Teacher teacher,Model model){
        int i = teacherService.insetTeacher(teacher);
        if(i > 0){
            return "index";
        }
        model.addAttribute("msg","注册失败");
        return "register";
    }

    @GetMapping("/Logout")
    public String logout(HttpSession session){
        if(session.getAttribute("teacher") != null){
            session.removeAttribute("teacher");
        }
        return "index";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @GetMapping("/main.html")
    public String mainhtml(){
        return "main";
    }
}
