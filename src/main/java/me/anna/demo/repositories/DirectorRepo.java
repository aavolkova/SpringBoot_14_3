package me.anna.demo.repositories;


import me.anna.demo.models.Director;
import org.springframework.data.repository.CrudRepository;

public interface DirectorRepo extends CrudRepository<Director, Long> {
}
