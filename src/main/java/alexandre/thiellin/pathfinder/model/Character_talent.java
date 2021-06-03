package alexandre.thiellin.pathfinder.model;

import javax.persistence.*;

@Entity
@Table(name = "characters_talents")
public class Character_talent {

    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    @ManyToOne
    @JoinColumn(name = "talent_id", nullable = false)
    private Talent talent;

    public Character_talent() {

    }

    public Character_talent(long id, Character character, Talent talent) {

        this.id = id;
        this.character = character;
        this.talent = talent;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

//    public Character getCharacter() {
//
//        return character;
//    }

    public void setCharacter(Character character) {

        this.character = character;
    }

    public Talent getTalent() {

        return talent;
    }

    public void setTalent(Talent talent) {

        this.talent = talent;
    }
}
