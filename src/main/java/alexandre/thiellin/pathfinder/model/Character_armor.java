package alexandre.thiellin.pathfinder.model;

import javax.persistence.*;

@Entity
@Table(name = "characters_armors")
public class Character_armor {

    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    @ManyToOne
    @JoinColumn(name = "armor_id", nullable = false)
    private Armor armor;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private boolean equipped;

    public Character_armor() {}

    public Character_armor(long id, Character character, Armor armor, int quantity, boolean equipped) {
        this.id = id;
        this.character = character;
        this.armor = armor;
        this.quantity = quantity;
        this.equipped = equipped;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public void setCharacter(Character character) {

        this.character = character;
    }

    public Armor getArmor() {

        return armor;
    }

    public void setArmor(Armor armor) {

        this.armor = armor;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isEquipped() {

        return equipped;
    }

    public void setEquipped(boolean equipped) {

        this.equipped = equipped;
    }
}
