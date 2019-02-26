package test.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import test.springframework.spring5webapp.Book;

public interface BookRepositories extends CrudRepository<Book, Long> {
}
