package nsu.tm.model;

import org.hibernate.annotations.Columns;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@SuppressWarnings("ALL")
@Entity
@Table(appliesTo = "Tasks")
public class Task {
    // Task's Fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String _Title;
    private String _Description;
    private LocalDateTime _CreatingDateTime;
    private LocalDateTime _DeadLineDateTime;
    private String _Tag;
    private int _Priority;

    // Getters
    public String getTitle() {
        return this._Title;
    }
    public String getDesc() {
        return this._Description;
    }
    public String getTag() {
        return this._Tag;
    }
    public LocalDateTime getCreatingDateTime() {
        return this._CreatingDateTime;
    }
    public LocalDateTime getDeadLineDateTime() {
        return this._DeadLineDateTime;
    }
    public int getPriority() {
        return this._Priority;
    }

    // Setters
    public void setTitle(String newTitle) {
        this._Title = newTitle;
    }
    public void setDesc(String newDescription) {
        this._Description = newDescription;
    }
    public void setTag(String newTag) {
        this._Tag = newTag;
    }
    public void setCreatingDateTime(LocalDateTime newCreatingDateTime) {
        this._CreatingDateTime = newCreatingDateTime;
    }
    public void setDeadLineDateTime(LocalDateTime newDeadLineDateTime) {
        this._DeadLineDateTime = newDeadLineDateTime;
    }
    public void setPriority(int newPriority) {
        this._Priority = newPriority;
    }
}
