package nsu.tm.repo.impl;

import nsu.tm.model.Task;
import nsu.tm.repo.TaskRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public class TaskRepositoryImpl implements TaskRepository {

    @Override
    public <S extends Task> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Task> Iterable<S> saveAll(Iterable<S> entities) {
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
        return null;
    }

    @Override
    public Iterable<Task> findAllById(Iterable<Long> longs) {
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
    public void delete(Task entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Task> entities) {

    }

    @Override
    public void deleteAll() {

    }
}