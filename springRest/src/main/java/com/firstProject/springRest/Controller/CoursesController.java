package com.firstProject.springRest.Controller;

import com.firstProject.springRest.Entity.Course;
import com.firstProject.springRest.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoursesController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/home")
    public String Course(){
        return "Welcome to Courses Page";
    }


//    Getting the Course
    @GetMapping("/Courses")
    public List<Course> getCourses(){
        return this.courseService.getCourse();
    }

//    Searching and then getting the course
    @GetMapping("/Courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return this.courseService.getCourse(Long.parseLong(courseId));
    }

//    Adding the course
//    @PostMapping(value = "/Courses", consumes = "application/json")
    @PostMapping(value = "/Courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }

//    Updating the Course
    @PutMapping("/Courses")
    public Course updateCourse(@RequestBody Course course){
        return this.courseService.updateCourse(course);
    }

//    Deleting the course
    @DeleteMapping("/Courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
        try{
            this.courseService.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

