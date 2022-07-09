package nsu.tm.model;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
public class Task {
    // Task's Fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer Id;

    public Task() {}
    public void setId(Integer id) {
        Id = id;
    }

    public Integer getId() {
        return Id;
    }

    @Column(name = "title")
    private String _Title;

    /*
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
*/

    // Getters
    public String getTitle() {
        return this._Title;
    }
/*
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
*/

    // Setters
    public void setTitle(String newTitle) {
        this._Title = newTitle;
    }
/*
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
*/
}
