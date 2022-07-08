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

//@SuppressWarnings("ALL")
//@Entity
@javax.persistence.Entity
@javax.persistence.Table(name = "Tasks")
public class Task {
    // Task's Fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @Column(name = "Title")
    private String _Title;
    @Column(name = "Description")
    private String _Description;
    @Column(name = "CreatingDateTime")
    private LocalDateTime _CreatingDateTime;
    @Column(name = "DeadLineDateTime")
    private LocalDateTime _DeadLineDateTime;
    @Column(name = "Tag")
    private String _Tag;
    @Column(name = "Priority")
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
