package uz.nt.first_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.nt.first_spring.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
