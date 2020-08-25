package models;

import aspects.Loggable;
import events.MyEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by abhisheks on 09-03-2020.
 */

public class Employee{

    private String name;
    private String city;

    @Autowired
    private Manager manager;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", manager=" + manager +
                '}';
    }

    public void init() {
        System.out.println("init method called");
    }

    public void destroy() {
        System.out.println("destroy method called");
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Loggable
    public void show(){
        System.out.println("employee display called");
    }
}
