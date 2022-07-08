package nsu.tm.repo;

import nsu.tm.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long>{
    Iterable<Task> findAll();
}

