package com.spring.core.loggers;

import com.spring.core.beans.Event;

public class ConsoleEventLogger implements EventLogger {

    public void logEvent(Event event) {
        System.out.println(event);
    }
}
