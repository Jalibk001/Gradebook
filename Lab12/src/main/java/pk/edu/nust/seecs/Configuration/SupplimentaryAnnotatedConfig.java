/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.Configuration;

/**
 *
 * @author Jalib
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pk.edu.nust.seecs.bo.CourseBo;
import pk.edu.nust.seecs.bo.CourseBoimpl;
import pk.edu.nust.seecs.bo.StudentBo;
import pk.edu.nust.seecs.bo.StudentBoImpl;

@Configuration
@ComponentScan(basePackages={"pk.edu.nust.seecs"})
public class SupplimentaryAnnotatedConfig {

    @Bean
    public CourseBo courseManager() {
        return new CourseBoimpl();
    }
    
    @Bean
    public StudentBo studentManager() {
        return new StudentBoImpl();
    }
    
}