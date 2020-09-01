package alexandre.thiellin.pathfinder.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "talents")
public class Talent {

    @Id
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String conditions;

    @Column(nullable = false)
    private String advantages;

    @Column(nullable = false)
    private String description;

    public Talent() {

    }

    public Talent(long id, String name, String conditions, String advantages, String description) {

        this.id = id;
        this.name = name;
        this.conditions = conditions;
        this.advantages = advantages;
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

    public String getConditions() {

        return conditions;
    }

    public void setConditions(String conditions) {

        this.conditions = conditions;
    }

    public String getAdvantages() {

        return advantages;
    }

    public void setAdvantages(String advantages) {

        this.advantages = advantages;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }
}
