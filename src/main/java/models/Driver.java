package models;

import models.Employee;
import models.Manager;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by abhisheks on 09-03-2020.
 */
public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext("config", "aspects");
        Employee employee = applicationContext.getBean("employee", Employee.class);
        Manager manager = applicationContext.getBean("manager", Manager.class);

        employee.show();
        manager.show();
    }
}