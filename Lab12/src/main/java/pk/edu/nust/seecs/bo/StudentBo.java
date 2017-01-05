/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.bo;

/**
 *
 * @author Jalib
 */
import java.util.ArrayList;
import javax.swing.JTextArea;

public interface StudentBo {

    public void sayHello(Integer studentId);

    public String getInfo();

    public void printCourses(JTextArea outputText);
    
    public Integer addStudents(String studentName, ArrayList<Integer> studentCourses);
    
}

