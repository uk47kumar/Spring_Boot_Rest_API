package com.example.springrest.dao;

import com.example.springrest.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long>{

}
