package bpp;

import models.Employee;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

/**
 * Created by abhisheks on 22-08-2020.
 */
public class MyBPP implements BeanPostProcessor {

    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean name :"+beanName);

        if (bean instanceof Employee){

            Employee e = (Employee) bean;
            e.setName("pandu");
        }
        return bean;
    }

    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
