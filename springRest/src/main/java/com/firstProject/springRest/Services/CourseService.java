package com.firstProject.springRest.Services;

import com.firstProject.springRest.Entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourse();
    public Course getCourse(long courseId);
    public Course addCourse(Course course);
    public Course updateCourse(Course course);
    public void deleteCourse(long parseLong);

}
