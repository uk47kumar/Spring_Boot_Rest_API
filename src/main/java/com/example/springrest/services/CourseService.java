package com.example.springrest.services;

import com.example.springrest.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();
    public Course getCourse(long courseId);
}
