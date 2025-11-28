package main.java.project;

import org.springframework.stereotype.Component;


@Component
public class DeleteBookCommand implements Command {
    @Override
    public String execute() {
        return "DELETE book - dummy response";
    }
}
