package main.java.project;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final CommandInvoker invoker;
    private final GetAllBooksCommand getAllBooksCommand;
    private final GetBookByIdCommand getBookByIdCommand;
    private final CreateBookCommand createBookCommand;
    private final UpdateBookCommand updateBookCommand;
    private final DeleteBookCommand deleteBookCommand;

    public BooksController(CommandInvoker invoker,
                           GetAllBooksCommand getAllBooksCommand,
                           GetBookByIdCommand getBookByIdCommand,
                           CreateBookCommand createBookCommand,
                           UpdateBookCommand updateBookCommand,
                           DeleteBookCommand deleteBookCommand) {
        this.invoker = invoker;
        this.getAllBooksCommand = getAllBooksCommand;
        this.getBookByIdCommand = getBookByIdCommand;
        this.createBookCommand = createBookCommand;
        this.updateBookCommand = updateBookCommand;
        this.deleteBookCommand = deleteBookCommand;
    }

    @GetMapping
    public ResponseEntity<String> getAllBooks() {
        return ResponseEntity.ok(invoker.executeCommand(getAllBooksCommand));
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getBookById(@PathVariable Long id) {
        return ResponseEntity.ok(invoker.executeCommand(getBookByIdCommand));
    }

    @PostMapping
    public ResponseEntity<String> createBook() {
        return ResponseEntity.ok(invoker.executeCommand(createBookCommand));
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateBook(@PathVariable Long id) {
        return ResponseEntity.ok(invoker.executeCommand(updateBookCommand));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Long id) {
        return ResponseEntity.ok(invoker.executeCommand(deleteBookCommand));
    }
}
