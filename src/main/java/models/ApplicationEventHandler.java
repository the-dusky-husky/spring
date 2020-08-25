package models;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by abhisheks on 13-06-2020.
 */
@Component
public class ApplicationEventHandler {


    @EventListener
    public void onContextStarted(ContextStartedEvent event){
        System.out.println("event : "+event);
    }

    @EventListener
    public void onContextShutdown(ContextStoppedEvent event){
        System.out.println("event :"+event);
    }

}
