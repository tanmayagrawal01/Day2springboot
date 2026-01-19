package com.example.day2_second.controller;

import com.example.day2_second.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class home {
    @GetMapping("/")
    public ArrayList<StudentModel> getStudent(){
        ArrayList<StudentModel> arr=new ArrayList<>();
        StudentModel student1=new StudentModel(1,"tanmay","tanmayagrawal278@gmail.com","54454584");
        StudentModel student2=new StudentModel(2,"piyush","tanmayagrawal278@gmail.com","54454584");
        StudentModel student3=new StudentModel(3,"rahul","tanmayagrawal278@gmail.com","54454584");
        StudentModel student4=new StudentModel(4,"manoj","tanmayagrawal278@gmail.com","54454584");
        StudentModel student5=new StudentModel(5,"tushar","tanmayagrawal278@gmail.com","54454584");
        arr.add(student1);
        arr.add(student2);
        arr.add(student3);
        arr.add(student4);
        arr.add(student5);
        return arr;
    }
    @GetMapping("/{id}")
    public StudentModel getstudentbyid(@PathVariable int id){
        if(id<1 || id>5) return new StudentModel(1,null,null,null);
        return getStudent().get(id-1);
    }
    public String about(){
        return "This is the about page";
    }
}