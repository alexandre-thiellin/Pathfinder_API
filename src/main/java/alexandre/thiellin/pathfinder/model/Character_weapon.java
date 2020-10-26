package alexandre.thiellin.pathfinder.model;

import javax.persistence.*;

@Entity
@Table(name = "characters_weapons")
public class Character_weapon {

    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    @ManyToOne
    @JoinColumn(name = "weapon_id", nullable = false)
    private Weapon weapon;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private boolean equipped;

    public Character_weapon() {

    }

    public Character_weapon(long id, Character character, Weapon weapon, int quantity, boolean equipped) {
        this.id = id;
        this.character = character;
        this.weapon = weapon;
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

    public Weapon getWeapon() {

        return weapon;
    }

    public void setWeapon(Weapon weapon) {

        this.weapon = weapon;
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
