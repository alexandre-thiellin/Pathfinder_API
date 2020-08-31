package alexandre.thiellin.pathfinder.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "classes")
public class Class {

    @Id
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "class_")
    private List<Character_class> character_classes;

    public Class() {
    }

    public Class(int id, String name, String description) {

        this.id = id;
        this.name = name;
        this.description = description;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }
}
