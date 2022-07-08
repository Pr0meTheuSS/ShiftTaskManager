package nsu.tm.repo.impl;

import nsu.tm.model.Task;
import nsu.tm.repo.TaskRepository;
import org.springframework.data.*;
import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.query.*;
import java.util.Optional;
@Repository
public class TaskRepositoryImpl implements TaskRepository {
    @Override
    @Query(value="SELECT * FROM Tasks", nativeQuery = true)
    public <S extends Task> S save(S s) {
    }

    @Override
    public <S extends Task> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Task> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Task> findAll() {

    }

    @Override
    public Iterable<Task> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Task task) {

    }

    @Override
    public void deleteAll(Iterable<? extends Task> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
