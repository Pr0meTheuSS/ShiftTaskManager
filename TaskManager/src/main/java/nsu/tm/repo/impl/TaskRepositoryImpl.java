package nsu.tm.repo.impl;

import nsu.tm.model.Task;
//import nsu.tm.repo.TaskRepository;
import nsu.tm.repo.TaskRepository;
import nsu.tm.repo.mapper.TaskMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
@Service
public class TaskRepositoryImpl implements TaskRepository {
    @Override
    public List<Task> findAll() {
        JdbcTemplate template = new JdbcTemplate();
        RowMapper<Task> rowMapper = new TaskMapper();
        return template.query("SELECT * FROM Tasks",rowMapper);
    }
}
