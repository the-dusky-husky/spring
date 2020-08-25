package aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by abhisheks on 17-06-2020.
 */
@Aspect
public class LoggingAspect {

    @Around(value = "allshow()")
    public void applyLog(ProceedingJoinPoint proceedingJoinPoint) {
        try {


            System.out.println("this code will run before method invocation.."+proceedingJoinPoint.getSignature());
            proceedingJoinPoint.proceed();
            System.out.println("this code will run after method invocation"+proceedingJoinPoint.getSignature());
        } catch (Throwable e) {

        }
    }


    @Pointcut(value = "@annotation(aspects.Loggable)")
    public void allshow() {

    }

    @Pointcut(value = "within(models.Manager)")
    public void employee() {

    }
}
