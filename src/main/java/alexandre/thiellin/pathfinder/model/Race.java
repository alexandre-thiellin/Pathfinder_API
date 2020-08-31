package alexandre.thiellin.pathfinder.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "races")
public class Race {

    @Id
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "race")
    private List<Character> characters = new ArrayList<>();

    public Race(){}

    public Race(long id, String name, String description, List<Character> characters) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.characters = characters;
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
