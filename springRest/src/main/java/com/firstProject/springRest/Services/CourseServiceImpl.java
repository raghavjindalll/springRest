package com.firstProject.springRest.Services;



import com.firstProject.springRest.Entity.Course;
import com.firstProject.springRest.Dao.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseServiceImpl implements  CourseService {
    @Autowired
    private CourseDao courseDao;
    @Override
    public List<Course> getCourse() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {
        return courseDao.getReferenceById(courseId);
    }
    @Override
    public Course addCourse(Course course) {
        courseDao.save(course);
        return course;
    }
    @Override
    public Course updateCourse(Course course) {
        courseDao.save(course);
        return course;
    }
    @Override
    public void deleteCourse(long parseLong) {
        Course entity = courseDao.getReferenceById(parseLong);
        courseDao.delete(entity);
    }
}
