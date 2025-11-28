package main.java.project;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BooksController {

    @GetMapping
    public ResponseEntity<String> getAllBooks() {
        return ResponseEntity.ok("GET all books - dummy response");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getBookById(@PathVariable Long id) {
        return ResponseEntity.ok("GET book with id " + id + " - dummy response");
    }

    @PostMapping
    public ResponseEntity<String> createBook() {
        return ResponseEntity.ok("POST create a new book - dummy response");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateBook(@PathVariable Long id) {
        return ResponseEntity.ok("PUT update book with id " + id + " - dummy response");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Long id) {
        return ResponseEntity.ok("DELETE book with id " + id + " - dummy response");
    }
}
