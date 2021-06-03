package alexandre.thiellin.pathfinder.model;

import javax.persistence.*;

@Entity
@Table(name = "characters_spells")
public class Character_spell {

    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    @ManyToOne
    @JoinColumn(name = "spell_id", nullable = false)
    private Spell spell;

    public Character_spell() {

    }

    public Character_spell(long id, Character character, Spell spell) {

        this.id = id;
        this.character = character;
        this.spell = spell;
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

    public Spell getSpell() {

        return spell;
    }

    public void setSpell(Spell spell) {

        this.spell = spell;
    }
}
