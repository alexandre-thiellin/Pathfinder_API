package alexandre.thiellin.pathfinder.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "skills")
public class Skill {

    @Id
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private boolean require_training;

    @Column(nullable = false)
    private String attribute;

    @Column(nullable = false)
    private String description;

    public Skill() {

    }

    public Skill(long id, String name, boolean require_training, String attribute, String description) {

        this.id = id;
        this.name = name;
        this.require_training = require_training;
        this.attribute = attribute;
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

    public boolean isRequire_training() {

        return require_training;
    }

    public void setRequire_training(boolean require_training) {

        this.require_training = require_training;
    }

    public String getAttribute() {

        return attribute;
    }

    public void setAttribute(String attribute) {

        this.attribute = attribute;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }
}
