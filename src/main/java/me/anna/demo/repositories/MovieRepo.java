package me.anna.demo.repositories;


import me.anna.demo.models.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepo extends CrudRepository<Movie, Long> {
}
