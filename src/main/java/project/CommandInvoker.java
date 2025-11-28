package main.java.project;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class CommandInvoker {

    // Synchronous execution
    public String executeCommand(Command command) {
        return command.execute();
    }

}
