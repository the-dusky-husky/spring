package config;

import aspects.LoggingAspect;
import models.Employee;
import models.Manager;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Calendar;

/**
 * Created by abhisheks on 13-06-2020.
 */
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public Employee employee(){
        return new Employee();
    }

    @Bean
    public Manager manager(){
        return new Manager();
    }

    @Bean
    public LoggingAspect loggingAspect(){
        return new LoggingAspect();
    }
}
