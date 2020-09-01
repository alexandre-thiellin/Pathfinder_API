package alexandre.thiellin.pathfinder.model;

import javax.persistence.*;

@Entity
@Table(name = "inventory_armors")
public class Inventory_armor {

    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    @ManyToOne
    @JoinColumn(name = "armor_id", nullable = false)
    private Armor armor;

    @Column(nullable = false)
    private boolean equipped;

    public Inventory_armor() {

    }

    public Inventory_armor(long id, Character character, Armor armor, boolean equipped) {

        this.id = id;
        this.character = character;
        this.armor = armor;
        this.equipped = equipped;
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

    public Armor getArmor() {

        return armor;
    }

    public void setArmor(Armor armor) {

        this.armor = armor;
    }

    public boolean isEquipped() {

        return equipped;
    }

    public void setEquipped(boolean equipped) {

        this.equipped = equipped;
    }
}
