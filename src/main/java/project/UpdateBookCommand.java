package main.java.project;

import org.springframework.stereotype.Component;


@Component
public class UpdateBookCommand implements Command {
    @Override
    public String execute() {
        return "PUT update book - dummy response";
    }
}
