package com.example.map3.contoller;


import com.example.map3.entities.Course;
import com.example.map3.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getCourses(){
        return this.courseService.getCourses();
    }

    @GetMapping("/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }
    @PostMapping
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }
}
/*{
        "id": 145,
        "title": "Javacore",
        "description": "This is java"
    },
 */