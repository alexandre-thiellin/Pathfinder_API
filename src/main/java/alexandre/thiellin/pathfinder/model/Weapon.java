package alexandre.thiellin.pathfinder.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "weapons")
public class Weapon {

    @Id
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String range_cat;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private String damage_p;

    @Column(nullable = false)
    private String damage_m;

    @Column(nullable = false)
    private String critical;

    @Column(nullable = false)
    private int range;

    @Column(nullable = false)
    private int weight;

    @Column(nullable = false)
    private String damage_type;

    @Column(nullable = false)
    private String special;

    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "weapon")
    private List<Inventory_weapon> inventory_weapons;

    public Weapon() {

    }

    public Weapon(long id, String name, String category, String range_cat, int price, String damage_p, String damage_m, String critical, int range, int weight, String damage_type, String special, String description) {

        this.id = id;
        this.name = name;
        this.category = category;
        this.range_cat = range_cat;
        this.price = price;
        this.damage_p = damage_p;
        this.damage_m = damage_m;
        this.critical = critical;
        this.range = range;
        this.weight = weight;
        this.damage_type = damage_type;
        this.special = special;
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

    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {

        this.category = category;
    }

    public String getRange_cat() {

        return range_cat;
    }

    public void setRange_cat(String range_cat) {

        this.range_cat = range_cat;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    public String getDamage_p() {

        return damage_p;
    }

    public void setDamage_p(String damage_p) {

        this.damage_p = damage_p;
    }

    public String getDamage_m() {

        return damage_m;
    }

    public void setDamage_m(String damage_m) {

        this.damage_m = damage_m;
    }

    public String getCritical() {

        return critical;
    }

    public void setCritical(String critical) {

        this.critical = critical;
    }

    public int getRange() {

        return range;
    }

    public void setRange(int range) {

        this.range = range;
    }

    public int getWeight() {

        return weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public String getDamage_type() {

        return damage_type;
    }

    public void setDamage_type(String damage_type) {

        this.damage_type = damage_type;
    }

    public String getSpecial() {

        return special;
    }

    public void setSpecial(String special) {

        this.special = special;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }
}
