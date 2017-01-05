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
import javax.swing.JOptionPane;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackUserActions {

    @Pointcut("execution(* StudentBoImpl.*(..))")
    public void logAction() {
    }//pointcut name  

    @Before("logAction()")//applying pointcut on before advice  
    public void logAdvice(JoinPoint jp)//it is advice (before advice)  
    {
        JOptionPane.showMessageDialog(null,"action logged: " + jp.getSignature());
    }
}
