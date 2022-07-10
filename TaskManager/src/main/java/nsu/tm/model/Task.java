package nsu.tm.model;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tasks", schema = "public")
public class Task {
    // Task's Fields
    public Task() {}

    public Task(String title, String description, String tag, int priority) {
        this._Title = title;
        this._Description = description;
        this._Tag = tag;
        this._Priority = priority;
    }

    @Id
    private int Id;

    @Column(name = "Title")
    private String _Title;
    @Column(name = "Description")
    private String _Description;
    @Column(name = "Tagclass")
    private String _Tag;
    @Column(name = "Priority")
    private int _Priority;

    // Getters
    public int getId() { return Id; }
    public String getTitle() {
        return this._Title;
    }
    public String getDesc() { return this._Description; }
    public String getTag() { return this._Tag; }
    public int getPriority() { return this._Priority; }


    // Setters
    public void setId(int id) { Id = id; }
    public void setTitle(String newTitle) {
        this._Title = newTitle;
    }
    public void setDesc(String newDescription) { this._Description = newDescription; }
    public void setTag(String newTag) { this._Tag = newTag; }
    public void setPriority(int newPriority) { this._Priority = newPriority; }
    public String toString() {
        return String.format("[ 'Id': %d,\n" +
                        "'Title': %s,\n" +
                " 'Description': '%s',\n" +
                " Tag: '%s',\n" +
                " Priority: %d\n " +
                        "]\n",
                this.Id, this._Title,  this._Description, this._Tag, this._Priority);
    }

}
