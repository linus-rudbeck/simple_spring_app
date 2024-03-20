package se.distansakademin.simple_spring_app.repositories;

import org.springframework.data.repository.CrudRepository;
import se.distansakademin.simple_spring_app.models.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
