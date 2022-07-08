package nsu.tm.repo;

import nsu.tm.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TaskRepository {
    @Query(value = "select * from tasks", nativeQuery = true)
    List<Task> findAll();
};
