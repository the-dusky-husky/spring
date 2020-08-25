package events;

import org.springframework.context.ApplicationEvent;

/**
 * Created by abhisheks on 22-08-2020.
 */
public class MyEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MyEvent(Object source) {
        super(source);
    }
}
