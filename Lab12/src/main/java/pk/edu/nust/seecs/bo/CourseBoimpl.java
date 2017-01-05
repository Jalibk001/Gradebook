/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.bo;

import org.springframework.beans.factory.annotation.Autowired;
import pk.edu.nust.seecs.gradebook.dao.CourseDao;
import pk.edu.nust.seecs.gradebook.entity.Course;
import pk.edu.nust.seecs.gradebook.entity.Student;

public class CourseBoimpl implements CourseBo {
    
    @Autowired
    CourseDao coursePersistor;

    @Override
    public Integer addNewCourse(String courseName, int creditHours) {
        Course newCourse = new Course();
        newCourse.setCourseTitle(courseName);
        newCourse.setCreditHours(creditHours);
        
        coursePersistor.addCourse(newCourse);
        return newCourse.getCourseId();
    }

}