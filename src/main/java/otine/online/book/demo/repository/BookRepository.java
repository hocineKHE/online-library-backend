package otine.online.book.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import otine.online.book.demo.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
