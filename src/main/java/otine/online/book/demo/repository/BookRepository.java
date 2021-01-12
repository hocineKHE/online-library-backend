package otine.online.book.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import otine.online.book.demo.entity.Book;

@CrossOrigin("*")
public interface BookRepository extends JpaRepository<Book, Long> {
}
