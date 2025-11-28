package main.java.project;

import org.springframework.stereotype.Component;

@Component
public class GetBookByIdCommand implements Command {
    @Override
    public String execute() {
        return "GET book with id dummy - dummy response";
    }
}
