package alexandre.thiellin.pathfinder.model;

import javax.persistence.*;

@Entity
@Table(name = "character_skills")
public class Character_skill {

    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    @ManyToOne
    @JoinColumn(name = "skill_id", nullable = false)
    private Skill skill;

    @Column(nullable = false)
    private boolean class_skill;

    @Column(nullable = false)
    private int rank;

    public Character_skill() {

    }

    public Character_skill(long id, Character character, Skill skill, boolean class_skill, int rank) {

        this.id = id;
        this.character = character;
        this.skill = skill;
        this.class_skill = class_skill;
        this.rank = rank;
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

    public Skill getSkill() {

        return skill;
    }

    public void setSkill(Skill skill) {

        this.skill = skill;
    }

    public boolean isClass_skill() {

        return class_skill;
    }

    public void setClass_skill(boolean class_skill) {

        this.class_skill = class_skill;
    }

    public int getRank() {

        return rank;
    }

    public void setRank(int rank) {

        this.rank = rank;
    }
}
