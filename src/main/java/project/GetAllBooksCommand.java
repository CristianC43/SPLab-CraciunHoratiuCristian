package main.java.project;

import org.springframework.stereotype.Component;

@Component
public class GetAllBooksCommand implements Command {
    @Override
    public String execute() {
        return "GET all books - dummy response";
    }
}
