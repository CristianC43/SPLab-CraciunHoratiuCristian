package main.java.project;

import org.springframework.stereotype.Component;

@Component
public class CreateBookCommand implements Command {
    @Override
    public String execute() {
        return "POST create a new book - dummy response";
    }
}

