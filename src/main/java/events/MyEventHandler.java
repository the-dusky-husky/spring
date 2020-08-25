package events;

import org.springframework.context.event.*;
import org.springframework.stereotype.Component;

/**
 * Created by abhisheks on 22-08-2020.
 */
@Component
public class MyEventHandler {


    @EventListener
    public void listen(MyEvent event){
        System.out.println("event : "+event.getSource());
    }
}
