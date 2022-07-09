package nsu.tm.repo.mapper;

import nsu.tm.model.Task;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class TaskMapper implements RowMapper<Task> {
    @Override
    public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
        Task newTask = new Task();
        newTask.setTitle(rs.getString("title"));
        return newTask;
    }
}
