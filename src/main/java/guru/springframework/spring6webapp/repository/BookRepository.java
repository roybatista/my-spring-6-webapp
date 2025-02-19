package guru.springframework.spring6webapp.repository;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookRepository,Long> {
}
