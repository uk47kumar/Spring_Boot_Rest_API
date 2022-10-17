package com.example.springrest.services;

import com.example.springrest.dao.CourseDao;
import com.example.springrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;
//    List<Course> list;

    public CourseServiceImpl(){
//        list = new ArrayList<>();
//        list.add(new Course(1,"java spring course","how's it is"));
//        list.add(new Course(2,"spring rest api","rate this course"));
    }

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {
        
//        Course c = null;
//        for(Course course : list){
//            if(course.getId()==courseId){
//                c=course;
//                break;
//            }
//        }
        
        return courseDao.getOne(courseId);
    }

    @Override
    public Course addCourse(Course course) {
//        list.add(course);
        courseDao.save(course);
        return course;
    }


    public Course updateCourse(Course course){
        courseDao.save(course);
        return course;
    }


    @Override
    public void deleteCourse(long courseId) {
//        Iterator<Course> iterator = list.iterator();
//        while (iterator.hasNext()){
//            Course course = iterator.next();
//            if (course.getId()==courseId){
//                iterator.remove();
//                return course;
//            }
//        }
        Course entity = courseDao.getOne(courseId);
        courseDao.delete(entity);
    }

}
