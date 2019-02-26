package test.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import test.springframework.spring5webapp.Author;

public interface AuthorRepositories extends CrudRepository<Author, Long> {
}
