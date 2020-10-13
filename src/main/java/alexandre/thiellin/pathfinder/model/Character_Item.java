package alexandre.thiellin.pathfinder.model;

import org.springframework.jmx.export.annotation.ManagedAttribute;

import javax.persistence.*;

@Entity
@Table(name = "characters_items")
public class Character_Item {

    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    @ManyToOne
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;

    @Column(nullable = false)
    private boolean equipped;

    public Character_Item() {

    }

    public Character_Item(long id, Character character, Item item, boolean equipped) {

        this.id = id;
        this.character = character;
        this.item = item;
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

    public Item getItem() {

        return item;
    }

    public void setItem(Item item) {

        this.item = item;
    }

    public boolean isEquipped() {

        return equipped;
    }

    public void setEquipped(boolean equipped) {

        this.equipped = equipped;
    }
}
