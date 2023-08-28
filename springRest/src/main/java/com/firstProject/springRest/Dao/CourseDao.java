package com.firstProject.springRest.Dao;

import com.firstProject.springRest.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long> {

}
