package nsu.tm.model;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tasks", schema = "public")
public class Task {
    public Task() {}

    // Task's Fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "title")
    private String Title;
    @Column(name = "description")
    private String Description;
    @Column(name = "tag")
    private String Tag;
    @Column(name = "priority")
    private int Priority;
    @Column(name = "ownerid")
    private int OwnerId;

    // Getters
    public int getId() { return Id; }
    public String getTitle() {
        return this.Title;
    }
    public String getDesc() { return this.Description; }
    public String getTag() { return this.Tag; }
    public int getPriority() { return this.Priority; }
    public int getOwnerId() { return OwnerId; }


    // Setters
    public void setId(int id) { Id = id; }
    public void setOwnerId(int ownerId) { OwnerId = ownerId; }
    public void setTitle(String newTitle) {
        this.Title = newTitle;
    }
    public void setDesc(String newDescription) { this.Description = newDescription; }
    public void setTag(String newTag) { this.Tag = newTag; }
    public void setPriority(int newPriority) { this.Priority = newPriority; }
}
