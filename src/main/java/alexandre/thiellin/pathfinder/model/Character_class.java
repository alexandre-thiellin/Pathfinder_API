package alexandre.thiellin.pathfinder.model;

import javax.persistence.*;

@Entity
@Table(name = "characters_classes")
public class Character_class {

    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    @ManyToOne
    @JoinColumn(name = "class_id", nullable = false)
    private Class class_;

    @Column(nullable = false)
    private int lvl;

    public Character_class() {

    }

    public Character_class(int id, Character character, Class class_, int lvl) {

        this.id = id;
        this.character = character;
        this.class_ = class_;
        this.lvl = lvl;
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

    public Class getClass_() {

        return class_;
    }

    public void setClass_(Class class_) {

        this.class_ = class_;
    }

    public int getLvl() {

        return lvl;
    }

    public void setLvl(int lvl) {

        this.lvl = lvl;
    }
}
