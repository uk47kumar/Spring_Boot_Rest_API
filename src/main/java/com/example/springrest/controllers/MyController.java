package com.example.springrest.controllers;
import com.example.springrest.entities.Course;
import com.example.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @GetMapping("/home")
    public String home(){
        return "Welcome to the spring rest api";
    }

    @Autowired
    private CourseService courseService;

//    Get the course
    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseService.getCourses();
    }

//    Get one course
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public String addCourse(@RequestBody Course course){
        courseService.addCourse(course);
        return "Student added successfully";
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public String deleteCourse(@PathVariable String courseId){
        courseService.deleteCourse(Long.parseLong(courseId));
        return "Student deleted successfully";
    }

}

